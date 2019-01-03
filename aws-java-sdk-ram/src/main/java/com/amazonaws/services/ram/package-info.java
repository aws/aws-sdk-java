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
 * <p>
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
 * resource share, associate the resource with the resource share, and specify the principals that can access the
 * resource. The following principals are supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID of an AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an OU from AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an organization from AWS Organizations
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
 * share, the owner of the specified account receives an invitation to accept the resource share. After the owner
 * accepts the invitation, they can access the resources in the resource share. An administrator of the specified
 * account can use IAM policies to restrict access resources in the resource share.
 * </p>
 */
package com.amazonaws.services.ram;

