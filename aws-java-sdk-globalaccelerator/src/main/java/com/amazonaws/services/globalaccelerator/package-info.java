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
 * <fullname>Global Accelerator</fullname>
 * <p>
 * This is the <i>Global Accelerator API Reference</i>. This guide is for developers who need detailed information about
 * Global Accelerator API actions, data types, and errors. For more information about Global Accelerator features, see
 * the <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html">Global
 * Accelerator Developer Guide</a>.
 * </p>
 * <p>
 * Global Accelerator is a service in which you create <i>accelerators</i> to improve the performance of your
 * applications for local and global users. Depending on the type of accelerator you choose, you can gain additional
 * benefits.
 * </p>
 * <ul>
 * <li>
 * <p>
 * By using a standard accelerator, you can improve availability of your internet applications that are used by a global
 * audience. With a standard accelerator, Global Accelerator directs traffic to optimal endpoints over the Amazon Web
 * Services global network.
 * </p>
 * </li>
 * <li>
 * <p>
 * For other scenarios, you might choose a custom routing accelerator. With a custom routing accelerator, you can use
 * application logic to directly map one or more users to a specific endpoint among many endpoints.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must
 * specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example,
 * specify <code>--region us-west-2</code> on AWS CLI commands.
 * </p>
 * </important>
 * <p>
 * By default, Global Accelerator provides you with static IP addresses that you associate with your accelerator. The
 * static IP addresses are anycast from the Amazon Web Services edge network. For IPv4, Global Accelerator provides two
 * static IPv4 addresses. For dual-stack, Global Accelerator provides a total of four addresses: two static IPv4
 * addresses and two static IPv6 addresses. With a standard accelerator for IPv4, instead of using the addresses that
 * Global Accelerator provides, you can configure these entry points to be IPv4 addresses from your own IP address
 * ranges that you bring toGlobal Accelerator (BYOIP).
 * </p>
 * <p>
 * For a standard accelerator, they distribute incoming application traffic across multiple endpoint resources in
 * multiple Amazon Web Services Regions , which increases the availability of your applications. Endpoints for standard
 * accelerators can be Network Load Balancers, Application Load Balancers, Amazon EC2 instances, or Elastic IP addresses
 * that are located in one Amazon Web Services Region or multiple Amazon Web Services Regions. For custom routing
 * accelerators, you map traffic that arrives to the static IP addresses to specific Amazon EC2 servers in endpoints
 * that are virtual private cloud (VPC) subnets.
 * </p>
 * <important>
 * <p>
 * The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the
 * accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the
 * static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM
 * policies like tag-based permissions with Global Accelerator to limit the users who have permissions to delete an
 * accelerator. For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/access-control-manage-access-tag-policies.html"
 * >Tag-based policies</a>.
 * </p>
 * </important>
 * <p>
 * For standard accelerators, Global Accelerator uses the Amazon Web Services global network to route traffic to the
 * optimal regional endpoint based on health, client location, and policies that you configure. The service reacts
 * instantly to changes in health or configuration to ensure that internet traffic from clients is always directed to
 * healthy endpoints.
 * </p>
 * <p>
 * For more information about understanding and using Global Accelerator, see the <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html">Global Accelerator
 * Developer Guide</a>.
 * </p>
 */
package com.amazonaws.services.globalaccelerator;

