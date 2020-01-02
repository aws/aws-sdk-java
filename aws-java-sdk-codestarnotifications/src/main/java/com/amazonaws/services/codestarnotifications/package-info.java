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

/**
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
package com.amazonaws.services.codestarnotifications;

