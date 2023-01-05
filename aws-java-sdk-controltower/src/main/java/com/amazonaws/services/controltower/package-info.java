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
 * These interfaces allow you to apply the AWS library of pre-defined <i>controls</i> to your organizational units,
 * programmatically. In this context, controls are the same as AWS Control Tower guardrails.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>ControlARN</code> for the control--that is, the guardrail--you are targeting,
 * </p>
 * </li>
 * <li>
 * <p>
 * and the ARN associated with the target organizational unit (OU).
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>ControlARN</code> for your AWS Control Tower guardrail:</b>
 * </p>
 * <p>
 * The <code>ControlARN</code> contains the control name which is specified in each guardrail. For a list of control
 * names for <i>Strongly recommended</i> and <i>Elective</i> guardrails, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and guardrails</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/automating-tasks.html">Automating tasks section</a>
 * of the AWS Control Tower User Guide. Remember that <i>Mandatory</i> guardrails cannot be added or removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the ARN for an OU:</b>
 * </p>
 * <p>
 * In the AWS Organizations console, you can find the ARN for the OU on the <b>Organizational unit details</b> page
 * associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of resource
 * identifiers for APIs and guardrails</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/guardrail-api-examples-short.html">Guardrail API
 * examples (CLI)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with AWS
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating AWS Control Tower resources with AWS CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Control Tower supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by CloudTrail, you can determine which requests the AWS
 * Control Tower service received, who made the request and when, and so on. For more about AWS Control Tower and its
 * support for CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging AWS Control
 * Tower Actions with AWS CloudTrail</a> in the AWS Control Tower User Guide. To learn more about CloudTrail, including
 * how to turn it on and find your log files, see the AWS CloudTrail User Guide.
 * </p>
 */
package com.amazonaws.services.controltower;

