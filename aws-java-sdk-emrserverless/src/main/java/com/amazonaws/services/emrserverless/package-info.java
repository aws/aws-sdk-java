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
 * Amazon EMR Serverless is a new deployment option for Amazon EMR. EMR Serverless provides a serverless runtime
 * environment that simplifies running analytics applications using the latest open source frameworks such as Apache
 * Spark and Apache Hive. With EMR Serverless, you don’t have to configure, optimize, secure, or operate clusters to run
 * applications with these frameworks.
 * </p>
 * <p>
 * The API reference to Amazon EMR Serverless is <code>emr-serverless</code>. The <code>emr-serverless</code> prefix is
 * used in the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR Serverless. For example,
 * <code>aws emr-serverless start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR Serverless. For example,
 * <code>"Action": ["emr-serverless:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR Serverless</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR Serverless service endpoints. For example,
 * <code>emr-serverless.us-east-2.amazonaws.com</code>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.emrserverless;

