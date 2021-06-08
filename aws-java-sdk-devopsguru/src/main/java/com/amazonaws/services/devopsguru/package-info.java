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
 * <p>
 * Amazon DevOps Guru is a fully managed service that helps you identify anomalous behavior in business critical
 * operational applications. You specify the AWS resources that you want DevOps Guru to cover, then the Amazon
 * CloudWatch metrics and AWS CloudTrail events related to those resources are analyzed. When anomalous behavior is
 * detected, DevOps Guru creates an <i>insight</i> that includes recommendations, related events, and related metrics
 * that can help you improve your operational applications. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html">What is Amazon DevOps Guru</a>.
 * </p>
 * <p>
 * You can specify 1 or 2 Amazon Simple Notification Service topics so you are notified every time a new insight is
 * created. You can also enable DevOps Guru to generate an OpsItem in AWS Systems Manager for each insight to help you
 * manage and track your work addressing insights.
 * </p>
 * <p>
 * To learn about the DevOps Guru workflow, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html#how-it-works">How DevOps Guru works</a>.
 * To learn about DevOps Guru concepts, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/concepts.html">Concepts in DevOps Guru</a>.
 * </p>
 */
package com.amazonaws.services.devopsguru;

