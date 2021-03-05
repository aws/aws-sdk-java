/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the API Reference for AWS Network Firewall. This guide is for developers who need detailed information about
 * the Network Firewall API actions, data types, and errors.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The REST API requires you to handle connection details, such as calculating signatures, handling request retries, and
 * error handling. For general information about using the AWS REST APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">AWS APIs</a>.
 * </p>
 * <p>
 * To access Network Firewall using the REST API endpoint:
 * <code>https://network-firewall.&lt;region&gt;.amazonaws.com </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of Network Firewall features, including and step-by-step instructions on how to use them through the
 * Network Firewall console, see the <a
 * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/">Network Firewall Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Network Firewall is a stateful, managed, network firewall and intrusion detection and prevention service for Amazon
 * Virtual Private Cloud (Amazon VPC). With Network Firewall, you can filter traffic at the perimeter of your VPC. This
 * includes filtering traffic going to and coming from an internet gateway, NAT gateway, or over VPN or AWS Direct
 * Connect. Network Firewall uses rules that are compatible with Suricata, a free, open source intrusion detection
 * system (IDS) engine. For information about Suricata, see the <a href="https://suricata-ids.org/">Suricata
 * website</a>.
 * </p>
 * <p>
 * You can use Network Firewall to monitor and protect your VPC traffic in a number of ways. The following are just a
 * few examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allow domains or IP addresses for known AWS service endpoints, such as Amazon S3, and block all other forms of
 * traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use custom lists of known bad domains to limit the types of domain names that your applications can access.
 * </p>
 * </li>
 * <li>
 * <p>
 * Perform deep packet inspection on traffic entering or leaving your VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use stateful protocol detection to filter protocols like HTTPS, regardless of the port used.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To enable Network Firewall for your VPCs, you perform steps in both Amazon VPC and in Network Firewall. For
 * information about using Amazon VPC, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon VPC User
 * Guide</a>.
 * </p>
 * <p>
 * To start using Network Firewall, do the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) If you don't already have a VPC that you want to protect, create it in Amazon VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, in each Availability Zone where you want to have a firewall endpoint, create a subnet for the sole use
 * of Network Firewall.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create stateless and stateful rule groups, to define the components of the network traffic
 * filtering behavior that you want your firewall to have.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall policy that uses your rule groups and specifies additional default traffic
 * filtering behavior.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall and specify your new firewall policy and VPC subnets. Network Firewall creates
 * a firewall endpoint in each subnet that you specify, with the behavior that's defined in the firewall policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, use ingress routing enhancements to route traffic through the new firewall endpoints.
 * </p>
 * </li>
 * </ol>
 */
package com.amazonaws.services.networkfirewall;

