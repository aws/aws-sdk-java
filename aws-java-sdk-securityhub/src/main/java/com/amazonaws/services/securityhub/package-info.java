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
 * Security Hub provides you with a comprehensive view of your security state in Amazon Web Services and helps you
 * assess your Amazon Web Services environment against security industry standards and best practices.
 * </p>
 * <p>
 * Security Hub collects security data across Amazon Web Services accounts, Amazon Web Services, and supported
 * third-party products and helps you analyze your security trends and identify the highest priority security issues.
 * </p>
 * <p>
 * To help you manage the security state of your organization, Security Hub supports multiple security standards. These
 * include the Amazon Web Services Foundational Security Best Practices (FSBP) standard developed by Amazon Web
 * Services, and external compliance frameworks such as the Center for Internet Security (CIS), the Payment Card
 * Industry Data Security Standard (PCI DSS), and the National Institute of Standards and Technology (NIST). Each
 * standard includes several security controls, each of which represents a security best practice. Security Hub runs
 * checks against security controls and generates control findings to help you assess your compliance against security
 * best practices.
 * </p>
 * <p>
 * In addition to generating control findings, Security Hub also receives findings from other Amazon Web Services, such
 * as Amazon GuardDuty and Amazon Inspector, and supported third-party products. This gives you a single pane of glass
 * into a variety of security-related issues. You can also send Security Hub findings to other Amazon Web Services and
 * supported third-party products.
 * </p>
 * <p>
 * Security Hub offers automation features that help you triage and remediate security issues. For example, you can use
 * automation rules to automatically update critical findings when a security check fails. You can also leverage the
 * integration with Amazon EventBridge to trigger automatic responses to specific findings.
 * </p>
 * <p>
 * This guide, the <i>Security Hub API Reference</i>, provides information about the Security Hub API. This includes
 * supported resources, HTTP methods, parameters, and schemas. If you're new to Security Hub, you might find it helpful
 * to also review the <a href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">
 * <i>Security Hub User Guide</i> </a>. The user guide explains key concepts and provides procedures that demonstrate
 * how to use Security Hub features. It also provides information about topics such as integrating Security Hub with
 * other Amazon Web Services.
 * </p>
 * <p>
 * In addition to interacting with Security Hub by making calls to the Security Hub API, you can use a current version
 * of an Amazon Web Services command line tool or SDK. Amazon Web Services provides tools and SDKs that consist of
 * libraries and sample code for various languages and platforms, such as PowerShell, Java, Go, Python, C++, and .NET.
 * These tools and SDKs provide convenient, programmatic access to Security Hub and other Amazon Web Services . They
 * also handle tasks such as signing requests, managing errors, and retrying requests automatically. For information
 * about installing and using the Amazon Web Services tools and SDKs, see <a
 * href="http://aws.amazon.com/developer/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * <p>
 * With the exception of operations that are related to central configuration, Security Hub API requests are executed
 * only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that
 * you specify in your request. Any configuration or settings change that results from the operation is applied only to
 * that Region. To make the same change in other Regions, call the same API operation in each Region in which you want
 * to apply the change. When you use central configuration, API requests for enabling Security Hub, standards, and
 * controls are executed in the home Region and all linked Regions. For a list of central configuration operations, see
 * the <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/central-configuration-intro.html#central-configuration-concepts"
 * >Central configuration terms and concepts</a> section of the <i>Security Hub User Guide</i>.
 * </p>
 * <p>
 * The following throttling limits apply to Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1
 * request per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per
 * second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per
 * second.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.securityhub;

