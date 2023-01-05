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
 * Amazon GuardDuty is a continuous security monitoring service that analyzes and processes the following data sources:
 * VPC flow logs, Amazon Web Services CloudTrail management event logs, CloudTrail S3 data event logs, EKS audit logs,
 * DNS logs, and Amazon EBS volume data. It uses threat intelligence feeds, such as lists of malicious IPs and domains,
 * and machine learning to identify unexpected, potentially unauthorized, and malicious activity within your Amazon Web
 * Services environment. This can include issues like escalations of privileges, uses of exposed credentials, or
 * communication with malicious IPs, domains, or presence of malware on your Amazon EC2 instances and container
 * workloads. For example, GuardDuty can detect compromised EC2 instances and container workloads serving malware, or
 * mining bitcoin.
 * </p>
 * <p>
 * GuardDuty also monitors Amazon Web Services account access behavior for signs of compromise, such as unauthorized
 * infrastructure deployments like EC2 instances deployed in a Region that has never been used, or unusual API calls
 * like a password policy change to reduce password strength.
 * </p>
 * <p>
 * GuardDuty informs you about the status of your Amazon Web Services environment by producing security findings that
 * you can view in the GuardDuty console or through Amazon EventBridge. For more information, see the <i> <a
 * href="https://docs.aws.amazon.com/guardduty/latest/ug/what-is-guardduty.html">Amazon GuardDuty User Guide</a> </i>.
 * </p>
 */
package com.amazonaws.services.guardduty;

