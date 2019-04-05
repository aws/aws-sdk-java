/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS Health</fullname>
 * <p>
 * The AWS Health API provides programmatic access to the AWS Health information that is presented in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can get information about events
 * that affect your AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEvents</a>: Summary information about events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetails</a>: Detailed information about one or more events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntities</a>: Information about AWS resources that are affected by one or more events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, these operations provide information about event types and summary counts of events or affected
 * entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventTypes</a>: Information about the kinds of events that AWS Health tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventAggregates</a>: A count of the number of events that meet specified criteria.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEntityAggregates</a>: A count of the number of affected entities that meet specified criteria.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Health API requires a Business or Enterprise support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>. Calling the Health API from an account that does not
 * have a Business or Enterprise support plan causes a <code>SubscriptionRequiredException</code>.
 * </p>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See the <a href="http://docs.aws.amazon.com/health/latest/ug/what-is-aws-health.html">AWS Health User Guide</a> for
 * information about how to use the API.
 * </p>
 * <p>
 * <b>Service Endpoint</b>
 * </p>
 * <p>
 * The HTTP endpoint for the AWS Health API is:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://health.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.health;

