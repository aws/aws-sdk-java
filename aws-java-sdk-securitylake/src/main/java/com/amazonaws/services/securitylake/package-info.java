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
 * <note>
 * <p>
 * Amazon Security Lake is in preview release. Your use of the Security Lake preview is subject to Section 2 of the <a
 * href="http://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a>("Betas and Previews").
 * </p>
 * </note>
 * <p>
 * Amazon Security Lake is a fully managed security data lake service. You can use Security Lake to automatically
 * centralize security data from cloud, on-premises, and custom sources into a data lake that's stored in your Amazon
 * Web Servicesaccount. Amazon Web Services Organizations is an account management service that lets you consolidate
 * multiple Amazon Web Services accounts into an organization that you create and centrally manage. With Organizations,
 * you can create member accounts and invite existing accounts to join your organization. Security Lake helps you
 * analyze security data for a more complete understanding of your security posture across the entire organization. It
 * can also help you improve the protection of your workloads, applications, and data.
 * </p>
 * <p>
 * The data lake is backed by Amazon Simple Storage Service (Amazon S3) buckets, and you retain ownership over your
 * data.
 * </p>
 * <p>
 * Amazon Security Lake integrates with CloudTrail, a service that provides a record of actions taken by a user, role,
 * or an Amazon Web Services service in Security Lake CloudTrail captures API calls for Security Lake as events. The
 * calls captured include calls from the Security Lake console and code calls to the Security Lake API operations. If
 * you create a trail, you can enable continuous delivery of CloudTrail events to an Amazon S3 bucket, including events
 * for Security Lake. If you don't configure a trail, you can still view the most recent events in the CloudTrail
 * console in Event history. Using the information collected by CloudTrail you can determine the request that was made
 * to Security Lake, the IP address from which the request was made, who made the request, when it was made, and
 * additional details. To learn more about Security Lake information in CloudTrail, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/securitylake-cloudtrail.html">Amazon Security Lake
 * User Guide</a>.
 * </p>
 * <p>
 * Security Lake automates the collection of security-related log and event data from integrated Amazon Web Services and
 * third-party services. It also helps you manage the lifecycle of data with customizable retention and replication
 * settings. Security Lake converts ingested data into Apache Parquet format and a standard open-source schema called
 * the Open Cybersecurity Schema Framework (OCSF).
 * </p>
 * <p>
 * Other Amazon Web Services and third-party services can subscribe to the data that's stored in Security Lake for
 * incident response and security data analytics.
 * </p>
 */
package com.amazonaws.services.securitylake;

