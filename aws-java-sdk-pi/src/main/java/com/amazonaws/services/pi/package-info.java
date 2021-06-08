/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>Amazon RDS Performance Insights</fullname>
 * <p>
 * Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on
 * data captured from a running DB instance. The guide provides detailed information about Performance Insights data
 * types, parameters and errors.
 * </p>
 * <p>
 * When Performance Insights is enabled, the Amazon RDS Performance Insights API provides visibility into the
 * performance of your DB instance. Amazon CloudWatch provides the authoritative source for AWS service-vended
 * monitoring metrics. Performance Insights offers a domain-specific view of DB load.
 * </p>
 * <p>
 * DB load is measured as Average Active Sessions. Performance Insights provides the data to API consumers as a
 * two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time
 * range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point.
 * Examples include SQL, Wait event, User, and Host.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon Aurora DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html">Amazon Aurora User
 * Guide</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon RDS DB instances, go to the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Amazon RDS User Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.pi;

