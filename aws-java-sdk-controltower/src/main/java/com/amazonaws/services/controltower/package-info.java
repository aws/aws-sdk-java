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
 * Amazon Web Services Control Tower offers application programming interface (API) operations that support programmatic
 * interaction with these types of resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html"> <i>controls</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch.html"> <i>landing zones</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/types-of-baselines.html"> <i>baselines</i> </a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about these types of resources, see the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/what-is-control-tower.html"> <i>Amazon Web Services
 * Control Tower User Guide</i> </a>.
 * </p>
 * <p>
 * <b>About control APIs</b>
 * </p>
 * <p>
 * These interfaces allow you to apply the Amazon Web Services library of pre-defined <i>controls</i> to your
 * organizational units, programmatically. In Amazon Web Services Control Tower, the terms "control" and "guardrail" are
 * synonyms.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>controlIdentifier</code> for the control--or guardrail--you are targeting.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with the target organizational unit (OU), which we call the <code>targetIdentifier</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with a resource that you wish to tag or untag.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>controlIdentifier</code> for your Amazon Web Services Control Tower control:</b>
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is an ARN that is specified for each control. You can view the
 * <code>controlIdentifier</code> in the console on the <b>Control details</b> page, as well as in the documentation.
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is unique in each Amazon Web Services Region for each control. You can find the
 * <code>controlIdentifier</code> for each Region and control in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Tables of control
 * metadata</a> or the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability by
 * Region tables</a> in the <i>Amazon Web Services Control Tower User Guide.</i>
 * </p>
 * <p>
 * A quick-reference list of control identifers for the Amazon Web Services Control Tower legacy <i>Strongly
 * recommended</i> and <i>Elective</i> controls is given in <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and controls</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">Controls reference guide
 * section</a> of the <i>Amazon Web Services Control Tower User Guide</i>. Remember that <i>Mandatory</i> controls
 * cannot be added or removed.
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
 * <b>To get the <code>targetIdentifier</code>:</b>
 * </p>
 * <p>
 * The <code>targetIdentifier</code> is the ARN for an OU.
 * </p>
 * <p>
 * In the Amazon Web Services Organizations console, you can find the ARN for the OU on the <b>Organizational unit
 * details</b> page associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p>
 * <b> About landing zone APIs</b>
 * </p>
 * <p>
 * You can configure and launch an Amazon Web Services Control Tower landing zone with APIs. For an introduction and
 * steps, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/getting-started-apis.html">Getting
 * started with Amazon Web Services Control Tower using APIs</a>.
 * </p>
 * <p>
 * For an overview of landing zone API operations, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2023-all.html#landing-zone-apis"> Amazon Web Services
 * Control Tower supports landing zone APIs</a>. The individual API operations for landing zones are detailed in this
 * document, the <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API
 * reference manual</a>, in the "Actions" section.
 * </p>
 * <p>
 * <b>About baseline APIs</b>
 * </p>
 * <p>
 * You can apply the <code>AWSControlTowerBaseline</code> baseline to an organizational unit (OU) as a way to register
 * the OU with Amazon Web Services Control Tower, programmatically. For a general overview of this capability, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2024-all.html#baseline-apis">Amazon Web Services
 * Control Tower supports APIs for OU registration and configuration with baselines</a>.
 * </p>
 * <p>
 * You can call the baseline API operations to view the baselines that Amazon Web Services Control Tower enables for
 * your landing zone, on your behalf, when setting up the landing zone. These baselines are read-only baselines.
 * </p>
 * <p>
 * The individual API operations for baselines are detailed in this document, the <a
 * href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API reference manual</a>, in
 * the "Actions" section. For usage examples, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>.
 * </p>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html">Control API input
 * and output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-apis-cfn-setup.html">Launch a landing zone with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Control metadata
 * tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability
 * by Region tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of identifiers for
 * legacy controls</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html">Controls reference guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls-reference.html">Controls library
 * groupings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating Amazon Web Services Control Tower resources with Amazon Web Services CloudFormation</a>
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
 * Amazon Web Services Control Tower supports Amazon Web Services CloudTrail, a service that records Amazon Web Services
 * API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using information
 * collected by CloudTrail, you can determine which requests the Amazon Web Services Control Tower service received, who
 * made the request and when, and so on. For more about Amazon Web Services Control Tower and its support for
 * CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging Amazon Web
 * Services Control Tower Actions with Amazon Web Services CloudTrail</a> in the Amazon Web Services Control Tower User
 * Guide. To learn more about CloudTrail, including how to turn it on and find your log files, see the Amazon Web
 * Services CloudTrail User Guide.
 * </p>
 */
package com.amazonaws.services.controltower;

