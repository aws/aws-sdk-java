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
package com.amazonaws.services.eventbridge;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.eventbridge.model.*;

/**
 * Interface for accessing Amazon EventBridge.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.eventbridge.AbstractAmazonEventBridge} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EventBridge helps you to respond to state changes in your AWS resources. When your resources change state,
 * they automatically send events into an event stream. You can create rules that match selected events in the stream
 * and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For
 * example, you can configure rules to:
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
 * Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
 * security or availability risks.
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon EventBridge, see the <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/userguide">Amazon EventBridge User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEventBridge {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "events";

    /**
     * <p>
     * Activates a partner event source that has been deactivated. Once activated, your matching event bus will start
     * receiving events from the event source.
     * </p>
     * 
     * @param activateEventSourceRequest
     * @return Result of the ActivateEventSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws InvalidStateException
     *         The specified state is not a valid state for an event source.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ActivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ActivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    ActivateEventSourceResult activateEventSource(ActivateEventSourceRequest activateEventSourceRequest);

    /**
     * <p>
     * Creates a new event bus within your account. This can be a custom event bus which you can use to receive events
     * from your custom applications and services, or it can be a partner event bus which can be matched to a partner
     * event source.
     * </p>
     * 
     * @param createEventBusRequest
     * @return Result of the CreateEventBus operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource you are trying to create already exists.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InvalidStateException
     *         The specified state is not a valid state for an event source.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @sample AmazonEventBridge.CreateEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEventBusResult createEventBus(CreateEventBusRequest createEventBusRequest);

    /**
     * <p>
     * Called by an SaaS partner to create a partner event source. This operation is not used by AWS customers.
     * </p>
     * <p>
     * Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS
     * account. A SaaS partner must create one partner event source for each AWS account that wants to receive those
     * event types.
     * </p>
     * <p>
     * A partner event source creates events based on resources within the SaaS partner's service or application.
     * </p>
     * <p>
     * An AWS account that creates a partner event bus that matches the partner event source can use that event bus to
     * receive events from the partner, and then process them using AWS Events rules and targets.
     * </p>
     * <p>
     * Partner event source names follow this format:
     * </p>
     * <p>
     * <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>
     * </p>
     * <p>
     * <i>partner_name</i> is determined during partner registration and identifies the partner to AWS customers.
     * <i>event_namespace</i> is determined by the partner and is a way for the partner to categorize their events.
     * <i>event_name</i> is determined by the partner, and should uniquely identify an event-generating resource within
     * the partner system. The combination of <i>event_namespace</i> and <i>event_name</i> should help AWS customers
     * decide whether to create an event bus to receive these events.
     * </p>
     * 
     * @param createPartnerEventSourceRequest
     * @return Result of the CreatePartnerEventSource operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource you are trying to create already exists.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @sample AmazonEventBridge.CreatePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreatePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePartnerEventSourceResult createPartnerEventSource(CreatePartnerEventSourceRequest createPartnerEventSourceRequest);

    /**
     * <p>
     * You can use this operation to temporarily stop receiving events from the specified partner event source. The
     * matching event bus is not deleted.
     * </p>
     * <p>
     * When you deactivate a partner event source, the source goes into PENDING state. If it remains in PENDING state
     * for more than two weeks, it is deleted.
     * </p>
     * <p>
     * To activate a deactivated partner event source, use <a>ActivateEventSource</a>.
     * </p>
     * 
     * @param deactivateEventSourceRequest
     * @return Result of the DeactivateEventSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws InvalidStateException
     *         The specified state is not a valid state for an event source.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DeactivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeactivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivateEventSourceResult deactivateEventSource(DeactivateEventSourceRequest deactivateEventSourceRequest);

    /**
     * <p>
     * Deletes the specified custom event bus or partner event bus. All rules associated with this event bus need to be
     * deleted. You can't delete your account's default event bus.
     * </p>
     * 
     * @param deleteEventBusRequest
     * @return Result of the DeleteEventBus operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonEventBridge.DeleteEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEventBusResult deleteEventBus(DeleteEventBusRequest deleteEventBusRequest);

    /**
     * <p>
     * This operation is used by SaaS partners to delete a partner event source. This operation is not used by AWS
     * customers.
     * </p>
     * <p>
     * When you delete an event source, the status of the corresponding partner event bus in the AWS customer account
     * becomes DELETED.
     * </p>
     * <p/>
     * 
     * @param deletePartnerEventSourceRequest
     * @return Result of the DeletePartnerEventSource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonEventBridge.DeletePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeletePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePartnerEventSourceResult deletePartnerEventSource(DeletePartnerEventSourceRequest deletePartnerEventSourceRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * Before you can delete the rule, you must remove all targets, using <a>RemoveTargets</a>.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time
     * for changes to take effect.
     * </p>
     * <p>
     * Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by
     * those other AWS services to support functionality in those services. You can delete these rules using the
     * <code>Force</code> option, but you should do so only if you are sure the other service is not still using that
     * rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonEventBridge.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Displays details about an event bus in your account. This can include the external AWS accounts that are
     * permitted to write events to your default event bus, and the associated policy. For custom event buses and
     * partner event buses, it displays the name, ARN, policy, state, and creation time.
     * </p>
     * <p>
     * To enable your account to receive events from other accounts on its default event bus, use <a>PutPermission</a>.
     * </p>
     * <p>
     * For more information about partner event buses, see <a>CreateEventBus</a>.
     * </p>
     * 
     * @param describeEventBusRequest
     * @return Result of the DescribeEventBus operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DescribeEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventBus" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventBusResult describeEventBus(DescribeEventBusRequest describeEventBusRequest);

    /**
     * <p>
     * This operation lists details about a partner event source that is shared with your account.
     * </p>
     * 
     * @param describeEventSourceRequest
     * @return Result of the DescribeEventSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DescribeEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest describeEventSourceRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to list details about a partner event source that they have created. AWS
     * customers do not use this operation. Instead, AWS customers can use <a>DescribeEventSource</a> to see details
     * about a partner event source that is shared with them.
     * </p>
     * 
     * @param describePartnerEventSourceRequest
     * @return Result of the DescribePartnerEventSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DescribePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePartnerEventSourceResult describePartnerEventSource(DescribePartnerEventSourceRequest describePartnerEventSourceRequest);

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * <p>
     * DescribeRule does not list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param describeRuleRequest
     * @return Result of the DescribeRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRuleResult describeRule(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events, and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of
     * time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @return Result of the DisableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    DisableRuleResult disableRule(DisableRuleRequest disableRuleRequest);

    /**
     * <p>
     * Enables the specified rule. If the rule does not exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a
     * short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @return Result of the EnableRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    EnableRuleResult enableRule(EnableRuleRequest enableRuleRequest);

    /**
     * <p>
     * Lists all the event buses in your account, including the default event bus, custom event buses, and partner event
     * buses.
     * </p>
     * 
     * @param listEventBusesRequest
     * @return Result of the ListEventBuses operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListEventBuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventBuses" target="_top">AWS API
     *      Documentation</a>
     */
    ListEventBusesResult listEventBuses(ListEventBusesRequest listEventBusesRequest);

    /**
     * <p>
     * You can use this to see all the partner event sources that have been shared with your AWS account. For more
     * information about partner event sources, see <a>CreateEventBus</a>.
     * </p>
     * 
     * @param listEventSourcesRequest
     * @return Result of the ListEventSources operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventSources" target="_top">AWS
     *      API Documentation</a>
     */
    ListEventSourcesResult listEventSources(ListEventSourcesRequest listEventSourcesRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name
     * is associated with. This operation is not used by AWS customers.
     * </p>
     * 
     * @param listPartnerEventSourceAccountsRequest
     * @return Result of the ListPartnerEventSourceAccounts operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListPartnerEventSourceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSourceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListPartnerEventSourceAccountsResult listPartnerEventSourceAccounts(ListPartnerEventSourceAccountsRequest listPartnerEventSourceAccountsRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to list all the partner event source names that they have created. This
     * operation is not used by AWS customers.
     * </p>
     * 
     * @param listPartnerEventSourcesRequest
     * @return Result of the ListPartnerEventSources operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListPartnerEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSources"
     *      target="_top">AWS API Documentation</a>
     */
    ListPartnerEventSourcesResult listPartnerEventSources(ListPartnerEventSourcesRequest listPartnerEventSourcesRequest);

    /**
     * <p>
     * Lists the rules for the specified target. You can see which of the rules in Amazon EventBridge can invoke a
     * specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @return Result of the ListRuleNamesByTarget operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonEventBridge.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRuleNamesByTarget"
     *      target="_top">AWS API Documentation</a>
     */
    ListRuleNamesByTargetResult listRuleNamesByTarget(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest);

    /**
     * <p>
     * Lists your Amazon EventBridge rules. You can either list all the rules or you can provide a prefix to match to
     * the rule names.
     * </p>
     * <p>
     * ListRules does not list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonEventBridge.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Displays the tags associated with an EventBridge resource. In EventBridge, rules and event buses can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @return Result of the ListTargetsByRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTargetsByRule" target="_top">AWS
     *      API Documentation</a>
     */
    ListTargetsByRuleResult listTargetsByRule(ListTargetsByRuleRequest listTargetsByRuleRequest);

    /**
     * <p>
     * Sends custom events to Amazon EventBridge so that they can be matched to rules.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    PutEventsResult putEvents(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * This is used by SaaS partners to write events to a customer's partner event bus. AWS customers do not use this
     * operation.
     * </p>
     * 
     * @param putPartnerEventsRequest
     * @return Result of the PutPartnerEvents operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.PutPartnerEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPartnerEvents" target="_top">AWS
     *      API Documentation</a>
     */
    PutPartnerEventsResult putPartnerEvents(PutPartnerEventsRequest putPartnerEventsRequest);

    /**
     * <p>
     * Running <code>PutPermission</code> permits the specified AWS account or AWS organization to put events to the
     * specified <i>event bus</i>. CloudWatch Events rules in your account are triggered by these events arriving to an
     * event bus in your account.
     * </p>
     * <p>
     * For another account to send events to your account, that external account must have an EventBridge rule with your
     * account's event bus as a target.
     * </p>
     * <p>
     * To enable multiple AWS accounts to put events to your event bus, run <code>PutPermission</code> once for each of
     * these accounts. Or, if all the accounts are members of the same AWS organization, you can run
     * <code>PutPermission</code> once specifying <code>Principal</code> as "*" and specifying the AWS organization ID
     * in <code>Condition</code>, to grant permissions to all accounts in that organization.
     * </p>
     * <p>
     * If you grant permissions using an organization, then accounts in that organization must specify a
     * <code>RoleArn</code> with proper permissions when they use <code>PutTarget</code> to add your account's event bus
     * as a target. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The permission policy on the default event bus cannot exceed 10 KB in size.
     * </p>
     * 
     * @param putPermissionRequest
     * @return Result of the PutPermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws PolicyLengthExceededException
     *         The event bus policy is too long. For more information, see the limits.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonEventBridge.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPermission" target="_top">AWS API
     *      Documentation</a>
     */
    PutPermissionResult putPermission(PutPermissionRequest putPermissionRequest);

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default, or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * A single rule watches for events from a single event bus. Events generated by AWS services go to your account's
     * default event bus. Events generated by SaaS partner services or applications go to the matching partner event
     * bus. If you have custom applications or services, you can specify whether their events go to your default event
     * bus or a custom event bus that you have created. For more information, see <a>CreateEventBus</a>.
     * </p>
     * <p>
     * If you are updating an existing rule, the rule is replaced with what you specify in this <code>PutRule</code>
     * command. If you omit arguments in <code>PutRule</code>, the old values for those arguments are not kept. Instead,
     * they are replaced with null values.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns are triggered when a
     * matching event is observed. Rules with ScheduleExpressions self-trigger based on the given schedule. A rule can
     * have both an EventPattern and a ScheduleExpression, in which case the rule triggers on matching events as well as
     * on a schedule.
     * </p>
     * <p>
     * When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions, by granting a user
     * permission to access or change only rules with certain tag values. To use the <code>PutRule</code> operation and
     * assign tags, you must have both the <code>events:PutRule</code> and <code>events:TagResource</code> permissions.
     * </p>
     * <p>
     * If you are updating an existing rule, any tags you specify in the <code>PutRule</code> operation are ignored. To
     * update the tags of an existing rule, use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge
     * uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event
     * patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * <p>
     * In EventBridge, it is possible to create rules that lead to infinite loops, where a rule is fired repeatedly. For
     * example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the
     * desired state. If the rule is not written carefully, the subsequent change to the ACLs fires the rule again,
     * creating an infinite loop.
     * </p>
     * <p>
     * To prevent this, write the rules so that the triggered actions do not re-fire the same rule. For example, your
     * rule could fire only if ACLs are found to be in a bad state, instead of after any change.
     * </p>
     * <p>
     * An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which
     * alerts you when charges exceed your specified limit. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html">Managing Your
     * Costs with Budgets</a>.
     * </p>
     * 
     * @param putRuleRequest
     * @return Result of the PutRule operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is not valid.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonEventBridge.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    PutRuleResult putRule(PutRuleRequest putRuleRequest);

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they are already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered.
     * </p>
     * <p>
     * You can configure the following as targets for Events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EC2 instances
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Run Command
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Automation
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Lambda functions
     * </p>
     * </li>
     * <li>
     * <p>
     * Data streams in Amazon Kinesis Data Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Data delivery streams in Amazon Kinesis Data Firehose
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ECS tasks
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Step Functions state machines
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Batch jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CodeBuild projects
     * </p>
     * </li>
     * <li>
     * <p>
     * Pipelines in AWS CodePipeline
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Inspector assessment templates
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS topics
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SQS queues, including FIFO queues
     * </p>
     * </li>
     * <li>
     * <p>
     * The default event bus of another AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Creating rules with built-in targets is supported only in the AWS Management Console. The built-in targets are
     * <code>EC2 CreateSnapshot API call</code>, <code>EC2 RebootInstances API call</code>,
     * <code>EC2 StopInstances API call</code>, and <code>EC2 TerminateInstances API call</code>.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is a Kinesis
     * data stream, you can optionally specify which shard the event goes to by using the <code>KinesisParameters</code>
     * argument. To invoke a command on multiple EC2 instances with one rule, you can use the
     * <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon CloudWatch Events needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2
     * instances, Kinesis data streams, and AWS Step Functions state machines, EventBridge relies on IAM roles that you
     * specify in the <code>RoleARN</code> argument in <code>PutTargets</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html"
     * >Authentication and Access Control</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * If another AWS account is in the same region and has granted you permission (using <code>PutPermission</code>),
     * you can send events to that account. Set that account's event bus as a target of the rules in your account. To
     * send the matched events to the other account, specify that account's event bus as the <code>Arn</code> value when
     * you run <code>PutTargets</code>. If your account sends events to another account, your account is charged for
     * each sent event. Each event sent to another account is charged as a custom event. The account receiving the event
     * is not charged. For more information, see <a href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     * Pricing</a>.
     * </p>
     * <note>
     * <p>
     * <code>Input</code>, <code>InputPath</code>, and <code>InputTransformer</code> are not available with
     * <code>PutTarget</code> if the target is an event bus of a different AWS account.
     * </p>
     * </note>
     * <p>
     * If you are setting the event bus of another account as the target, and that account granted permission to your
     * account through an organization instead of directly by the account ID, then you must specify a
     * <code>RoleArn</code> with proper permissions in the <code>Target</code> structure. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html">
     * Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * For more information about enabling cross-account events, see <a>PutPermission</a>.
     * </p>
     * <p>
     * <b>Input</b>, <b>InputPath</b>, and <b>InputTransformer</b> are mutually exclusive and optional parameters of a
     * target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, then the entire event is passed to the target in
     * JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event
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
     * When you specify <code>InputPath</code> or <code>InputTransformer</code>, you must use JSON dot notation, not
     * bracket notation.
     * </p>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param putTargetsRequest
     * @return Result of the PutTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws LimitExceededException
     *         You tried to create more rules or add more targets to a rule than is allowed.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    PutTargetsResult putTargets(PutTargetsRequest putTargetsRequest);

    /**
     * <p>
     * Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the
     * account to revoke by the <code>StatementId</code> value that you associated with the account when you granted it
     * permission with <code>PutPermission</code>. You can find the <code>StatementId</code> by using
     * <a>DescribeEventBus</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @sample AmazonEventBridge.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemovePermission" target="_top">AWS
     *      API Documentation</a>
     */
    RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow
     * a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param removeTargetsRequest
     * @return Result of the RemoveTargets operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTargetsResult removeTargets(RemoveTargetsRequest removeTargetsRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions by granting a user permission to
     * access or change only resources with certain tag values. In EventBridge, rules and event buses can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is
     * already associated with the resource, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @sample AmazonEventBridge.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs). However, EventBridge
     * uses an exact match in event patterns and rules. Be sure to use the correct ARN characters when creating event
     * patterns so that they match the ARN syntax in the event you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @return Result of the TestEventPattern operation returned by the service.
     * @throws InvalidEventPatternException
     *         The event pattern is not valid.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @sample AmazonEventBridge.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TestEventPattern" target="_top">AWS
     *      API Documentation</a>
     */
    TestEventPatternResult testEventPattern(TestEventPatternRequest testEventPatternRequest);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge resource. In CloudWatch Events, rules and event buses can
     * be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         An entity that you specified does not exist.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ConcurrentModificationException
     *         There is concurrent modification on a rule or target.
     * @throws ManagedRuleException
     *         This rule was created by an AWS service on behalf of your account. It is managed by that service. If you
     *         see this error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the
     *         <code>Force</code> parameter in those calls to delete the rule or remove targets from the rule. You
     *         cannot modify these managed rules by using <code>DisableRule</code>, <code>EnableRule</code>,
     *         <code>PutTargets</code>, <code>PutRule</code>, <code>TagResource</code>, or <code>UntagResource</code>.
     * @sample AmazonEventBridge.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
