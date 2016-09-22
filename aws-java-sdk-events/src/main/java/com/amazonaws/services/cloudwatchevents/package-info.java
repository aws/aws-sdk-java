/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon CloudWatch Events helps you to respond to state changes in your AWS resources. When your resources change
 * state they automatically send events into an event stream. You can create rules that match selected events in the
 * stream and route them to targets to take action. You can also use rules to take action on a pre-determined schedule.
 * For example, you can configure rules to:
 * </p>
 * <ul>
 * <li>Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2
 * instance enters the running state.</li>
 * <li>Direct specific API records from CloudTrail to an Amazon Kinesis stream for detailed analysis of potential
 * security or availability risks.</li>
 * <li>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</li>
 * </ul>
 * <p>
 * For more information about Amazon CloudWatch Events features, see the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide">Amazon CloudWatch Developer Guide</a>.
 * </p>
 */
package com.amazonaws.services.cloudwatchevents;

