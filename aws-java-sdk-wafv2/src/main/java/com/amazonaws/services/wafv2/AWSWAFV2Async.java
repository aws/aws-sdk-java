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
package com.amazonaws.services.wafv2;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;

/**
 * Interface for accessing WAFV2 asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.wafv2.AbstractAWSWAFV2Async} instead.
 * </p>
 * <p>
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
 * WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to an Amazon
 * CloudFront distribution, Amazon API Gateway REST API, Application Load Balancer, AppSync GraphQL API, Amazon Cognito
 * user pool, App Runner service, or Amazon Web Services Verified Access instance. WAF also lets you control access to
 * your content, to protect the Amazon Web Services resource that WAF is monitoring. Based on conditions that you
 * specify, such as the IP addresses that requests originate from or the values of query strings, the protected resource
 * responds to requests with either the requested content, an HTTP 403 status code (Forbidden), or with a custom
 * response.
 * </p>
 * <p>
 * This API guide is for developers who need detailed information about WAF API actions, data types, and errors. For
 * detailed information about WAF features and guidance for configuring and using WAF, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html">WAF Developer Guide</a>.
 * </p>
 * <p>
 * You can make calls using the endpoints listed in <a href="https://docs.aws.amazon.com/general/latest/gr/waf.html">WAF
 * endpoints and quotas</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For regional applications, you can use any of the endpoints in the list. A regional application can be an Application
 * Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App
 * Runner service, or an Amazon Web Services Verified Access instance.
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFV2Async extends AWSWAFV2 {

    /**
     * <p>
     * Associates a web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito
     * user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate
     * a web ACL, in the CloudFront call <code>UpdateDistribution</code>, set the web ACL ID to the Amazon Resource Name
     * (ARN) of the web ACL. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-AssociateWebACL"
     * >Permissions for AssociateWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateWebACLRequest
     * @return A Java Future containing the result of the AssociateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest associateWebACLRequest);

    /**
     * <p>
     * Associates a web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito
     * user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate
     * a web ACL, in the CloudFront call <code>UpdateDistribution</code>, set the web ACL ID to the Amazon Resource Name
     * (ARN) of the web ACL. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-AssociateWebACL"
     * >Permissions for AssociateWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest associateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWebACLRequest, AssociateWebACLResult> asyncHandler);

    /**
     * <p>
     * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to
     * check the capacity requirements for the rules you want to use in a <a>RuleGroup</a> or <a>WebACL</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-waf-capacity-units.html">WAF web ACL capacity
     * units (WCU)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param checkCapacityRequest
     * @return A Java Future containing the result of the CheckCapacity operation returned by the service.
     * @sample AWSWAFV2Async.CheckCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CheckCapacity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CheckCapacityResult> checkCapacityAsync(CheckCapacityRequest checkCapacityRequest);

    /**
     * <p>
     * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to
     * check the capacity requirements for the rules you want to use in a <a>RuleGroup</a> or <a>WebACL</a>.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-waf-capacity-units.html">WAF web ACL capacity
     * units (WCU)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param checkCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckCapacity operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CheckCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CheckCapacity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CheckCapacityResult> checkCapacityAsync(CheckCapacityRequest checkCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<CheckCapacityRequest, CheckCapacityResult> asyncHandler);

    /**
     * <p>
     * Creates an API key that contains a set of token domains.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * You can use a single key for up to 5 domains. After you generate a key, you can copy it for use in your
     * JavaScript integration.
     * </p>
     * 
     * @param createAPIKeyRequest
     * @return A Java Future containing the result of the CreateAPIKey operation returned by the service.
     * @sample AWSWAFV2Async.CreateAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAPIKeyResult> createAPIKeyAsync(CreateAPIKeyRequest createAPIKeyRequest);

    /**
     * <p>
     * Creates an API key that contains a set of token domains.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * You can use a single key for up to 5 domains. After you generate a key, you can copy it for use in your
     * JavaScript integration.
     * </p>
     * 
     * @param createAPIKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAPIKey operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CreateAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAPIKeyResult> createAPIKeyAsync(CreateAPIKeyRequest createAPIKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAPIKeyRequest, CreateAPIKeyResult> asyncHandler);

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure WAF to block them using an IPSet that lists those IP addresses.
     * </p>
     * 
     * @param createIPSetRequest
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFV2Async.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure WAF to block them using an IPSet that lists those IP addresses.
     * </p>
     * 
     * @param createIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have WAF
     * inspect a web request component for the specified patterns.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2Async.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest);

    /**
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have WAF
     * inspect a web request component for the specified patterns.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>RuleGroup</a> per the specifications provided.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest);

    /**
     * <p>
     * Creates a <a>RuleGroup</a> per the specifications provided.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has a statement
     * that defines what to look for in web requests and an action that WAF applies to requests that match the
     * statement. In the web ACL, you assign a default action to take (allow, block) for any request that does not match
     * any of the rules. The rules in a web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and
     * managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The
     * resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer,
     * an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified
     * Access instance.
     * </p>
     * 
     * @param createWebACLRequest
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest);

    /**
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has a statement
     * that defines what to look for in web requests and an action that WAF applies to requests that match the
     * statement. In the web ACL, you assign a default action to take (allow, block) for any request that does not match
     * any of the rules. The rules in a web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and
     * managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The
     * resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer,
     * an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified
     * Access instance.
     * </p>
     * 
     * @param createWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified API key.
     * </p>
     * <p>
     * After you delete a key, it can take up to 24 hours for WAF to disallow use of the key in all regions.
     * </p>
     * 
     * @param deleteAPIKeyRequest
     * @return A Java Future containing the result of the DeleteAPIKey operation returned by the service.
     * @sample AWSWAFV2Async.DeleteAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAPIKeyResult> deleteAPIKeyAsync(DeleteAPIKeyRequest deleteAPIKeyRequest);

    /**
     * <p>
     * Deletes the specified API key.
     * </p>
     * <p>
     * After you delete a key, it can take up to 24 hours for WAF to disallow use of the key in all regions.
     * </p>
     * 
     * @param deleteAPIKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAPIKey operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAPIKeyResult> deleteAPIKeyAsync(DeleteAPIKeyRequest deleteAPIKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAPIKeyRequest, DeleteAPIKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes all rule groups that are managed by Firewall Manager for the specified web ACL.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteFirewallManagerRuleGroupsRequest
     * @return A Java Future containing the result of the DeleteFirewallManagerRuleGroups operation returned by the
     *         service.
     * @sample AWSWAFV2Async.DeleteFirewallManagerRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallManagerRuleGroupsResult> deleteFirewallManagerRuleGroupsAsync(
            DeleteFirewallManagerRuleGroupsRequest deleteFirewallManagerRuleGroupsRequest);

    /**
     * <p>
     * Deletes all rule groups that are managed by Firewall Manager for the specified web ACL.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteFirewallManagerRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFirewallManagerRuleGroups operation returned by the
     *         service.
     * @sample AWSWAFV2AsyncHandler.DeleteFirewallManagerRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFirewallManagerRuleGroupsResult> deleteFirewallManagerRuleGroupsAsync(
            DeleteFirewallManagerRuleGroupsRequest deleteFirewallManagerRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFirewallManagerRuleGroupsRequest, DeleteFirewallManagerRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified <a>IPSet</a>.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFV2Async.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes the specified <a>IPSet</a>.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2Async.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFV2Async.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeletePermissionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeletePermissionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionPolicyRequest, DeletePermissionPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2Async.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest);

    /**
     * <p>
     * Deletes the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest);

    /**
     * <p>
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * <note>
     * <p>
     * Before deleting any web ACL, first disassociate it from all resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve a list of the resources that are associated with a web ACL, use the following calls:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional resources, call <a>ListResourcesForWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon CloudFront distributions, use the CloudFront call <code>ListDistributionsByWebACLId</code>. For
     * information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ListDistributionsByWebACLId.html"
     * >ListDistributionsByWebACLId</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To disassociate a resource from a web ACL, use the following calls:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional resources, call <a>DisassociateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon CloudFront distributions, provide an empty web ACL ID in the CloudFront call
     * <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteWebACLRequest
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFV2Async.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest);

    /**
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * <note>
     * <p>
     * Before deleting any web ACL, first disassociate it from all resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve a list of the resources that are associated with a web ACL, use the following calls:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional resources, call <a>ListResourcesForWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon CloudFront distributions, use the CloudFront call <code>ListDistributionsByWebACLId</code>. For
     * information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ListDistributionsByWebACLId.html"
     * >ListDistributionsByWebACLId</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To disassociate a resource from a web ACL, use the following calls:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional resources, call <a>DisassociateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon CloudFront distributions, provide an empty web ACL ID in the CloudFront call
     * <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler);

    /**
     * <p>
     * Provides high-level information for the Amazon Web Services Managed Rules rule groups and Amazon Web Services
     * Marketplace managed rule groups.
     * </p>
     * 
     * @param describeAllManagedProductsRequest
     * @return A Java Future containing the result of the DescribeAllManagedProducts operation returned by the service.
     * @sample AWSWAFV2Async.DescribeAllManagedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeAllManagedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAllManagedProductsResult> describeAllManagedProductsAsync(
            DescribeAllManagedProductsRequest describeAllManagedProductsRequest);

    /**
     * <p>
     * Provides high-level information for the Amazon Web Services Managed Rules rule groups and Amazon Web Services
     * Marketplace managed rule groups.
     * </p>
     * 
     * @param describeAllManagedProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAllManagedProducts operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DescribeAllManagedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeAllManagedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAllManagedProductsResult> describeAllManagedProductsAsync(
            DescribeAllManagedProductsRequest describeAllManagedProductsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAllManagedProductsRequest, DescribeAllManagedProductsResult> asyncHandler);

    /**
     * <p>
     * Provides high-level information for the managed rule groups owned by a specific vendor.
     * </p>
     * 
     * @param describeManagedProductsByVendorRequest
     * @return A Java Future containing the result of the DescribeManagedProductsByVendor operation returned by the
     *         service.
     * @sample AWSWAFV2Async.DescribeManagedProductsByVendor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedProductsByVendor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedProductsByVendorResult> describeManagedProductsByVendorAsync(
            DescribeManagedProductsByVendorRequest describeManagedProductsByVendorRequest);

    /**
     * <p>
     * Provides high-level information for the managed rule groups owned by a specific vendor.
     * </p>
     * 
     * @param describeManagedProductsByVendorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeManagedProductsByVendor operation returned by the
     *         service.
     * @sample AWSWAFV2AsyncHandler.DescribeManagedProductsByVendor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedProductsByVendor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedProductsByVendorResult> describeManagedProductsByVendorAsync(
            DescribeManagedProductsByVendorRequest describeManagedProductsByVendorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeManagedProductsByVendorRequest, DescribeManagedProductsByVendorResult> asyncHandler);

    /**
     * <p>
     * Provides high-level information for a managed rule group, including descriptions of the rules.
     * </p>
     * 
     * @param describeManagedRuleGroupRequest
     * @return A Java Future containing the result of the DescribeManagedRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.DescribeManagedRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedRuleGroupResult> describeManagedRuleGroupAsync(DescribeManagedRuleGroupRequest describeManagedRuleGroupRequest);

    /**
     * <p>
     * Provides high-level information for a managed rule group, including descriptions of the rules.
     * </p>
     * 
     * @param describeManagedRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeManagedRuleGroup operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DescribeManagedRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedRuleGroupResult> describeManagedRuleGroupAsync(DescribeManagedRuleGroupRequest describeManagedRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeManagedRuleGroupRequest, DescribeManagedRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified regional application resource from any existing web ACL association. A resource can
     * have at most one web ACL association. A regional application can be an Application Load Balancer (ALB), an Amazon
     * API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon
     * Web Services Verified Access instance.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To
     * disassociate a web ACL, provide an empty web ACL ID in the CloudFront call <code>UpdateDistribution</code>. For
     * information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html">
     * UpdateDistribution</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-DisassociateWebACL"
     * >Permissions for DisassociateWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return A Java Future containing the result of the DisassociateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DisassociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest disassociateWebACLRequest);

    /**
     * <p>
     * Disassociates the specified regional application resource from any existing web ACL association. A resource can
     * have at most one web ACL association. A regional application can be an Application Load Balancer (ALB), an Amazon
     * API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon
     * Web Services Verified Access instance.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To
     * disassociate a web ACL, provide an empty web ACL ID in the CloudFront call <code>UpdateDistribution</code>. For
     * information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html">
     * UpdateDistribution</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-DisassociateWebACL"
     * >Permissions for DisassociateWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DisassociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest disassociateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWebACLRequest, DisassociateWebACLResult> asyncHandler);

    /**
     * <p>
     * Generates a presigned download URL for the specified release of the mobile SDK.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param generateMobileSdkReleaseUrlRequest
     * @return A Java Future containing the result of the GenerateMobileSdkReleaseUrl operation returned by the service.
     * @sample AWSWAFV2Async.GenerateMobileSdkReleaseUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GenerateMobileSdkReleaseUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateMobileSdkReleaseUrlResult> generateMobileSdkReleaseUrlAsync(
            GenerateMobileSdkReleaseUrlRequest generateMobileSdkReleaseUrlRequest);

    /**
     * <p>
     * Generates a presigned download URL for the specified release of the mobile SDK.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param generateMobileSdkReleaseUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateMobileSdkReleaseUrl operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GenerateMobileSdkReleaseUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GenerateMobileSdkReleaseUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateMobileSdkReleaseUrlResult> generateMobileSdkReleaseUrlAsync(
            GenerateMobileSdkReleaseUrlRequest generateMobileSdkReleaseUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateMobileSdkReleaseUrlRequest, GenerateMobileSdkReleaseUrlResult> asyncHandler);

    /**
     * <p>
     * Returns your API key in decrypted form. Use this to check the token domains that you have defined for the key.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getDecryptedAPIKeyRequest
     * @return A Java Future containing the result of the GetDecryptedAPIKey operation returned by the service.
     * @sample AWSWAFV2Async.GetDecryptedAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetDecryptedAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDecryptedAPIKeyResult> getDecryptedAPIKeyAsync(GetDecryptedAPIKeyRequest getDecryptedAPIKeyRequest);

    /**
     * <p>
     * Returns your API key in decrypted form. Use this to check the token domains that you have defined for the key.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getDecryptedAPIKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDecryptedAPIKey operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetDecryptedAPIKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetDecryptedAPIKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDecryptedAPIKeyResult> getDecryptedAPIKeyAsync(GetDecryptedAPIKeyRequest getDecryptedAPIKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDecryptedAPIKeyRequest, GetDecryptedAPIKeyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified <a>IPSet</a>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFV2Async.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Retrieves the specified <a>IPSet</a>.
     * </p>
     * 
     * @param getIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2Async.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified managed rule set.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param getManagedRuleSetRequest
     * @return A Java Future containing the result of the GetManagedRuleSet operation returned by the service.
     * @sample AWSWAFV2Async.GetManagedRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetManagedRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetManagedRuleSetResult> getManagedRuleSetAsync(GetManagedRuleSetRequest getManagedRuleSetRequest);

    /**
     * <p>
     * Retrieves the specified managed rule set.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param getManagedRuleSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetManagedRuleSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetManagedRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetManagedRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetManagedRuleSetResult> getManagedRuleSetAsync(GetManagedRuleSetRequest getManagedRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetManagedRuleSetRequest, GetManagedRuleSetResult> asyncHandler);

    /**
     * <p>
     * Retrieves information for the specified mobile SDK release, including release notes and tags.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getMobileSdkReleaseRequest
     * @return A Java Future containing the result of the GetMobileSdkRelease operation returned by the service.
     * @sample AWSWAFV2Async.GetMobileSdkRelease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetMobileSdkRelease" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMobileSdkReleaseResult> getMobileSdkReleaseAsync(GetMobileSdkReleaseRequest getMobileSdkReleaseRequest);

    /**
     * <p>
     * Retrieves information for the specified mobile SDK release, including release notes and tags.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getMobileSdkReleaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMobileSdkRelease operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetMobileSdkRelease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetMobileSdkRelease" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMobileSdkReleaseResult> getMobileSdkReleaseAsync(GetMobileSdkReleaseRequest getMobileSdkReleaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetMobileSdkReleaseRequest, GetMobileSdkReleaseResult> asyncHandler);

    /**
     * <p>
     * Returns the IAM policy that is attached to the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFV2Async.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest);

    /**
     * <p>
     * Returns the IAM policy that is attached to the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionPolicyRequest, GetPermissionPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the IP addresses that are currently blocked by a rate-based rule instance. This is only available for
     * rate-based rules that aggregate solely on the IP address or on the forwarded IP address.
     * </p>
     * <p>
     * The maximum number of addresses that can be blocked for a single rate-based rule instance is 10,000. If more than
     * 10,000 addresses exceed the rate limit, those with the highest rates are blocked.
     * </p>
     * <p>
     * For a rate-based rule that you've defined inside a rule group, provide the name of the rule group reference
     * statement in your request, in addition to the rate-based rule name and the web ACL name.
     * </p>
     * <p>
     * WAF monitors web requests and manages keys independently for each unique combination of web ACL, optional rule
     * group, and rate-based rule. For example, if you define a rate-based rule inside a rule group, and then use the
     * rule group in a web ACL, WAF monitors web requests and manages keys for that web ACL, rule group reference
     * statement, and rate-based rule instance. If you use the same rule group in a second web ACL, WAF monitors web
     * requests and manages keys for this second usage completely independent of your first.
     * </p>
     * 
     * @param getRateBasedStatementManagedKeysRequest
     * @return A Java Future containing the result of the GetRateBasedStatementManagedKeys operation returned by the
     *         service.
     * @sample AWSWAFV2Async.GetRateBasedStatementManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedStatementManagedKeysResult> getRateBasedStatementManagedKeysAsync(
            GetRateBasedStatementManagedKeysRequest getRateBasedStatementManagedKeysRequest);

    /**
     * <p>
     * Retrieves the IP addresses that are currently blocked by a rate-based rule instance. This is only available for
     * rate-based rules that aggregate solely on the IP address or on the forwarded IP address.
     * </p>
     * <p>
     * The maximum number of addresses that can be blocked for a single rate-based rule instance is 10,000. If more than
     * 10,000 addresses exceed the rate limit, those with the highest rates are blocked.
     * </p>
     * <p>
     * For a rate-based rule that you've defined inside a rule group, provide the name of the rule group reference
     * statement in your request, in addition to the rate-based rule name and the web ACL name.
     * </p>
     * <p>
     * WAF monitors web requests and manages keys independently for each unique combination of web ACL, optional rule
     * group, and rate-based rule. For example, if you define a rate-based rule inside a rule group, and then use the
     * rule group in a web ACL, WAF monitors web requests and manages keys for that web ACL, rule group reference
     * statement, and rate-based rule instance. If you use the same rule group in a second web ACL, WAF monitors web
     * requests and manages keys for this second usage completely independent of your first.
     * </p>
     * 
     * @param getRateBasedStatementManagedKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRateBasedStatementManagedKeys operation returned by the
     *         service.
     * @sample AWSWAFV2AsyncHandler.GetRateBasedStatementManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedStatementManagedKeysResult> getRateBasedStatementManagedKeysAsync(
            GetRateBasedStatementManagedKeysRequest getRateBasedStatementManagedKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedStatementManagedKeysRequest, GetRateBasedStatementManagedKeysResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2Async.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest);

    /**
     * <p>
     * Retrieves the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest);

    /**
     * <p>
     * Retrieves the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that WAF randomly selects from among
     * the first 5,000 requests that your Amazon Web Services resource received during a time range that you choose. You
     * can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFV2Async.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest);

    /**
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that WAF randomly selects from among
     * the first 5,000 requests that your Amazon Web Services resource received during a time range that you choose. You
     * can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified <a>WebACL</a>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFV2Async.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest);

    /**
     * <p>
     * Retrieves the specified <a>WebACL</a>.
     * </p>
     * 
     * @param getWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
     * </p>
     * <p>
     * This call uses <code>GetWebACL</code>, to verify that your account has permission to access the retrieved web
     * ACL. If you get an error that indicates that your account isn't authorized to perform
     * <code>wafv2:GetWebACL</code> on the resource, that error won't be included in your CloudTrail event history.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, call the CloudFront action
     * <code>GetDistributionConfig</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html"
     * >GetDistributionConfig</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-GetWebACLForResource"
     * >Permissions for GetWebACLForResource</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return A Java Future containing the result of the GetWebACLForResource operation returned by the service.
     * @sample AWSWAFV2Async.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACLForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest getWebACLForResourceRequest);

    /**
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
     * </p>
     * <p>
     * This call uses <code>GetWebACL</code>, to verify that your account has permission to access the retrieved web
     * ACL. If you get an error that indicates that your account isn't authorized to perform
     * <code>wafv2:GetWebACL</code> on the resource, that error won't be included in your CloudTrail event history.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, call the CloudFront action
     * <code>GetDistributionConfig</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html"
     * >GetDistributionConfig</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-GetWebACLForResource"
     * >Permissions for GetWebACLForResource</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebACLForResource operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACLForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest getWebACLForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebACLForResourceRequest, GetWebACLForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the API keys that you've defined for the specified scope.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listAPIKeysRequest
     * @return A Java Future containing the result of the ListAPIKeys operation returned by the service.
     * @sample AWSWAFV2Async.ListAPIKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAPIKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAPIKeysResult> listAPIKeysAsync(ListAPIKeysRequest listAPIKeysRequest);

    /**
     * <p>
     * Retrieves a list of the API keys that you've defined for the specified scope.
     * </p>
     * <p>
     * API keys are required for the integration of the CAPTCHA API in your JavaScript client applications. The API lets
     * you customize the placement and characteristics of the CAPTCHA puzzle for your end users. For more information
     * about the CAPTCHA JavaScript integration, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listAPIKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAPIKeys operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListAPIKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAPIKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAPIKeysResult> listAPIKeysAsync(ListAPIKeysRequest listAPIKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListAPIKeysRequest, ListAPIKeysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available versions for the specified managed rule group.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupVersionsRequest
     * @return A Java Future containing the result of the ListAvailableManagedRuleGroupVersions operation returned by
     *         the service.
     * @sample AWSWAFV2Async.ListAvailableManagedRuleGroupVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroupVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagedRuleGroupVersionsResult> listAvailableManagedRuleGroupVersionsAsync(
            ListAvailableManagedRuleGroupVersionsRequest listAvailableManagedRuleGroupVersionsRequest);

    /**
     * <p>
     * Returns a list of the available versions for the specified managed rule group.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableManagedRuleGroupVersions operation returned by
     *         the service.
     * @sample AWSWAFV2AsyncHandler.ListAvailableManagedRuleGroupVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroupVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagedRuleGroupVersionsResult> listAvailableManagedRuleGroupVersionsAsync(
            ListAvailableManagedRuleGroupVersionsRequest listAvailableManagedRuleGroupVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableManagedRuleGroupVersionsRequest, ListAvailableManagedRuleGroupVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all Amazon Web
     * Services Managed Rules rule groups and all of the Amazon Web Services Marketplace managed rule groups that you're
     * subscribed to.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupsRequest
     * @return A Java Future containing the result of the ListAvailableManagedRuleGroups operation returned by the
     *         service.
     * @sample AWSWAFV2Async.ListAvailableManagedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagedRuleGroupsResult> listAvailableManagedRuleGroupsAsync(
            ListAvailableManagedRuleGroupsRequest listAvailableManagedRuleGroupsRequest);

    /**
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all Amazon Web
     * Services Managed Rules rule groups and all of the Amazon Web Services Marketplace managed rule groups that you're
     * subscribed to.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableManagedRuleGroups operation returned by the
     *         service.
     * @sample AWSWAFV2AsyncHandler.ListAvailableManagedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagedRuleGroupsResult> listAvailableManagedRuleGroupsAsync(
            ListAvailableManagedRuleGroupsRequest listAvailableManagedRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableManagedRuleGroupsRequest, ListAvailableManagedRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of <a>IPSetSummary</a> objects for the IP sets that you manage.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFV2Async.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Retrieves an array of <a>IPSetSummary</a> objects for the IP sets that you manage.
     * </p>
     * 
     * @param listIPSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of your <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFV2Async.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <p>
     * Retrieves an array of your <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the managed rule sets that you own.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param listManagedRuleSetsRequest
     * @return A Java Future containing the result of the ListManagedRuleSets operation returned by the service.
     * @sample AWSWAFV2Async.ListManagedRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListManagedRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListManagedRuleSetsResult> listManagedRuleSetsAsync(ListManagedRuleSetsRequest listManagedRuleSetsRequest);

    /**
     * <p>
     * Retrieves the managed rule sets that you own.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param listManagedRuleSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListManagedRuleSets operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListManagedRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListManagedRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListManagedRuleSetsResult> listManagedRuleSetsAsync(ListManagedRuleSetsRequest listManagedRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListManagedRuleSetsRequest, ListManagedRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the available releases for the mobile SDK and the specified device platform.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listMobileSdkReleasesRequest
     * @return A Java Future containing the result of the ListMobileSdkReleases operation returned by the service.
     * @sample AWSWAFV2Async.ListMobileSdkReleases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListMobileSdkReleases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileSdkReleasesResult> listMobileSdkReleasesAsync(ListMobileSdkReleasesRequest listMobileSdkReleasesRequest);

    /**
     * <p>
     * Retrieves a list of the available releases for the mobile SDK and the specified device platform.
     * </p>
     * <p>
     * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish
     * and manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listMobileSdkReleasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMobileSdkReleases operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListMobileSdkReleases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListMobileSdkReleases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileSdkReleasesResult> listMobileSdkReleasesAsync(ListMobileSdkReleasesRequest listMobileSdkReleasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMobileSdkReleasesRequest, ListMobileSdkReleasesResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of <a>RegexPatternSetSummary</a> objects for the regex pattern sets that you manage.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFV2Async.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest);

    /**
     * <p>
     * Retrieves an array of <a>RegexPatternSetSummary</a> objects for the regex pattern sets that you manage.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use the CloudFront call
     * <code>ListDistributionsByWebACLId</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ListDistributionsByWebACLId.html"
     * >ListDistributionsByWebACLId</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-ListResourcesForWebACL"
     * >Permissions for ListResourcesForWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return A Java Future containing the result of the ListResourcesForWebACL operation returned by the service.
     * @sample AWSWAFV2Async.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListResourcesForWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest listResourcesForWebACLRequest);

    /**
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use the CloudFront call
     * <code>ListDistributionsByWebACLId</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ListDistributionsByWebACLId.html"
     * >ListDistributionsByWebACLId</a> in the <i>Amazon CloudFront API Reference</i>.
     * </p>
     * <p>
     * <b>Required permissions for customer-managed IAM policies</b>
     * </p>
     * <p>
     * This call requires permissions that are specific to the protected resource type. For details, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/security_iam_service-with-iam.html#security_iam_action-ListResourcesForWebACL"
     * >Permissions for ListResourcesForWebACL</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcesForWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListResourcesForWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest listResourcesForWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesForWebACLRequest, ListResourcesForWebACLResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of <a>RuleGroupSummary</a> objects for the rule groups that you manage.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFV2Async.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest);

    /**
     * <p>
     * Retrieves an array of <a>RuleGroupSummary</a> objects for the rule groups that you manage.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the <a>TagInfoForResource</a> for the specified resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and
     * regex pattern sets. You can't manage or view tags through the WAF console.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWAFV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the <a>TagInfoForResource</a> for the specified resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and
     * regex pattern sets. You can't manage or view tags through the WAF console.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves an array of <a>WebACLSummary</a> objects for the web ACLs that you manage.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFV2Async.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest);

    /**
     * <p>
     * Retrieves an array of <a>WebACLSummary</a> objects for the web ACLs that you manage.
     * </p>
     * 
     * @param listWebACLsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler);

    /**
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces any mutable specifications that you already have for a logging configuration
     * with the ones that you provide to this call.
     * </p>
     * <p>
     * To modify an existing logging configuration, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetLoggingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete logging configuration specification to this call
     * </p>
     * </li>
     * </ol>
     * </note> <note>
     * <p>
     * You can define one logging destination per web ACL.
     * </p>
     * </note>
     * <p>
     * You can access information about the traffic that WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon Simple Storage
     * Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * The name that you give the destination must start with <code>aws-waf-logs-</code>. Depending on the type of
     * destination, you might need to configure additional settings or permissions.
     * </p>
     * <p>
     * For configuration requirements and pricing information for each destination type, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging web ACL traffic</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Associate your logging destination to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, WAF creates an
     * additional role or policy that is required to write logs to the logging destination. For an Amazon CloudWatch
     * Logs log group, WAF creates a resource policy on the log group. For an Amazon S3 bucket, WAF creates a bucket
     * policy. For an Amazon Kinesis Data Firehose, WAF creates a service-linked role.
     * </p>
     * <p>
     * For additional information about web ACL logging, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging web ACL traffic information</a>
     * in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2Async.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest);

    /**
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces any mutable specifications that you already have for a logging configuration
     * with the ones that you provide to this call.
     * </p>
     * <p>
     * To modify an existing logging configuration, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetLoggingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete logging configuration specification to this call
     * </p>
     * </li>
     * </ol>
     * </note> <note>
     * <p>
     * You can define one logging destination per web ACL.
     * </p>
     * </note>
     * <p>
     * You can access information about the traffic that WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon Simple Storage
     * Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * The name that you give the destination must start with <code>aws-waf-logs-</code>. Depending on the type of
     * destination, you might need to configure additional settings or permissions.
     * </p>
     * <p>
     * For configuration requirements and pricing information for each destination type, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging web ACL traffic</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Associate your logging destination to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, WAF creates an
     * additional role or policy that is required to write logs to the logging destination. For an Amazon CloudWatch
     * Logs log group, WAF creates a resource policy on the log group. For an Amazon S3 bucket, WAF creates a bucket
     * policy. For an Amazon Kinesis Data Firehose, WAF creates a service-linked role.
     * </p>
     * <p>
     * For additional information about web ACL logging, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging web ACL traffic information</a>
     * in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Defines the versions of your managed rule set that you are offering to the customers. Customers see your
     * offerings as managed rule groups with versioning.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * <p>
     * Customers retrieve their managed rule group list by calling <a>ListAvailableManagedRuleGroups</a>. The name that
     * you provide here for your managed rule set is the name the customer sees for the corresponding managed rule
     * group. Customers can retrieve the available versions for a managed rule group by calling
     * <a>ListAvailableManagedRuleGroupVersions</a>. You provide a rule group specification for each version. For each
     * managed rule set, you must specify a version that you recommend using.
     * </p>
     * <p>
     * To initiate the expiration of a managed rule group version, use <a>UpdateManagedRuleSetVersionExpiryDate</a>.
     * </p>
     * 
     * @param putManagedRuleSetVersionsRequest
     * @return A Java Future containing the result of the PutManagedRuleSetVersions operation returned by the service.
     * @sample AWSWAFV2Async.PutManagedRuleSetVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutManagedRuleSetVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutManagedRuleSetVersionsResult> putManagedRuleSetVersionsAsync(
            PutManagedRuleSetVersionsRequest putManagedRuleSetVersionsRequest);

    /**
     * <p>
     * Defines the versions of your managed rule set that you are offering to the customers. Customers see your
     * offerings as managed rule groups with versioning.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * <p>
     * Customers retrieve their managed rule group list by calling <a>ListAvailableManagedRuleGroups</a>. The name that
     * you provide here for your managed rule set is the name the customer sees for the corresponding managed rule
     * group. Customers can retrieve the available versions for a managed rule group by calling
     * <a>ListAvailableManagedRuleGroupVersions</a>. You provide a rule group specification for each version. For each
     * managed rule set, you must specify a version that you recommend using.
     * </p>
     * <p>
     * To initiate the expiration of a managed rule group version, use <a>UpdateManagedRuleSetVersionExpiryDate</a>.
     * </p>
     * 
     * @param putManagedRuleSetVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutManagedRuleSetVersions operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.PutManagedRuleSetVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutManagedRuleSetVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutManagedRuleSetVersionsResult> putManagedRuleSetVersionsAsync(
            PutManagedRuleSetVersionsRequest putManagedRuleSetVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutManagedRuleSetVersionsRequest, PutManagedRuleSetVersionsResult> asyncHandler);

    /**
     * <p>
     * Attaches an IAM policy to the specified resource. Use this to share a rule group across accounts.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * <p>
     * This action is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF <a>RuleGroup</a> ARN and the rule group must exist in the same Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the rule group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPermissionPolicyRequest
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFV2Async.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest);

    /**
     * <p>
     * Attaches an IAM policy to the specified resource. Use this to share a rule group across accounts.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * <p>
     * This action is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF <a>RuleGroup</a> ARN and the rule group must exist in the same Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the rule group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionPolicyRequest, PutPermissionPolicyResult> asyncHandler);

    /**
     * <p>
     * Associates tags with the specified Amazon Web Services resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and
     * regex pattern sets. You can't manage or view tags through the WAF console.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWAFV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates tags with the specified Amazon Web Services resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the Amazon Web Services resources that you manage through WAF: web ACLs, rule groups, IP sets, and
     * regex pattern sets. You can't manage or view tags through the WAF console.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates tags from an Amazon Web Services resource. Tags are key:value pairs that you can associate with
     * Amazon Web Services resources. For example, the tag key might be "customer" and the tag value might be
     * "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each Amazon
     * Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWAFV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Disassociates tags from an Amazon Web Services resource. Tags are key:value pairs that you can associate with
     * Amazon Web Services resources. For example, the tag key might be "customer" and the tag value might be
     * "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each Amazon
     * Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified <a>IPSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the IP set with the ones
     * that you provide to this call.
     * </p>
     * <p>
     * To modify an IP set, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetIPSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete IP set specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateIPSetRequest
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFV2Async.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Updates the specified <a>IPSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the IP set with the ones
     * that you provide to this call.
     * </p>
     * <p>
     * To modify an IP set, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetIPSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete IP set specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler);

    /**
     * <p>
     * Updates the expiration information for your managed rule set. Use this to initiate the expiration of a managed
     * rule group version. After you initiate expiration for a version, WAF excludes it from the response to
     * <a>ListAvailableManagedRuleGroupVersions</a> for the managed rule group.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param updateManagedRuleSetVersionExpiryDateRequest
     * @return A Java Future containing the result of the UpdateManagedRuleSetVersionExpiryDate operation returned by
     *         the service.
     * @sample AWSWAFV2Async.UpdateManagedRuleSetVersionExpiryDate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateManagedRuleSetVersionExpiryDate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateManagedRuleSetVersionExpiryDateResult> updateManagedRuleSetVersionExpiryDateAsync(
            UpdateManagedRuleSetVersionExpiryDateRequest updateManagedRuleSetVersionExpiryDateRequest);

    /**
     * <p>
     * Updates the expiration information for your managed rule set. Use this to initiate the expiration of a managed
     * rule group version. After you initiate expiration for a version, WAF excludes it from the response to
     * <a>ListAvailableManagedRuleGroupVersions</a> for the managed rule group.
     * </p>
     * <note>
     * <p>
     * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
     * Services Marketplace sellers.
     * </p>
     * <p>
     * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
     * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
     * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
     * </p>
     * </note>
     * 
     * @param updateManagedRuleSetVersionExpiryDateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateManagedRuleSetVersionExpiryDate operation returned by
     *         the service.
     * @sample AWSWAFV2AsyncHandler.UpdateManagedRuleSetVersionExpiryDate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateManagedRuleSetVersionExpiryDate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateManagedRuleSetVersionExpiryDateResult> updateManagedRuleSetVersionExpiryDateAsync(
            UpdateManagedRuleSetVersionExpiryDateRequest updateManagedRuleSetVersionExpiryDateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateManagedRuleSetVersionExpiryDateRequest, UpdateManagedRuleSetVersionExpiryDateResult> asyncHandler);

    /**
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the regex pattern set
     * with the ones that you provide to this call.
     * </p>
     * <p>
     * To modify a regex pattern set, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetRegexPatternSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete regex pattern set specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRegexPatternSetRequest
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2Async.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

    /**
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the regex pattern set
     * with the ones that you provide to this call.
     * </p>
     * <p>
     * To modify a regex pattern set, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetRegexPatternSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete regex pattern set specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler);

    /**
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the rule group with the
     * ones that you provide to this call.
     * </p>
     * <p>
     * To modify a rule group, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetRuleGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete rule group specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuleGroupRequest
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the rule group with the
     * ones that you provide to this call.
     * </p>
     * <p>
     * To modify a rule group, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetRuleGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete rule group specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the specified <a>WebACL</a>. While updating a web ACL, WAF provides continuous coverage to the resources
     * that you have associated with the web ACL.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the web ACL with the ones
     * that you provide to this call.
     * </p>
     * <p>
     * To modify a web ACL, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetWebACL</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete web ACL specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has a statement
     * that defines what to look for in web requests and an action that WAF applies to requests that match the
     * statement. In the web ACL, you assign a default action to take (allow, block) for any request that does not match
     * any of the rules. The rules in a web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and
     * managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The
     * resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer,
     * an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified
     * Access instance.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateWebACLRequest
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest);

    /**
     * <p>
     * Updates the specified <a>WebACL</a>. While updating a web ACL, WAF provides continuous coverage to the resources
     * that you have associated with the web ACL.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the web ACL with the ones
     * that you provide to this call.
     * </p>
     * <p>
     * To modify a web ACL, do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Retrieve it by calling <a>GetWebACL</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Update its settings as needed
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide the complete web ACL specification to this call
     * </p>
     * </li>
     * </ol>
     * </note>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has a statement
     * that defines what to look for in web requests and an action that WAF applies to requests that match the
     * statement. In the web ACL, you assign a default action to take (allow, block) for any request that does not match
     * any of the rules. The rules in a web ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and
     * managed rule group. You can associate a web ACL with one or more Amazon Web Services resources to protect. The
     * resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an Application Load Balancer,
     * an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified
     * Access instance.
     * </p>
     * <p>
     * <b>Temporary inconsistencies during updates</b>
     * </p>
     * <p>
     * When you create or change a web ACL or other WAF resources, the changes take a small amount of time to propagate
     * to all areas where the resources are stored. The propagation time can be from a few seconds to a number of
     * minutes.
     * </p>
     * <p>
     * The following are examples of the temporary inconsistencies that you might notice during change propagation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * After you create a web ACL, if you try to associate it with a resource, you might get an exception indicating
     * that the web ACL is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add a rule group to a web ACL, the new rule group rules might be in effect in one area where the web
     * ACL is used and not in another.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you change a rule action setting, you might see the old action in some places and the new action in others.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you add an IP address to an IP set that is in use in a blocking rule, the new address might be blocked in
     * one area while still allowed in another.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFV2AsyncHandler.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler);

}
