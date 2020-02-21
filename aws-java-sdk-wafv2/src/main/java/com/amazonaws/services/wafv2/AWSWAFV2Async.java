/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * This is the latest version of the <b>AWS WAF</b> API, released in November, 2019. The names of the entities that you
 * use to access this API, like endpoints and namespaces, all have the versioning information added, like "V2" or "v2",
 * to distinguish from the prior version. We recommend migrating your resources to this version, because it has a number
 * of significant improvements.
 * </p>
 * <p>
 * If you used AWS WAF prior to this release, you can't use this AWS WAFV2 API to access any AWS WAF resources that you
 * created before. You can access your old rules, web ACLs, and other AWS WAF resources only through the AWS WAF Classic
 * APIs. The AWS WAF Classic APIs have retained the prior names, endpoints, and namespaces.
 * </p>
 * <p>
 * For information, including how to migrate your AWS WAF resources to this version, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to Amazon
 * CloudFront, an Amazon API Gateway API, or an Application Load Balancer. AWS WAF also lets you control access to your
 * content. Based on conditions that you specify, such as the IP addresses that requests originate from or the values of
 * query strings, API Gateway, CloudFront, or the Application Load Balancer responds to requests either with the
 * requested content or with an HTTP 403 status code (Forbidden). You also can configure CloudFront to return a custom
 * error page when a request is blocked.
 * </p>
 * <p>
 * This API guide is for developers who need detailed information about AWS WAF API actions, data types, and errors. For
 * detailed information about AWS WAF features and an overview of how to use AWS WAF, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
 * </p>
 * <p>
 * You can make API calls using the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Service Endpoints for AWS WAF</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For regional applications, you can use any of the endpoints in the list. A regional application can be an Application
 * Load Balancer (ALB) or an API Gateway stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * For AWS CloudFront applications, you must use the API endpoint listed for US East (N. Virginia): us-east-1.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * We currently provide two versions of the AWS WAF API: this API and the prior versions, the classic AWS WAF APIs. This
 * new API provides the same functionality as the older versions, with the following major improvements:
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
 * You can define a Web ACL or rule group with a single API call, and update it with a single call. You define all rule
 * specifications in JSON format, and pass them to your rule group or Web ACL API calls.
 * </p>
 * </li>
 * <li>
 * <p>
 * The limits AWS WAF places on the use of rules more closely reflects the cost of running each type of rule. Rule
 * groups include capacity settings, so you know the maximum cost of a rule group when you use it.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFV2Async extends AWSWAFV2 {

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Associates a Web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * For AWS CloudFront, you can associate the Web ACL by providing the <code>ARN</code> of the <a>WebACL</a> to the
     * CloudFront API call <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return A Java Future containing the result of the AssociateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest associateWebACLRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Associates a Web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * For AWS CloudFront, you can associate the Web ACL by providing the <code>ARN</code> of the <a>WebACL</a> to the
     * CloudFront API call <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
     * </p>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to
     * check the capacity requirements for the rules you want to use in a <a>RuleGroup</a> or <a>WebACL</a>.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to
     * check the capacity requirements for the rules you want to use in a <a>RuleGroup</a> or <a>WebACL</a>.
     * </p>
     * <p>
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups,
     * and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each
     * rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power.
     * Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule
     * group. The WCU limit for web ACLs is 1,500.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure AWS WAF to block them using an IPSet that lists those IP addresses.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure AWS WAF to block them using an IPSet that lists those IP addresses.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have AWS
     * WAF inspect a web request component for the specified patterns.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have AWS
     * WAF inspect a web request component for the specified patterns.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * API, or an Application Load Balancer.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * API, or an Application Load Balancer.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteWebACLRequest
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFV2Async.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Disassociates a Web ACL from a regional application resource. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * For AWS CloudFront, you can disassociate the Web ACL by providing an empty web ACL ARN in the CloudFront API call
     * <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Disassociates a Web ACL from a regional application resource. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * For AWS CloudFront, you can disassociate the Web ACL by providing an empty web ACL ARN in the CloudFront API call
     * <code>UpdateDistribution</code>. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can
     * be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those
     * with the highest rates are blocked.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can
     * be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those
     * with the highest rates are blocked.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all AWS Managed
     * Rules rule groups and the AWS Marketplace managed rule groups that you're subscribed to.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all AWS Managed
     * Rules rule groups and the AWS Marketplace managed rule groups that you're subscribed to.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL. If you want the list of AWS CloudFront resources, use the AWS CloudFront call
     * <code>ListDistributionsByWebACLId</code>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL. If you want the list of AWS CloudFront resources, use the AWS CloudFront call
     * <code>ListDistributionsByWebACLId</code>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the <a>TagInfoForResource</a> for the specified resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Retrieves the <a>TagInfoForResource</a> for the specified resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are operating. If you are capturing logs
     * for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are operating. If you are capturing logs
     * for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <note>
     * <p>
     * Do not create the data firehose using a <code>Kinesis stream</code> as your source.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs that you can associate with AWS
     * resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify
     * one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Associates tags with the specified AWS resource. Tags are key:value pairs that you can associate with AWS
     * resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify
     * one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Disassociates tags from an AWS resource. Tags are key:value pairs that you can associate with AWS resources. For
     * example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags
     * to add to each container. You can add up to 50 tags to each AWS resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Disassociates tags from an AWS resource. Tags are key:value pairs that you can associate with AWS resources. For
     * example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags
     * to add to each container. You can add up to 50 tags to each AWS resource.
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>IPSet</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFV2Async.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>IPSet</a>.
     * </p>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFV2Async.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFV2Async.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
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
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>WebACL</a>.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * API, or an Application Load Balancer.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFV2Async.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest);

    /**
     * <note>
     * <p>
     * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information,
     * including how to migrate your AWS WAF resources from the prior release, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Updates the specified <a>WebACL</a>.
     * </p>
     * <p>
     * A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway
     * API, or an Application Load Balancer.
     * </p>
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
