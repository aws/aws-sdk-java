/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Security Hub provides you with a comprehensive view of the security state of your AWS environment and resources. It
 * also provides you with the readiness status of your environment based on controls from supported security standards.
 * Security Hub collects security data from AWS accounts, services, and integrated third-party products and helps you
 * analyze security trends in your environment to identify the highest priority security issues. For more information
 * about Security Hub, see the <i> <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a> </i>.
 * </p>
 * <p>
 * When you use operations in the Security Hub API, the requests are executed only in the AWS Region that is currently
 * active or in the specific AWS Region that you specify in your request. Any configuration or settings change that
 * results from the operation is applied only to that Region. To make the same change in other Regions, execute the same
 * command for each Region to apply the change to.
 * </p>
 * <p>
 * For example, if your Region is set to <code>us-west-2</code>, when you use <code> <a>CreateMembers</a> </code> to add
 * a member account to Security Hub, the association of the member account with the master account is created only in
 * the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the
 * invitation was sent from.
 * </p>
 * <p>
 * The following throttling limits apply to using Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <a>GetFindings</a> </code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>UpdateFindings</a> </code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5
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

