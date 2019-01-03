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
 * <p>
 * The AWS Budgets API enables you to use AWS Budgets to plan your service usage, service costs, and instance
 * reservations. The API reference provides descriptions, syntax, and usage examples for each of the actions and data
 * types for AWS Budgets.
 * </p>
 * <p>
 * Budgets provide you with a way to see the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * How close your plan is to your budgeted amount or to the free tier limits
 * </p>
 * </li>
 * <li>
 * <p>
 * Your usage-to-date, including how much you've used of your Reserved Instances (RIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Your current estimated charges from AWS, and how much your predicted usage will accrue in charges by the end of the
 * month
 * </p>
 * </li>
 * <li>
 * <p>
 * How much of your budget has been used
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS updates your budget status several times a day. Budgets track your unblended costs, subscriptions, refunds, and
 * RIs. You can create the following types of budgets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Cost budgets</b> - Plan how much you want to spend on a service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Usage budgets</b> - Plan how much you want to use one or more services.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>RI utilization budgets</b> - Define a utilization threshold, and receive alerts when your RI usage falls below
 * that threshold. This lets you see if your RIs are unused or under-utilized.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>RI coverage budgets</b> - Define a coverage threshold, and receive alerts when the number of your instance hours
 * that are covered by RIs fall below that threshold. This lets you see how much of your instance usage is covered by a
 * reservation.
 * </p>
 * </li>
 * </ul>
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
 * For information about costs that are associated with the AWS Budgets API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
package com.amazonaws.services.budgets;

