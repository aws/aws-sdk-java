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
 * Amazon CloudWatch Network Monitor is an Amazon Web Services active network monitoring service that identifies if a
 * network issues exists within the Amazon Web Services network or your own company network. Within Network Monitor
 * you'll choose the source VPCs and subnets from the Amazon Web Services network in which you operate and then you'll
 * choose the destination IP addresses from your on-premises network. From these sources and destinations, Network
 * Monitor creates a monitor containing all the possible source and destination combinations, each of which is called a
 * probe, within a single monitor. These probes then monitor network traffic to help you identify where network issues
 * might be affecting your traffic.
 * </p>
 * <p>
 * Before you begin, ensure the Amazon Web Services CLI is configured in the Amazon Web Services Account where you will
 * create the Network Monitor resource. Network Monitor doesn’t support creation on cross-account resources, but you can
 * create a Network Monitor in any subnet belonging to a VPC owned by your Account.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/what-is-network-monitor.html">Using Amazon
 * CloudWatch Network Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
package com.amazonaws.services.networkmonitor;

