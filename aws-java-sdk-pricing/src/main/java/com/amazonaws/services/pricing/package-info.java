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
 * The Amazon Web Services Price List API is a centralized and convenient way to programmatically query Amazon Web
 * Services for services, products, and pricing information. The Amazon Web Services Price List uses standardized
 * product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and
 * provides prices at the SKU level. You can use the Amazon Web Services Price List to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Build cost control and scenario planning tools
 * </p>
 * </li>
 * <li>
 * <p>
 * Reconcile billing data
 * </p>
 * </li>
 * <li>
 * <p>
 * Forecast future spend for budgeting purposes
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide cost benefit analysis that compare your internal workloads with Amazon Web Services
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use <code>GetServices</code> without a service code to retrieve the service codes for all Amazon Web Services, then
 * <code>GetServices</code> with a service code to retrieve the attribute names for that service. After you have the
 * service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an
 * attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find
 * specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a
 * <code>Provisioned IOPS</code> <code>volumeType</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html">Using the Amazon Web Services
 * Price List API</a> in the <i>Billing User Guide</i>.
 * </p>
 */
package com.amazonaws.services.pricing;

