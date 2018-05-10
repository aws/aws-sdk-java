/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Budgets enable you to plan your service usage, service costs, and your RI utilization. You can also track how close
 * your plan is to your budgeted amount or to the free tier limits. Budgets provide you with a quick way to see your
 * usage-to-date and current estimated charges from AWS and to see how much your predicted usage accrues in charges by
 * the end of the month. Budgets also compare current estimates and charges to the amount that you indicated you want to
 * use or spend and lets you see how much of your budget has been used. AWS updates your budget status several times a
 * day. Budgets track your unblended costs, subscriptions, and refunds. You can create the following types of budgets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cost budgets allow you to say how much you want to spend on a service.
 * </p>
 * </li>
 * <li>
 * <p>
 * Usage budgets allow you to say how many hours you want to use for one or more services.
 * </p>
 * </li>
 * <li>
 * <p>
 * RI utilization budgets allow you to define a utilization threshold and receive alerts when RIs are tracking below
 * that threshold.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can create up to 20,000 budgets per AWS master account. Your first two budgets are free of charge. Each
 * additional budget costs $0.02 per day. You can set up optional notifications that warn you if you exceed, or are
 * forecasted to exceed, your budgeted amount. You can have notifications sent to an Amazon SNS topic, to an email
 * address, or to both. For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-sns-policy.html">Creating an Amazon SNS
 * Topic for Budget Notifications</a>. AWS Free Tier usage alerts via AWS Budgets are provided for you, and do not count
 * toward your budget limits.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The AWS Budgets API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://budgets.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the AWS Budgets API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
package com.amazonaws.services.budgets;

