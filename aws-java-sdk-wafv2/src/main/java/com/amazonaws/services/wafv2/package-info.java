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
 * <fullname>WAF</fullname> <note>
 * <p>
 * This is the latest version of the <b>WAF</b> API, released in November, 2019. The names of the entities that you use
 * to access this API, like endpoints and namespaces, all have the versioning information added, like "V2" or "v2", to
 * distinguish from the prior version. We recommend migrating your resources to this version, because it has a number of
 * significant improvements.
 * </p>
 * <p>
 * If you used WAF prior to this release, you can't use this WAFV2 API to access any WAF resources that you created
 * before. You can access your old rules, web ACLs, and other WAF resources only through the WAF Classic APIs. The WAF
 * Classic APIs have retained the prior names, endpoints, and namespaces.
 * </p>
 * <p>
 * For information, including how to migrate your WAF resources to this version, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to Amazon
 * CloudFront, an Amazon API Gateway REST API, an Application Load Balancer, or an AppSync GraphQL API. WAF also lets
 * you control access to your content. Based on conditions that you specify, such as the IP addresses that requests
 * originate from or the values of query strings, the Amazon API Gateway REST API, CloudFront distribution, the
 * Application Load Balancer, or the AppSync GraphQL API responds to requests either with the requested content or with
 * an HTTP 403 status code (Forbidden). You also can configure CloudFront to return a custom error page when a request
 * is blocked.
 * </p>
 * <p>
 * This API guide is for developers who need detailed information about WAF API actions, data types, and errors. For
 * detailed information about WAF features and an overview of how to use WAF, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">WAF Developer Guide</a>.
 * </p>
 * <p>
 * You can make calls using the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">Amazon Web Services Service Endpoints for
 * WAF</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For regional applications, you can use any of the endpoints in the list. A regional application can be an Application
 * Load Balancer (ALB), an Amazon API Gateway REST API, or an AppSync GraphQL API.
 * </p>
 * </li>
 * <li>
 * <p>
 * For Amazon CloudFront applications, you must use the API endpoint listed for US East (N. Virginia): us-east-1.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Alternatively, you can use one of the Amazon Web Services SDKs to access an API that's tailored to the programming
 * language or platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">Amazon
 * Web Services SDKs</a>.
 * </p>
 * <p>
 * We currently provide two versions of the WAF API: this API and the prior versions, the classic WAF APIs. This new API
 * provides the same functionality as the older versions, with the following major improvements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You use one API for both global and regional applications. Where you need to distinguish the scope, you specify a
 * <code>Scope</code> parameter and set it to <code>CLOUDFRONT</code> or <code>REGIONAL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can define a web ACL or rule group with a single call, and update it with a single call. You define all rule
 * specifications in JSON format, and pass them to your rule group or web ACL calls.
 * </p>
 * </li>
 * <li>
 * <p>
 * The limits WAF places on the use of rules more closely reflects the cost of running each type of rule. Rule groups
 * include capacity settings, so you know the maximum cost of a rule group when you use it.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.wafv2;

