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
 * Here's how you set up to query an Amazon Route 53 private hosted zone from your network:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Connect your network to a VPC using AWS Direct Connect or a VPN.
 * </p>
 * </li>
 * <li>
 * <p>
 * Run the following AWS CLI command to create a Resolver endpoint:
 * </p>
 * <p>
 * <code>create-resolver-endpoint --name [endpoint_name] --direction INBOUND --creator-request-id [unique_string] --security-group-ids [security_group_with_inbound_rules] --ip-addresses SubnetId=[subnet_id] SubnetId=[subnet_id_in_different_AZ]</code>
 * </p>
 * <p>
 * Note the resolver endpoint ID that appears in the response. You'll use it in step 3.
 * </p>
 * </li>
 * <li>
 * <p>
 * Get the IP addresses for the Resolver endpoints:
 * </p>
 * <p>
 * <code>get-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In your network configuration, define the IP addresses that you got in step 3 as DNS servers.
 * </p>
 * <p>
 * You can now query instance names in your VPCs and the names of records in your private hosted zone.
 * </p>
 * </li>
 * </ol>
 * <p>
 * You can also perform the following operations using the AWS CLI:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>list-resolver-endpoints</code>: List all endpoints. The syntax includes options for pagination and filtering.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>update-resolver-endpoints</code>: Add IP addresses to an endpoint or remove IP addresses from an endpoint.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To delete an endpoint, use the following AWS CLI command:
 * </p>
 * <p>
 * <code>delete-resolver-endpoint --resolver-endpoint-id [resolver_endpoint_id]</code>
 * </p>
 */
package com.amazonaws.services.route53resolver;

