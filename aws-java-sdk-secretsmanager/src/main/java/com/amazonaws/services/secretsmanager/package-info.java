/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS Secrets Manager API Reference</fullname>
 * <p>
 * AWS Secrets Manager is a web service that enables you to store, manage, and retrieve, secrets.
 * </p>
 * <p>
 * This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
 * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">AWS Secrets Manager User
 * Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (such as Java, Ruby, .NET, iOS, and Android). The SDKs provide a
 * convenient way to create programmatic access to AWS Secrets Manager. For example, the SDKs take care of
 * cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
 * the AWS SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon
 * Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to Secrets Manager. However, you also can use
 * the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn more about the
 * Secrets Manager HTTP Query API, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/query-requests.html">Making Query Requests</a> in
 * the <i>AWS Secrets Manager User Guide</i>.
 * </p>
 * <p>
 * Secrets Manager supports GET and POST requests for all actions. That is, the API doesn't require you to use GET for
 * some actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for
 * operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Support and Feedback for AWS Secrets Manager</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback
 * and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">AWS Secrets Manager Discussion
 * Forum</a>. For more information about the AWS Discussion Forums, see <a
 * href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>How examples are presented</b>
 * </p>
 * <p>
 * The JSON that AWS Secrets Manager expects as your request parameters and that the service returns as a response to
 * HTTP query requests are single, long strings without line breaks or white space formatting. The JSON shown in the
 * examples is formatted with both line breaks and white space to improve readability. When example input parameters
 * would also result in long strings that extend beyond the screen, we insert line breaks to enhance readability. You
 * should always submit the input as a single JSON text string.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS Secrets Manager supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers
 * log files to an Amazon S3 bucket. By using information that's collected by AWS CloudTrail, you can determine which
 * requests were successfully made to Secrets Manager, who made the request, when it was made, and so on. For more about
 * AWS Secrets Manager and its support for AWS CloudTrail, see <a
 * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging AWS
 * Secrets Manager Events with AWS CloudTrail</a> in the <i>AWS Secrets Manager User Guide</i>. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
package com.amazonaws.services.secretsmanager;

