/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detective uses machine learning and purpose-built visualizations to help you to analyze and investigate security
 * issues across your Amazon Web Services (Amazon Web Services) workloads. Detective automatically extracts time-based
 * events such as login attempts, API calls, and network traffic from CloudTrail and Amazon Virtual Private Cloud
 * (Amazon VPC) flow logs. It also extracts findings detected by Amazon GuardDuty.
 * </p>
 * <p>
 * The Detective API primarily supports the creation and management of behavior graphs. A behavior graph contains the
 * extracted data from a set of member accounts, and is created and managed by an administrator account.
 * </p>
 * <p>
 * To add a member account to the behavior graph, the administrator account sends an invitation to the account. When the
 * account accepts the invitation, it becomes a member account in the behavior graph.
 * </p>
 * <p>
 * Detective is also integrated with Organizations. The organization management account designates the Detective
 * administrator account for the organization. That account becomes the administrator account for the organization
 * behavior graph. The Detective administrator account is also the delegated administrator account for Detective in
 * Organizations.
 * </p>
 * <p>
 * The Detective administrator account can enable any organization account as a member account in the organization
 * behavior graph. The organization accounts do not receive invitations. The Detective administrator account can also
 * invite other accounts to the organization behavior graph.
 * </p>
 * <p>
 * Every behavior graph is specific to a Region. You can only use the API to manage behavior graphs that belong to the
 * Region that is associated with the currently selected endpoint.
 * </p>
 * <p>
 * The administrator account for a behavior graph can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enable and disable Detective. Enabling Detective creates a new behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * View the list of member accounts in a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add member accounts to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove member accounts from a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Apply tags to a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The organization management account can use the Detective API to select the delegated administrator for Detective.
 * </p>
 * <p>
 * The Detective administrator account for an organization can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Perform all of the functions of an administrator account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Determine whether to automatically enable new organization accounts as member accounts in the organization behavior
 * graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * An invited member account can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * View the list of behavior graphs that they are invited to.
 * </p>
 * </li>
 * <li>
 * <p>
 * Accept an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Decline an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove their account from a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All API actions are logged as CloudTrail events. See <a
 * href="https://docs.aws.amazon.com/detective/latest/adminguide/logging-using-cloudtrail.html">Logging Detective API
 * Calls with CloudTrail</a>.
 * </p>
 * <note>
 * <p>
 * We replaced the term "master account" with the term "administrator account." An administrator account is used to
 * centrally manage multiple accounts. In the case of Detective, the administrator account manages the accounts in their
 * behavior graph.
 * </p>
 * </note>
 */
package com.amazonaws.services.detective;

