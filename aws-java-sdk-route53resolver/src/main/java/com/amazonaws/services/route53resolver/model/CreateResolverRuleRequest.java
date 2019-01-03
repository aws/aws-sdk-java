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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     */
    private String ruleType;
    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that you specify in <code>TargetIps</code>. If
     * a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using
     * the resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     * addresses with a comma.
     * </p>
     */
    private java.util.List<TargetAddress> targetIps;
    /**
     * <p>
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you
     * specify in <code>TargetIps</code>.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for
     *         example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of executing the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @return A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @see RuleTypeOption
     */

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * <p>
     * Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @return Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @see RuleTypeOption
     */

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * <p>
     * Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public CreateResolverRuleRequest withRuleType(String ruleType) {
        setRuleType(ruleType);
        return this;
    }

    /**
     * <p>
     * Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        Specify <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public CreateResolverRuleRequest withRuleType(RuleTypeOption ruleType) {
        this.ruleType = ruleType.toString();
        return this;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that you specify in <code>TargetIps</code>. If
     * a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using
     * the resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that you specify in
     *        <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com),
     *        outbound DNS queries are routed using the resolver rule that contains the most specific domain name
     *        (www.example.com).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that you specify in <code>TargetIps</code>. If
     * a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using
     * the resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @return DNS queries for this domain name are forwarded to the IP addresses that you specify in
     *         <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com),
     *         outbound DNS queries are routed using the resolver rule that contains the most specific domain name
     *         (www.example.com).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that you specify in <code>TargetIps</code>. If
     * a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using
     * the resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that you specify in
     *        <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com),
     *        outbound DNS queries are routed using the resolver rule that contains the most specific domain name
     *        (www.example.com).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     * addresses with a comma.
     * </p>
     * 
     * @return The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate
     *         IP addresses with a comma.
     */

    public java.util.List<TargetAddress> getTargetIps() {
        return targetIps;
    }

    /**
     * <p>
     * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     * addresses with a comma.
     * </p>
     * 
     * @param targetIps
     *        The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     *        addresses with a comma.
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
     * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     * addresses with a comma.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIps(java.util.Collection)} or {@link #withTargetIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIps
     *        The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     *        addresses with a comma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withTargetIps(TargetAddress... targetIps) {
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
     * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     * addresses with a comma.
     * </p>
     * 
     * @param targetIps
     *        The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP
     *        addresses with a comma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withTargetIps(java.util.Collection<TargetAddress> targetIps) {
        setTargetIps(targetIps);
        return this;
    }

    /**
     * <p>
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you
     * specify in <code>TargetIps</code>.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses
     *        that you specify in <code>TargetIps</code>.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you
     * specify in <code>TargetIps</code>.
     * </p>
     * 
     * @return The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses
     *         that you specify in <code>TargetIps</code>.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you
     * specify in <code>TargetIps</code>.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses
     *        that you specify in <code>TargetIps</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the endpoint.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the endpoint.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleType() != null)
            sb.append("RuleType: ").append(getRuleType()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTargetIps() != null)
            sb.append("TargetIps: ").append(getTargetIps()).append(",");
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverRuleRequest == false)
            return false;
        CreateResolverRuleRequest other = (CreateResolverRuleRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleType() == null ^ this.getRuleType() == null)
            return false;
        if (other.getRuleType() != null && other.getRuleType().equals(this.getRuleType()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTargetIps() == null ^ this.getTargetIps() == null)
            return false;
        if (other.getTargetIps() != null && other.getTargetIps().equals(this.getTargetIps()) == false)
            return false;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleType() == null) ? 0 : getRuleType().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTargetIps() == null) ? 0 : getTargetIps().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverRuleRequest clone() {
        return (CreateResolverRuleRequest) super.clone();
    }

}
