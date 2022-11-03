/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers,
 * containers, and applications running outside of AWS to obtain Temporary AWS credentials. Your workloads can use the
 * same IAM policies and roles that you have configured with native AWS applications to access AWS resources. Using IAM
 * Roles Anywhere will eliminate the need to manage long term credentials for workloads running outside of AWS.
 * </p>
 * <p>
 * To use IAM Roles Anywhere customer workloads will need to use X.509 certificates issued by their Certificate
 * Authority (CA) . The Certificate Authority (CA) needs to be registered with IAM Roles Anywhere as a trust anchor to
 * establish trust between customer PKI and IAM Roles Anywhere. Customers who do not manage their own PKI system can use
 * AWS Certificate Manager Private Certificate Authority (ACM PCA) to create a Certificate Authority and use that to
 * establish trust with IAM Roles Anywhere
 * </p>
 * <p>
 * This guide describes the IAM rolesanywhere operations that you can call programmatically. For general information
 * about IAM Roles Anywhere see <a href="https://docs.aws.amazon.com/">https://docs.aws.amazon.com/</a>
 * </p>
 */
package com.amazonaws.services.iamrolesanywhere;

