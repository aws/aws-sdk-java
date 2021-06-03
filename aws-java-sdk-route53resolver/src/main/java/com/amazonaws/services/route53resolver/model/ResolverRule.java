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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For queries that originate in your VPC, detailed information about a Resolver rule, which specifies how to route DNS
 * queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html"
 * >CreateResolverRule</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DeleteResolverRule.html"
 * >DeleteResolverRule</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetResolverRule.html"
 * >GetResolverRule</a>, <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListResolverRules.html"
 * >ListResolverRules</a>, or <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_UpdateResolverRule.html"
 * >UpdateResolverRule</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that Resolver assigned to the Resolver rule when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code> identifies
     * the request and allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is routed using the
     * Resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A code that specifies the current status of the Resolver rule.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed description of the status of a Resolver rule.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     * <code>FORWARD</code>.
     * </p>
     * <p>
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to
     * process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     * </p>
     * <p>
     * For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify
     * <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for apex.example.com, you
     * create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     * </p>
     * <p>
     * Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for <code>RuleType</code>.
     * </p>
     */
    private String ruleType;
    /**
     * <p>
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically,
     * these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * </p>
     */
    private java.util.List<TargetAddress> targetIps;
    /**
     * <p>
     * The ID of the endpoint that the rule is associated with.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Whether the rule is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     */
    private String shareStatus;
    /**
     * <p>
     * The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The ID that Resolver assigned to the Resolver rule when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Resolver assigned to the Resolver rule when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Resolver assigned to the Resolver rule when you created it.
     * </p>
     * 
     * @return The ID that Resolver assigned to the Resolver rule when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Resolver assigned to the Resolver rule when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Resolver assigned to the Resolver rule when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code> identifies
     * the request and allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code>
     *        identifies the request and allows failed requests to be retried without the risk of running the operation
     *        twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code> identifies
     * the request and allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @return A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code>
     *         identifies the request and allows failed requests to be retried without the risk of running the operation
     *         twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code> identifies
     * the request and allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that you specified when you created the Resolver rule. <code>CreatorRequestId</code>
     *        identifies the request and allows failed requests to be retried without the risk of running the operation
     *        twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the Resolver rule specified by <code>Id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is routed using the
     * Resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *        <code>TargetIps</code>. If a query matches multiple Resolver rules (example.com and www.example.com), the
     *        query is routed using the Resolver rule that contains the most specific domain name (www.example.com).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is routed using the
     * Resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *         <code>TargetIps</code>. If a query matches multiple Resolver rules (example.com and www.example.com), the
     *         query is routed using the Resolver rule that contains the most specific domain name (www.example.com).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is routed using the
     * Resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *        <code>TargetIps</code>. If a query matches multiple Resolver rules (example.com and www.example.com), the
     *        query is routed using the Resolver rule that contains the most specific domain name (www.example.com).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the Resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the Resolver rule.
     * @see ResolverRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A code that specifies the current status of the Resolver rule.
     * </p>
     * 
     * @return A code that specifies the current status of the Resolver rule.
     * @see ResolverRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A code that specifies the current status of the Resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the Resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleStatus
     */

    public ResolverRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the Resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the Resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleStatus
     */

    public ResolverRule withStatus(ResolverRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed description of the status of a Resolver rule.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of a Resolver rule.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of a Resolver rule.
     * </p>
     * 
     * @return A detailed description of the status of a Resolver rule.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of a Resolver rule.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of a Resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     * <code>FORWARD</code>.
     * </p>
     * <p>
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to
     * process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     * </p>
     * <p>
     * For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify
     * <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for apex.example.com, you
     * create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     * </p>
     * <p>
     * Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for <code>RuleType</code>.
     * </p>
     * 
     * @param ruleType
     *        When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     *        <code>FORWARD</code>.</p>
     *        <p>
     *        When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver
     *        to process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     *        </p>
     *        <p>
     *        For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and
     *        specify <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for
     *        apex.example.com, you create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     *        </p>
     *        <p>
     *        Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for
     *        <code>RuleType</code>.
     * @see RuleTypeOption
     */

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * <p>
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     * <code>FORWARD</code>.
     * </p>
     * <p>
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to
     * process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     * </p>
     * <p>
     * For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify
     * <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for apex.example.com, you
     * create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     * </p>
     * <p>
     * Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for <code>RuleType</code>.
     * </p>
     * 
     * @return When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     *         <code>FORWARD</code>.</p>
     *         <p>
     *         When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver
     *         to process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     *         </p>
     *         <p>
     *         For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and
     *         specify <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for
     *         apex.example.com, you create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     *         </p>
     *         <p>
     *         Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for
     *         <code>RuleType</code>.
     * @see RuleTypeOption
     */

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * <p>
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     * <code>FORWARD</code>.
     * </p>
     * <p>
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to
     * process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     * </p>
     * <p>
     * For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify
     * <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for apex.example.com, you
     * create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     * </p>
     * <p>
     * Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for <code>RuleType</code>.
     * </p>
     * 
     * @param ruleType
     *        When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     *        <code>FORWARD</code>.</p>
     *        <p>
     *        When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver
     *        to process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     *        </p>
     *        <p>
     *        For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and
     *        specify <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for
     *        apex.example.com, you create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     *        </p>
     *        <p>
     *        Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for
     *        <code>RuleType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public ResolverRule withRuleType(String ruleType) {
        setRuleType(ruleType);
        return this;
    }

    /**
     * <p>
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     * <code>FORWARD</code>.
     * </p>
     * <p>
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to
     * process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     * </p>
     * <p>
     * For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify
     * <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for apex.example.com, you
     * create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     * </p>
     * <p>
     * Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for <code>RuleType</code>.
     * </p>
     * 
     * @param ruleType
     *        When you want to forward DNS queries for specified domain name to resolvers on your network, specify
     *        <code>FORWARD</code>.</p>
     *        <p>
     *        When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver
     *        to process queries for a subdomain of that domain, specify <code>SYSTEM</code>.
     *        </p>
     *        <p>
     *        For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and
     *        specify <code>FORWARD</code> for <code>RuleType</code>. To then have Resolver process queries for
     *        apex.example.com, you create a rule and specify <code>SYSTEM</code> for <code>RuleType</code>.
     *        </p>
     *        <p>
     *        Currently, only Resolver can create rules that have a value of <code>RECURSIVE</code> for
     *        <code>RuleType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public ResolverRule withRuleType(RuleTypeOption ruleType) {
        this.ruleType = ruleType.toString();
        return this;
    }

    /**
     * <p>
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     * </p>
     * 
     * @param name
     *        The name for the Resolver rule, which you specified when you created the Resolver rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     * </p>
     * 
     * @return The name for the Resolver rule, which you specified when you created the Resolver rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     * </p>
     * 
     * @param name
     *        The name for the Resolver rule, which you specified when you created the Resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically,
     * these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * </p>
     * 
     * @return An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to.
     *         Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is
     *         not supported.
     */

    public java.util.List<TargetAddress> getTargetIps() {
        return targetIps;
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically,
     * these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to.
     *        Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is
     *        not supported.
     */

    public void setTargetIps(java.util.Collection<TargetAddress> targetIps) {
        if (targetIps == null) {
            this.targetIps = null;
            return;
        }

        this.targetIps = new java.util.ArrayList<TargetAddress>(targetIps);
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically,
     * these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIps(java.util.Collection)} or {@link #withTargetIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to.
     *        Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is
     *        not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withTargetIps(TargetAddress... targetIps) {
        if (this.targetIps == null) {
            setTargetIps(new java.util.ArrayList<TargetAddress>(targetIps.length));
        }
        for (TargetAddress ele : targetIps) {
            this.targetIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically,
     * these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to.
     *        Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is
     *        not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withTargetIps(java.util.Collection<TargetAddress> targetIps) {
        setTargetIps(targetIps);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint that the rule is associated with.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the endpoint that the rule is associated with.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint that the rule is associated with.
     * </p>
     * 
     * @return The ID of the endpoint that the rule is associated with.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint that the rule is associated with.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the endpoint that the rule is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * </p>
     * 
     * @param ownerId
     *        When a rule is shared with another AWS account, the account ID of the account that the rule is shared
     *        with.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * </p>
     * 
     * @return When a rule is shared with another AWS account, the account ID of the account that the rule is shared
     *         with.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * </p>
     * 
     * @param ownerId
     *        When a rule is shared with another AWS account, the account ID of the account that the rule is shared
     *        with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Whether the rule is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule is shared and, if so, whether the current account is sharing the rule with another
     *        account, or another account is sharing the rule with the current account.
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * Whether the rule is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @return Whether the rule is shared and, if so, whether the current account is sharing the rule with another
     *         account, or another account is sharing the rule with the current account.
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * Whether the rule is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule is shared and, if so, whether the current account is sharing the rule with another
     *        account, or another account is sharing the rule with the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ResolverRule withShareStatus(String shareStatus) {
        setShareStatus(shareStatus);
        return this;
    }

    /**
     * <p>
     * Whether the rule is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule is shared and, if so, whether the current account is sharing the rule with another
     *        account, or another account is sharing the rule with the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ResolverRule withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withModificationTime(String modificationTime) {
        setModificationTime(modificationTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getRuleType() != null)
            sb.append("RuleType: ").append(getRuleType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTargetIps() != null)
            sb.append("TargetIps: ").append(getTargetIps()).append(",");
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getShareStatus() != null)
            sb.append("ShareStatus: ").append(getShareStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverRule == false)
            return false;
        ResolverRule other = (ResolverRule) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getRuleType() == null ^ this.getRuleType() == null)
            return false;
        if (other.getRuleType() != null && other.getRuleType().equals(this.getRuleType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTargetIps() == null ^ this.getTargetIps() == null)
            return false;
        if (other.getTargetIps() != null && other.getTargetIps().equals(this.getTargetIps()) == false)
            return false;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getShareStatus() == null ^ this.getShareStatus() == null)
            return false;
        if (other.getShareStatus() != null && other.getShareStatus().equals(this.getShareStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getRuleType() == null) ? 0 : getRuleType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTargetIps() == null) ? 0 : getTargetIps().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public ResolverRule clone() {
        try {
            return (ResolverRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
