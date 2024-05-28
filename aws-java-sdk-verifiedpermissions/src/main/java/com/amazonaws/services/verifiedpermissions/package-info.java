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
 * Amazon Verified Permissions is a permissions management service from Amazon Web Services. You can use Verified
 * Permissions to manage permissions for your application, and authorize user access based on those permissions. Using
 * Verified Permissions, application developers can grant access based on information about the users, resources, and
 * requested actions. You can also evaluate additional information like group membership, attributes of the resources,
 * and session context, such as time of request and IP addresses. Verified Permissions manages these permissions by
 * letting you create and store authorization policies for your applications, such as consumer-facing web sites and
 * enterprise business systems.
 * </p>
 * <p>
 * Verified Permissions uses Cedar as the policy language to express your permission requirements. Cedar supports both
 * role-based access control (RBAC) and attribute-based access control (ABAC) authorization models.
 * </p>
 * <p>
 * For more information about configuring, administering, and using Amazon Verified Permissions in your applications,
 * see the <a href="https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/">Amazon Verified Permissions User
 * Guide</a>.
 * </p>
 * <p>
 * For more information about the Cedar policy language, see the <a href="https://docs.cedarpolicy.com/">Cedar Policy
 * Language Guide</a>.
 * </p>
 * <important>
 * <p>
 * When you write Cedar policies that reference principals, resources and actions, you can define the unique identifiers
 * used for each of those elements. We strongly recommend that you follow these best practices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Use values like universally unique identifiers (UUIDs) for all principal and resource identifiers.</b>
 * </p>
 * <p>
 * For example, if user <code>jane</code> leaves the company, and you later let someone else use the name
 * <code>jane</code>, then that new user automatically gets access to everything granted by policies that still
 * reference <code>User::"jane"</code>. Cedar can’t distinguish between the new user and the old. This applies to both
 * principal and resource identifiers. Always use identifiers that are guaranteed unique and never reused to ensure that
 * you don’t unintentionally grant access because of the presence of an old identifier in a policy.
 * </p>
 * <p>
 * Where you use a UUID for an entity, we recommend that you follow it with the // comment specifier and the ‘friendly’
 * name of your entity. This helps to make your policies easier to understand. For example: principal ==
 * User::"a1b2c3d4-e5f6-a1b2-c3d4-EXAMPLE11111", // alice
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Do not include personally identifying, confidential, or sensitive information as part of the unique identifier for
 * your principals or resources.</b> These identifiers are included in log entries shared in CloudTrail trails.
 * </p>
 * </li>
 * </ul>
 * </important>
 * <p>
 * Several operations return structures that appear similar, but have different purposes. As new functionality is added
 * to the product, the structure used in a parameter of one operation might need to change in a way that wouldn't make
 * sense for the same parameter in a different operation. To help you understand the purpose of each, the following
 * naming convention is used for the structures:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Detail</code> are used in <code>Get</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Item</code> are used in <code>List</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that use neither suffix are used in the mutating (create and update) operations.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.verifiedpermissions;

