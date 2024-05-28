/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon CloudWatch Internet Monitor provides visibility into how internet issues impact the performance and
 * availability between your applications hosted on Amazon Web Services and your end users. It can reduce the time it
 * takes for you to diagnose internet issues from days to minutes. Internet Monitor uses the connectivity data that
 * Amazon Web Services captures from its global networking footprint to calculate a baseline of performance and
 * availability for internet traffic. This is the same data that Amazon Web Services uses to monitor internet uptime and
 * availability. With those measurements as a baseline, Internet Monitor raises awareness for you when there are
 * significant problems for your end users in the different geographic locations where your application runs.
 * </p>
 * <p>
 * Internet Monitor publishes internet measurements to CloudWatch Logs and CloudWatch Metrics, to easily support using
 * CloudWatch tools with health information for geographies and networks specific to your application. Internet Monitor
 * sends health events to Amazon EventBridge so that you can set up notifications. If an issue is caused by the Amazon
 * Web Services network, you also automatically receive an Amazon Web Services Health Dashboard notification with the
 * steps that Amazon Web Services is taking to mitigate the problem.
 * </p>
 * <p>
 * To use Internet Monitor, you create a <i>monitor</i> and associate your application's resources with it - VPCs, NLBs,
 * CloudFront distributions, or WorkSpaces directories - so Internet Monitor can determine where your application's
 * internet traffic is. Internet Monitor then provides internet measurements from Amazon Web Services that are specific
 * to the locations and ASNs (typically, internet service providers or ISPs) that communicate with your application.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using Amazon
 * CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
package com.amazonaws.services.internetmonitor;

