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
 * AWS Performance Insights enables you to monitor and explore different dimensions of database load based on data
 * captured from a running RDS instance. The guide provides detailed information about Performance Insights data types,
 * parameters and errors. For more information about Performance Insights capabilities see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon RDS Performance
 * Insights </a> in the <i>Amazon RDS User Guide</i>.
 * </p>
 * <p>
 * The AWS Performance Insights API provides visibility into the performance of your RDS instance, when Performance
 * Insights is enabled for supported engine types. While Amazon CloudWatch provides the authoritative source for AWS
 * service vended monitoring metrics, AWS Performance Insights offers a domain-specific view of database load measured
 * as Average Active Sessions and provided to API consumers as a 2-dimensional time-series dataset. The time dimension
 * of the data provides DB load data for each time point in the queried time range, and each time point decomposes
 * overall load in relation to the requested dimensions, such as SQL, Wait-event, User or Host, measured at that time
 * point.
 * </p>
 */
package com.amazonaws.services.pi;

