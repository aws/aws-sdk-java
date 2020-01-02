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

import com.amazonaws.services.codestarnotifications.model.*;

/**
 * Interface for accessing AWS CodeStar Notifications asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestarnotifications.AbstractAWSCodeStarNotificationsAsync} instead.
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
public interface AWSCodeStarNotificationsAsync extends AWSCodeStarNotifications {

    /**
     * <p>
     * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the
     * targets (such as SNS topics) where you want to receive them.
     * </p>
     * 
     * @param createNotificationRuleRequest
     * @return A Java Future containing the result of the CreateNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.CreateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/CreateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(CreateNotificationRuleRequest createNotificationRuleRequest);

    /**
     * <p>
     * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the
     * targets (such as SNS topics) where you want to receive them.
     * </p>
     * 
     * @param createNotificationRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.CreateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/CreateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(CreateNotificationRuleRequest createNotificationRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationRuleRequest, CreateNotificationRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a notification rule for a resource.
     * </p>
     * 
     * @param deleteNotificationRuleRequest
     * @return A Java Future containing the result of the DeleteNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.DeleteNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(DeleteNotificationRuleRequest deleteNotificationRuleRequest);

    /**
     * <p>
     * Deletes a notification rule for a resource.
     * </p>
     * 
     * @param deleteNotificationRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.DeleteNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(DeleteNotificationRuleRequest deleteNotificationRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationRuleRequest, DeleteNotificationRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified target for notifications.
     * </p>
     * 
     * @param deleteTargetRequest
     * @return A Java Future containing the result of the DeleteTarget operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.DeleteTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(DeleteTargetRequest deleteTargetRequest);

    /**
     * <p>
     * Deletes a specified target for notifications.
     * </p>
     * 
     * @param deleteTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTarget operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.DeleteTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(DeleteTargetRequest deleteTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetRequest, DeleteTargetResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified notification rule.
     * </p>
     * 
     * @param describeNotificationRuleRequest
     * @return A Java Future containing the result of the DescribeNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.DescribeNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DescribeNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(DescribeNotificationRuleRequest describeNotificationRuleRequest);

    /**
     * <p>
     * Returns information about a specified notification rule.
     * </p>
     * 
     * @param describeNotificationRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.DescribeNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DescribeNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(DescribeNotificationRuleRequest describeNotificationRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationRuleRequest, DescribeNotificationRuleResult> asyncHandler);

    /**
     * <p>
     * Returns information about the event types available for configuring notifications.
     * </p>
     * 
     * @param listEventTypesRequest
     * @return A Java Future containing the result of the ListEventTypes operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.ListEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(ListEventTypesRequest listEventTypesRequest);

    /**
     * <p>
     * Returns information about the event types available for configuring notifications.
     * </p>
     * 
     * @param listEventTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventTypes operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.ListEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(ListEventTypesRequest listEventTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventTypesRequest, ListEventTypesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the notification rules for an AWS account.
     * </p>
     * 
     * @param listNotificationRulesRequest
     * @return A Java Future containing the result of the ListNotificationRules operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.ListNotificationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(ListNotificationRulesRequest listNotificationRulesRequest);

    /**
     * <p>
     * Returns a list of the notification rules for an AWS account.
     * </p>
     * 
     * @param listNotificationRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotificationRules operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.ListNotificationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(ListNotificationRulesRequest listNotificationRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationRulesRequest, ListNotificationRulesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags associated with a notification rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags associated with a notification rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the notification rule targets for an AWS account.
     * </p>
     * 
     * @param listTargetsRequest
     * @return A Java Future containing the result of the ListTargets operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest listTargetsRequest);

    /**
     * <p>
     * Returns a list of the notification rule targets for an AWS account.
     * </p>
     * 
     * @param listTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargets operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest listTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsRequest, ListTargetsResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a notification rule and an SNS topic so that the associated target can receive
     * notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param subscribeRequest
     * @return A Java Future containing the result of the Subscribe operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Subscribe"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest);

    /**
     * <p>
     * Creates an association between a notification rule and an SNS topic so that the associated target can receive
     * notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param subscribeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Subscribe operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Subscribe"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest subscribeRequest,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler);

    /**
     * <p>
     * Associates a set of provided tags with a notification rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of provided tags with a notification rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop
     * receiving notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param unsubscribeRequest
     * @return A Java Future containing the result of the Unsubscribe operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Unsubscribe"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest);

    /**
     * <p>
     * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop
     * receiving notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param unsubscribeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Unsubscribe operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Unsubscribe"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest unsubscribeRequest,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler);

    /**
     * <p>
     * Removes the association between one or more provided tags and a notification rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association between one or more provided tags and a notification rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsync.UpdateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UpdateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(UpdateNotificationRuleRequest updateNotificationRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotificationRule operation returned by the service.
     * @sample AWSCodeStarNotificationsAsyncHandler.UpdateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UpdateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(UpdateNotificationRuleRequest updateNotificationRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationRuleRequest, UpdateNotificationRuleResult> asyncHandler);

}
