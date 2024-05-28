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
 * Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers, containers,
 * and applications that run outside of Amazon Web Services to obtain temporary Amazon Web Services credentials. Your
 * workloads can use the same IAM policies and roles you have for native Amazon Web Services applications to access
 * Amazon Web Services resources. Using IAM Roles Anywhere eliminates the need to manage long-term credentials for
 * workloads running outside of Amazon Web Services.
 * </p>
 * <p>
 * To use IAM Roles Anywhere, your workloads must use X.509 certificates issued by their certificate authority (CA). You
 * register the CA with IAM Roles Anywhere as a trust anchor to establish trust between your public key infrastructure
 * (PKI) and IAM Roles Anywhere. If you don't manage your own PKI system, you can use Private Certificate Authority to
 * create a CA and then use that to establish trust with IAM Roles Anywhere.
 * </p>
 * <p>
 * This guide describes the IAM Roles Anywhere operations that you can call programmatically. For more information about
 * IAM Roles Anywhere, see the <a
 * href="https://docs.aws.amazon.com/rolesanywhere/latest/userguide/introduction.html">IAM Roles Anywhere User
 * Guide</a>.
 * </p>
 */
package com.amazonaws.services.iamrolesanywhere;

