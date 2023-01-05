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
 * <fullname>Amazon Web Services Support</fullname>
 * <p>
 * The <i>Amazon Web Services Support API Reference</i> is intended for programmers who need detailed information about
 * the Amazon Web Services Support operations and data types. You can use the API to manage your support cases
 * programmatically. The Amazon Web Services Support API uses HTTP methods that return results in JSON format.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business, Enterprise On-Ramp, or Enterprise Support plan to use the Amazon Web Services Support API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the Amazon Web Services Support API from an account that doesn't have a Business, Enterprise On-Ramp, or
 * Enterprise Support plan, the <code>SubscriptionRequiredException</code> error message appears. For information about
 * changing your support plan, see <a href="http://aws.amazon.com/premiumsupport/">Amazon Web Services Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * You can also use the Amazon Web Services Support API to access features for <a
 * href="http://aws.amazon.com/premiumsupport/trustedadvisor/">Trusted Advisor</a>. You can return a list of checks and
 * their descriptions, get check results, specify checks to refresh, and get the refresh status of checks.
 * </p>
 * <p>
 * You can manage your support cases with the following Amazon Web Services Support API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <a>CreateCase</a>, <a>DescribeCases</a>, <a>DescribeAttachment</a>, and <a>ResolveCase</a> operations create
 * Amazon Web Services Support cases, retrieve information about cases, and resolve cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a>DescribeCommunications</a>, <a>AddCommunicationToCase</a>, and <a>AddAttachmentsToSet</a> operations retrieve
 * and add communications and attachments to Amazon Web Services Support cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a>DescribeServices</a> and <a>DescribeSeverityLevels</a> operations return Amazon Web Service names, service
 * codes, service categories, and problem severity levels. You use these values when you call the <a>CreateCase</a>
 * operation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also use the Amazon Web Services Support API to call the Trusted Advisor operations. For more information,
 * see <a href="https://docs.aws.amazon.com/">Trusted Advisor</a> in the <i>Amazon Web Services Support User Guide</i>.
 * </p>
 * <p>
 * For authentication of requests, Amazon Web Services Support uses <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * For more information about this service and the endpoints to use, see <a
 * href="https://docs.aws.amazon.com/awssupport/latest/user/about-support-api.html">About the Amazon Web Services
 * Support API</a> in the <i>Amazon Web Services Support User Guide</i>.
 * </p>
 */
package com.amazonaws.services.support;

