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
package com.amazonaws.services.codestarnotifications;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codestarnotifications.model.*;

/**
 * Interface for accessing AWS CodeStar Notifications.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestarnotifications.AbstractAWSCodeStarNotifications} instead.
 * </p>
 * <p>
 * <p>
 * This AWS CodeStar Notifications API Reference provides descriptions and usage examples of the operations and data
 * types for the AWS CodeStar Notifications API. You can use the AWS CodeStar Notifications API to work with the
 * following objects:
 * </p>
 * <p>
 * Notification rules, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateNotificationRule</a>, which creates a notification rule for a resource in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteNotificationRule</a>, which deletes a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeNotificationRule</a>, which provides information about a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListNotificationRules</a>, which lists the notification rules associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateNotificationRule</a>, which changes the name, events, or targets associated with a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Subscribe</a>, which subscribes a target to a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Unsubscribe</a>, which removes a target from a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Targets, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteTarget</a>, which removes a notification rule target (SNS topic) from a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTargets</a>, which lists the targets associated with a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Events, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListEventTypes</a>, which lists the event types you can include in a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which lists the tags already associated with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which associates a tag you provide with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes a tag from a notification rule in your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Notifications, see link in the CodeStarNotifications User Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeStarNotifications {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codestar-notifications";

    /**
     * <p>
     * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the
     * targets (such as SNS topics) where you want to receive them.
     * </p>
     * 
     * @param createNotificationRuleRequest
     * @return Result of the CreateNotificationRule operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name or ID already exists. Notification rule names must be unique in your AWS
     *         account.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws LimitExceededException
     *         One of the AWS CodeStar Notifications limits has been exceeded. Limits apply to accounts, notification
     *         rules, notifications, resources, and targets. For more information, see Limits.
     * @throws ConfigurationException
     *         Some or all of the configuration is incomplete, missing, or not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @throws AccessDeniedException
     *         AWS CodeStar Notifications can't create the notification rule because you do not have sufficient
     *         permissions.
     * @sample AWSCodeStarNotifications.CreateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/CreateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNotificationRuleResult createNotificationRule(CreateNotificationRuleRequest createNotificationRuleRequest);

    /**
     * <p>
     * Deletes a notification rule for a resource.
     * </p>
     * 
     * @param deleteNotificationRuleRequest
     * @return Result of the DeleteNotificationRule operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws LimitExceededException
     *         One of the AWS CodeStar Notifications limits has been exceeded. Limits apply to accounts, notification
     *         rules, notifications, resources, and targets. For more information, see Limits.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.DeleteNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNotificationRuleResult deleteNotificationRule(DeleteNotificationRuleRequest deleteNotificationRuleRequest);

    /**
     * <p>
     * Deletes a specified target for notifications.
     * </p>
     * 
     * @param deleteTargetRequest
     * @return Result of the DeleteTarget operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.DeleteTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteTarget"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTargetResult deleteTarget(DeleteTargetRequest deleteTargetRequest);

    /**
     * <p>
     * Returns information about a specified notification rule.
     * </p>
     * 
     * @param describeNotificationRuleRequest
     * @return Result of the DescribeNotificationRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.DescribeNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DescribeNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotificationRuleResult describeNotificationRule(DescribeNotificationRuleRequest describeNotificationRuleRequest);

    /**
     * <p>
     * Returns information about the event types available for configuring notifications.
     * </p>
     * 
     * @param listEventTypesRequest
     * @return Result of the ListEventTypes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventTypesResult listEventTypes(ListEventTypesRequest listEventTypesRequest);

    /**
     * <p>
     * Returns a list of the notification rules for an AWS account.
     * </p>
     * 
     * @param listNotificationRulesRequest
     * @return Result of the ListNotificationRules operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListNotificationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotificationRulesResult listNotificationRules(ListNotificationRulesRequest listNotificationRulesRequest);

    /**
     * <p>
     * Returns a list of the tags associated with a notification rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the notification rule targets for an AWS account.
     * </p>
     * 
     * @param listTargetsRequest
     * @return Result of the ListTargets operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTargets"
     *      target="_top">AWS API Documentation</a>
     */
    ListTargetsResult listTargets(ListTargetsRequest listTargetsRequest);

    /**
     * <p>
     * Creates an association between a notification rule and an SNS topic so that the associated target can receive
     * notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param subscribeRequest
     * @return Result of the Subscribe operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @sample AWSCodeStarNotifications.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Subscribe"
     *      target="_top">AWS API Documentation</a>
     */
    SubscribeResult subscribe(SubscribeRequest subscribeRequest);

    /**
     * <p>
     * Associates a set of provided tags with a notification rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop
     * receiving notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param unsubscribeRequest
     * @return Result of the Unsubscribe operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Unsubscribe"
     *      target="_top">AWS API Documentation</a>
     */
    UnsubscribeResult unsubscribe(UnsubscribeRequest unsubscribeRequest);

    /**
     * <p>
     * Removes the association between one or more provided tags and a notification rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a notification rule for a resource. You can change the events that trigger the notification rule, the
     * status of the rule, and the targets that receive the notifications.
     * </p>
     * <note>
     * <p>
     * To add or remove tags for a notification rule, you must use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * </note>
     * 
     * @param updateNotificationRuleRequest
     * @return Result of the UpdateNotificationRule operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @sample AWSCodeStarNotifications.UpdateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UpdateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNotificationRuleResult updateNotificationRule(UpdateNotificationRuleRequest updateNotificationRuleRequest);

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
