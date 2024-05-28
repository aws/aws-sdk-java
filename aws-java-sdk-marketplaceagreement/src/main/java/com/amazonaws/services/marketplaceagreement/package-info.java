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
 * AWS Marketplace is a curated digital catalog that customers can use to find, buy, deploy, and manage third-party
 * software, data, and services to build solutions and run their businesses. The AWS Marketplace Agreement Service
 * provides an API interface that helps AWS Marketplace sellers manage their product-related agreements, including
 * listing, searching, and filtering agreements.
 * </p>
 * <p>
 * To manage agreements in AWS Marketplace, you must ensure that your AWS Identity and Access Management (IAM) policies
 * and roles are set up. The user must have the required policies/permissions that allow them to carry out the actions
 * in AWS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeAgreement</code> – Grants permission to users to obtain detailed meta data about any of their
 * agreements.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAgreementTerms</code> – Grants permission to users to obtain details about the terms of an agreement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SearchAgreements</code> – Grants permission to users to search through all their agreements.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.marketplaceagreement;

