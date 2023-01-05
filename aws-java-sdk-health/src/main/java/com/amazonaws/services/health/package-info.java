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
 * <fullname>Health</fullname>
 * <p>
 * The Health API provides programmatic access to the Health information that appears in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">Personal Health Dashboard</a>. You can use the API operations to get
 * information about events that might affect your Amazon Web Services services and resources.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business, Enterprise On-Ramp, or Enterprise Support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">Amazon Web Services Support</a> to use the Health API. If you call the
 * Health API from an Amazon Web Services account that doesn't have a Business, Enterprise On-Ramp, or Enterprise
 * Support plan, you receive a <code>SubscriptionRequiredException</code> error.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can use the Health endpoint health.us-east-1.amazonaws.com (HTTPS) to call the Health API operations. Health
 * supports a multi-Region application architecture and has two regional endpoints in an active-passive configuration.
 * You can use the high availability endpoint example to determine which Amazon Web Services Region is active, so that
 * you can get the latest information from the API. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/health-api.html">Accessing the Health API</a> in the <i>Health
 * User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For authentication of requests, Health uses the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * If your Amazon Web Services account is part of Organizations, you can use the Health organizational view feature.
 * This feature provides a centralized view of Health events across all accounts in your organization. You can aggregate
 * Health events in real time to identify accounts in your organization that are affected by an operational event or get
 * notified of security vulnerabilities. Use the organizational view API operations to enable this feature and return
 * event information. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating Health events</a> in the
 * <i>Health User Guide</i>.
 * </p>
 * <note>
 * <p>
 * When you use the Health API operations to return Health events, see the following recommendations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <a
 * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html#AWSHealth-Type-Event-eventScopeCode"
 * >eventScopeCode</a> parameter to specify whether to return Health events that are public or account-specific.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use pagination to view all events from the response. For example, if you call the
 * <code>DescribeEventsForOrganization</code> operation to get all events in your organization, you might receive
 * several page results. Specify the <code>nextToken</code> in the next request to return more results.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
package com.amazonaws.services.health;

