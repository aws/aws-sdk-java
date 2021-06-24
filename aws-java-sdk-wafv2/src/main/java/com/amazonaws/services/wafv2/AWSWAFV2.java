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
package com.amazonaws.services.wafv2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.wafv2.model.*;

/**
 * Interface for accessing WAFV2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.wafv2.AbstractAWSWAFV2} instead.
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "wafv2";

    /**
     * <p>
     * Associates a web ACL with a regional application resource, to protect the resource. A regional application can be
     * an Application Load Balancer (ALB), an Amazon API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To associate
     * a web ACL, in the CloudFront call <code>UpdateDistribution</code>, set the web ACL ID to the Amazon Resource Name
     * (ARN) of the web ACL. For information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return Result of the AssociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateWebACLResult associateWebACL(AssociateWebACLRequest associateWebACLRequest);

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
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param checkCapacityRequest
     * @return Result of the CheckCapacity operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @sample AWSWAFV2.CheckCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CheckCapacity" target="_top">AWS API
     *      Documentation</a>
     */
    CheckCapacityResult checkCapacity(CheckCapacityRequest checkCapacityRequest);

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to identify web requests that originate from specific IP addresses or
     * ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
     * configure WAF to block them using an IPSet that lists those IP addresses.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates a <a>RegexPatternSet</a>, which you reference in a <a>RegexPatternSetReferenceStatement</a>, to have WAF
     * inspect a web request component for the specified patterns.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return Result of the CreateRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRegexPatternSetResult createRegexPatternSet(CreateRegexPatternSetRequest createRegexPatternSetRequest);

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
     * @return Result of the CreateRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest createRuleGroupRequest);

    /**
     * <p>
     * Creates a <a>WebACL</a> per the specifications provided.
     * </p>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront
     * distribution, an Amazon API Gateway REST API, an Application Load Balancer, or an AppSync GraphQL API.
     * </p>
     * 
     * @param createWebACLRequest
     * @return Result of the CreateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWebACLResult createWebACL(CreateWebACLRequest createWebACLRequest);

    /**
     * <p>
     * Deletes all rule groups that are managed by Firewall Manager for the specified web ACL.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteFirewallManagerRuleGroupsRequest
     * @return Result of the DeleteFirewallManagerRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteFirewallManagerRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFirewallManagerRuleGroupsResult deleteFirewallManagerRuleGroups(DeleteFirewallManagerRuleGroupsRequest deleteFirewallManagerRuleGroupsRequest);

    /**
     * <p>
     * Deletes the specified <a>IPSet</a>.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFAssociatedItemException
     *         WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return Result of the DeletePermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeletePermissionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePermissionPolicyResult deletePermissionPolicy(DeletePermissionPolicyRequest deletePermissionPolicyRequest);

    /**
     * <p>
     * Deletes the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return Result of the DeleteRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFAssociatedItemException
     *         WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRegexPatternSetResult deleteRegexPatternSet(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest);

    /**
     * <p>
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @return Result of the DeleteRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFAssociatedItemException
     *         WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest);

    /**
     * <p>
     * Deletes the specified <a>WebACL</a>.
     * </p>
     * <p>
     * You can only use this if <code>ManagedByFirewallManager</code> is false in the specified <a>WebACL</a>.
     * </p>
     * 
     * @param deleteWebACLRequest
     * @return Result of the DeleteWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFAssociatedItemException
     *         WAF couldn’t perform the operation because your resource is being used by another resource or it’s
     *         associated with another resource.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWebACLResult deleteWebACL(DeleteWebACLRequest deleteWebACLRequest);

    /**
     * <p>
     * Provides high-level information for a managed rule group, including descriptions of the rules.
     * </p>
     * 
     * @param describeManagedRuleGroupRequest
     * @return Result of the DescribeManagedRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidResourceException
     *         WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DescribeManagedRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeManagedRuleGroupResult describeManagedRuleGroup(DescribeManagedRuleGroupRequest describeManagedRuleGroupRequest);

    /**
     * <p>
     * Disassociates a web ACL from a regional application resource. A regional application can be an Application Load
     * Balancer (ALB), an Amazon API Gateway REST API, or an AppSync GraphQL API.
     * </p>
     * <p>
     * For Amazon CloudFront, don't use this call. Instead, use your CloudFront distribution configuration. To
     * disassociate a web ACL, provide an empty web ACL ID in the CloudFront call <code>UpdateDistribution</code>. For
     * information, see <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html">
     * UpdateDistribution</a>.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return Result of the DisassociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DisassociateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateWebACLResult disassociateWebACL(DisassociateWebACLRequest disassociateWebACLRequest);

    /**
     * <p>
     * Retrieves the specified <a>IPSet</a>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return Result of the GetLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetLoggingConfigurationResult getLoggingConfiguration(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <p>
     * Returns the IAM policy that is attached to the specified rule group.
     * </p>
     * <p>
     * You must be the owner of the rule group to perform this operation.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return Result of the GetPermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPermissionPolicyResult getPermissionPolicy(GetPermissionPolicyRequest getPermissionPolicyRequest);

    /**
     * <p>
     * Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can
     * be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those
     * with the highest rates are blocked.
     * </p>
     * 
     * @param getRateBasedStatementManagedKeysRequest
     * @return Result of the GetRateBasedStatementManagedKeys operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRateBasedStatementManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    GetRateBasedStatementManagedKeysResult getRateBasedStatementManagedKeys(GetRateBasedStatementManagedKeysRequest getRateBasedStatementManagedKeysRequest);

    /**
     * <p>
     * Retrieves the specified <a>RegexPatternSet</a>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return Result of the GetRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetRegexPatternSetResult getRegexPatternSet(GetRegexPatternSetRequest getRegexPatternSetRequest);

    /**
     * <p>
     * Retrieves the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return Result of the GetRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleGroupResult getRuleGroup(GetRuleGroupRequest getRuleGroupRequest);

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
     * @return Result of the GetSampledRequests operation returned by the service.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFV2.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest getSampledRequestsRequest);

    /**
     * <p>
     * Retrieves the specified <a>WebACL</a>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return Result of the GetWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    GetWebACLResult getWebACL(GetWebACLRequest getWebACLRequest);

    /**
     * <p>
     * Retrieves the <a>WebACL</a> for the specified resource.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return Result of the GetWebACLForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACLForResource" target="_top">AWS API
     *      Documentation</a>
     */
    GetWebACLForResourceResult getWebACLForResource(GetWebACLForResourceRequest getWebACLForResourceRequest);

    /**
     * <p>
     * Retrieves an array of managed rule groups that are available for you to use. This list includes all Amazon Web
     * Services Managed Rules rule groups and the Marketplace managed rule groups that you're subscribed to.
     * </p>
     * 
     * @param listAvailableManagedRuleGroupsRequest
     * @return Result of the ListAvailableManagedRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListAvailableManagedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableManagedRuleGroupsResult listAvailableManagedRuleGroups(ListAvailableManagedRuleGroupsRequest listAvailableManagedRuleGroupsRequest);

    /**
     * <p>
     * Retrieves an array of <a>IPSetSummary</a> objects for the IP sets that you manage.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Retrieves an array of your <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return Result of the ListLoggingConfigurations operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListLoggingConfigurationsResult listLoggingConfigurations(ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <p>
     * Retrieves an array of <a>RegexPatternSetSummary</a> objects for the regex pattern sets that you manage.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return Result of the ListRegexPatternSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListRegexPatternSetsResult listRegexPatternSets(ListRegexPatternSetsRequest listRegexPatternSetsRequest);

    /**
     * <p>
     * Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the
     * specified web ACL. If you want the list of Amazon CloudFront resources, use the CloudFront call
     * <code>ListDistributionsByWebACLId</code>.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return Result of the ListResourcesForWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListResourcesForWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourcesForWebACLResult listResourcesForWebACL(ListResourcesForWebACLRequest listResourcesForWebACLRequest);

    /**
     * <p>
     * Retrieves an array of <a>RuleGroupSummary</a> objects for the rule groups that you manage.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return Result of the ListRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest);

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves an array of <a>WebACLSummary</a> objects for the web ACLs that you manage.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return Result of the ListWebACLs operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    ListWebACLsResult listWebACLs(ListWebACLsRequest listWebACLsRequest);

    /**
     * <p>
     * Enables the specified <a>LoggingConfiguration</a>, to start logging from a web ACL, according to the
     * configuration provided.
     * </p>
     * <p>
     * You can access information about all traffic that WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose.
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the Region that you are operating. If you are capturing logs
     * for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * <p>
     * Give the data firehose a name that starts with the prefix <code>aws-waf-logs-</code>. For example,
     * <code>aws-waf-logs-us-east-2-analytics</code>.
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
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the logging configuration
     * with the ones that you provide to this call. To modify the logging configuration, retrieve it by calling
     * <a>GetLoggingConfiguration</a>, update the settings as needed, and then provide the complete logging
     * configuration specification to this call.
     * </p>
     * </note>
     * 
     * @param putLoggingConfigurationRequest
     * @return Result of the PutLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFServiceLinkedRoleErrorException
     *         WAF is not able to access the service linked role. This can be caused by a previous
     *         <code>PutLoggingConfiguration</code> request, which can lock the service linked role for about 20
     *         seconds. Please try your request again. The service linked role can also be locked by a previous
     *         <code>DeleteServiceLinkedRole</code> request, which can lock the role for 15 minutes or more. If you
     *         recently made a call to <code>DeleteServiceLinkedRole</code>, wait at least 15 minutes and try the
     *         request again. If you receive this same exception again, you will have to wait additional time until the
     *         role is unlocked.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @sample AWSWAFV2.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    PutLoggingConfigurationResult putLoggingConfiguration(PutLoggingConfigurationRequest putLoggingConfigurationRequest);

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
     * @return Result of the PutPermissionPolicy operation returned by the service.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFInvalidPermissionPolicyException
     *         The operation failed because the specified policy isn't in the proper format. </p>
     *         <p>
     *         The policy specifications must conform to the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The policy must be composed using IAM Policy version 2012-10-17 or version 2015-01-01.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy must include specifications for <code>Effect</code>, <code>Action</code>, and
     *         <code>Principal</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Effect</code> must specify <code>Allow</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Action</code> must specify <code>wafv2:CreateWebACL</code>, <code>wafv2:UpdateWebACL</code>, and
     *         <code>wafv2:PutFirewallManagerRuleGroups</code>. WAF rejects any extra actions or wildcard actions in the
     *         policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy must not include a <code>Resource</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM Policies</a>.
     * @sample AWSWAFV2.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutPermissionPolicyResult putPermissionPolicy(PutPermissionPolicyRequest putPermissionPolicyRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates tags from an Amazon Web Services resource. Tags are key:value pairs that you can associate with
     * Amazon Web Services resources. For example, the tag key might be "customer" and the tag value might be
     * "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each Amazon
     * Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFTagOperationException
     *         An error occurred during the tagging operation. Retry your request.
     * @throws WAFTagOperationInternalErrorException
     *         WAF couldn’t perform your tagging operation because of an internal error. Retry your request.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified <a>IPSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the IP set with the ones
     * that you provide to this call. To modify the IP set, retrieve it by calling <a>GetIPSet</a>, update the settings
     * as needed, and then provide the complete IP set specification to this call.
     * </p>
     * </note>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Updates the specified <a>RegexPatternSet</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the regex pattern set
     * with the ones that you provide to this call. To modify the regex pattern set, retrieve it by calling
     * <a>GetRegexPatternSet</a>, update the settings as needed, and then provide the complete regex pattern set
     * specification to this call.
     * </p>
     * </note>
     * 
     * @param updateRegexPatternSetRequest
     * @return Result of the UpdateRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRegexPatternSetResult updateRegexPatternSet(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

    /**
     * <p>
     * Updates the specified <a>RuleGroup</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the rule group with the
     * ones that you provide to this call. To modify the rule group, retrieve it by calling <a>GetRuleGroup</a>, update
     * the settings as needed, and then provide the complete rule group specification to this call.
     * </p>
     * </note>
     * <p>
     * A rule group defines a collection of rules to inspect and control web requests that you can use in a
     * <a>WebACL</a>. When you create a rule group, you define an immutable capacity limit. If you update a rule group,
     * you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity
     * requirements.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return Result of the UpdateRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <p>
     * Updates the specified <a>WebACL</a>.
     * </p>
     * <note>
     * <p>
     * This operation completely replaces the mutable specifications that you already have for the web ACL with the ones
     * that you provide to this call. To modify the web ACL, retrieve it by calling <a>GetWebACL</a>, update the
     * settings as needed, and then provide the complete web ACL specification to this call.
     * </p>
     * </note>
     * <p>
     * A web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action
     * defined (allow, block, or count) for requests that match the statement of the rule. In the web ACL, you assign a
     * default action to take (allow, block) for any request that does not match any of the rules. The rules in a web
     * ACL can be a combination of the types <a>Rule</a>, <a>RuleGroup</a>, and managed rule group. You can associate a
     * web ACL with one or more Amazon Web Services resources to protect. The resources can be an Amazon CloudFront
     * distribution, an Amazon API Gateway REST API, an Application Load Balancer, or an AppSync GraphQL API.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return Result of the UpdateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         Your request is valid, but WAF couldn’t perform the operation because of a system problem. Retry your
     *         request.
     * @throws WAFInvalidParameterException
     *         The operation failed because WAF didn't recognize a parameter in the request. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified a parameter name or value that isn't valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your nested statement isn't valid. You might have tried to nest a statement that can’t be nested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>DefaultAction</code> that isn't among the types
     *         available at <a>DefaultAction</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL can't
     *         be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         WAF couldn’t perform the operation because your resource doesn’t exist.
     * @throws WAFDuplicateItemException
     *         WAF couldn’t perform the operation because the resource that you tried to save is a duplicate of an
     *         existing one.
     * @throws WAFOptimisticLockException
     *         WAF couldn’t save your changes because you tried to update or delete a resource that has changed since
     *         you last retrieved it. Get the resource again, make any changes you need to make to the new copy, and
     *         retry your operation.
     * @throws WAFLimitsExceededException
     *         WAF couldn’t perform the operation because you exceeded your resource limit. For example, the maximum
     *         number of <code>WebACL</code> objects that you can create for an account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidResourceException
     *         WAF couldn’t perform the operation because the resource that you requested isn’t valid. Check the
     *         resource, and try again.
     * @throws WAFUnavailableEntityException
     *         WAF couldn’t retrieve the resource that you requested. Retry your request.
     * @throws WAFSubscriptionNotFoundException
     *         You tried to use a managed rule group that's available by subscription, but you aren't subscribed to it
     *         yet.
     * @throws WAFInvalidOperationException
     *         The operation isn't valid.
     * @sample AWSWAFV2.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWebACLResult updateWebACL(UpdateWebACLRequest updateWebACLRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
