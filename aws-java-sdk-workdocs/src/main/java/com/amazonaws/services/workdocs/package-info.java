/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The WorkDocs API is designed for the following use cases:
 * </p>
 * <ul>
 * <li>
 * <p>
 * File Migration: File migration applications are supported for users who want to migrate their files from an
 * on-premise or off-premise file system or service. Users can insert files into a user directory structure, as well as
 * allow for basic metadata changes, such as modifications to the permissions of files.
 * </p>
 * </li>
 * <li>
 * <p>
 * Security: Support security applications are supported for users who have additional security needs, such as
 * anti-virus or data loss prevention. The APIs, in conjunction with Amazon CloudTrail, allow these applications to
 * detect when changes occur in Amazon WorkDocs, so the application can take the necessary actions and replace the
 * target file. The application can also choose to email the user if the target file violates the policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * eDiscovery/Analytics: General administrative applications are supported, such as eDiscovery and analytics. These
 * applications can choose to mimic and/or record the actions in an Amazon WorkDocs site, in conjunction with Amazon
 * CloudTrails, to replicate data for eDiscovery, backup, or analytical applications.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All Amazon WorkDocs APIs are Amazon authenticated, certificate-signed APIs. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of IAM users and roles to help facilitate access, trust, and permission
 * policies. By creating a role and allowing an IAM user to access the Amazon WorkDocs site, the IAM user gains full
 * administrative visibility into the entire Amazon WorkDocs site (or as set in the IAM policy). This includes, but is
 * not limited to, the ability to modify file permissions and upload any file to any user. This allows developers to
 * perform the three use cases above, as well as give users the ability to grant access on a selective basis using the
 * IAM model.
 * </p>
 */
package com.amazonaws.services.workdocs;

