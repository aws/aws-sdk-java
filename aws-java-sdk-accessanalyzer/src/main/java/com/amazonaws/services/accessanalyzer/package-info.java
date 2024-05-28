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
 * Identity and Access Management Access Analyzer helps you to set, verify, and refine your IAM policies by providing a
 * suite of capabilities. Its features include findings for external and unused access, basic and custom policy checks
 * for validating policies, and policy generation to generate fine-grained policies. To start using IAM Access Analyzer
 * to identify external or unused access, you first need to create an analyzer.
 * </p>
 * <p>
 * <b>External access analyzers</b> help identify potential risks of accessing resources by enabling you to identify any
 * resource policies that grant access to an external principal. It does this by using logic-based reasoning to analyze
 * resource-based policies in your Amazon Web Services environment. An external principal can be another Amazon Web
 * Services account, a root user, an IAM user or role, a federated user, an Amazon Web Services service, or an anonymous
 * user. You can also use IAM Access Analyzer to preview public and cross-account access to your resources before
 * deploying permissions changes.
 * </p>
 * <p>
 * <b>Unused access analyzers</b> help identify potential identity access risks by enabling you to identify unused IAM
 * roles, unused access keys, unused console passwords, and IAM principals with unused service and action-level
 * permissions.
 * </p>
 * <p>
 * Beyond findings, IAM Access Analyzer provides basic and custom policy checks to validate IAM policies before
 * deploying permissions changes. You can use policy generation to refine permissions by attaching a policy generated
 * using access activity logged in CloudTrail logs.
 * </p>
 * <p>
 * This guide describes the IAM Access Analyzer operations that you can call programmatically. For general information
 * about IAM Access Analyzer, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html">Identity and Access Management
 * Access Analyzer</a> in the <b>IAM User Guide</b>.
 * </p>
 */
package com.amazonaws.services.accessanalyzer;

