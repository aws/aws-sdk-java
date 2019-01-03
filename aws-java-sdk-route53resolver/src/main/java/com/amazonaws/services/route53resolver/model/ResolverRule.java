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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For queries that originate in your VPC, detailed information about a resolver rule, which specifies how to route DNS
 * queries out of the VPC. The <code>ResolverRule</code> parameter appears in the response to a
 * <a>CreateResolverRule</a>, <a>DeleteResolverRule</a>, <a>GetResolverRule</a>, <a>ListResolverRules</a>, or
 * <a>UpdateResolverRule</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that Resolver assigned to the resolver rule when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>identifies
     * the request and allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the
     * resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A code that specifies the current status of the resolver rule.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed description of the status of a resolver rule.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     */
    private String ruleType;
    /**
     * <p>
     * The name for the resolver rule, which you specified when you created the resolver rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array that contains the IP addresses and ports that you want to forward
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
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     */
    private String shareStatus;

    /**
     * <p>
     * The ID that Resolver assigned to the resolver rule when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Resolver assigned to the resolver rule when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Resolver assigned to the resolver rule when you created it.
     * </p>
     * 
     * @return The ID that Resolver assigned to the resolver rule when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Resolver assigned to the resolver rule when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Resolver assigned to the resolver rule when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>identifies
     * the request and allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>
     *        identifies the request and allows failed requests to be retried without the risk of executing the
     *        operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>identifies
     * the request and allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @return A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>
     *         identifies the request and allows failed requests to be retried without the risk of executing the
     *         operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>identifies
     * the request and allows failed requests to be retried without the risk of executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that you specified when you created the resolver rule. <code>CreatorRequestId</code>
     *        identifies the request and allows failed requests to be retried without the risk of executing the
     *        operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the resolver rule specified by <code>Id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the
     * resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *        <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com), the
     *        query is routed using the resolver rule that contains the most specific domain name (www.example.com).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the
     * resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *         <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com), the
     *         query is routed using the resolver rule that contains the most specific domain name (www.example.com).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in <code>TargetIps</code>.
     * If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the
     * resolver rule that contains the most specific domain name (www.example.com).
     * </p>
     * 
     * @param domainName
     *        DNS queries for this domain name are forwarded to the IP addresses that are specified in
     *        <code>TargetIps</code>. If a query matches multiple resolver rules (example.com and www.example.com), the
     *        query is routed using the resolver rule that contains the most specific domain name (www.example.com).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver rule.
     * @see ResolverRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver rule.
     * </p>
     * 
     * @return A code that specifies the current status of the resolver rule.
     * @see ResolverRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleStatus
     */

    public ResolverRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the resolver rule.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleStatus
     */

    public ResolverRule withStatus(ResolverRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed description of the status of a resolver rule.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of a resolver rule.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of a resolver rule.
     * </p>
     * 
     * @return A detailed description of the status of a resolver rule.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of a resolver rule.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of a resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @see RuleTypeOption
     */

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * <p>
     * This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @return This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @see RuleTypeOption
     */

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * <p>
     * This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public ResolverRule withRuleType(String ruleType) {
        setRuleType(ruleType);
        return this;
    }

    /**
     * <p>
     * This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * </p>
     * 
     * @param ruleType
     *        This value is always <code>FORWARD</code>. Other resolver rule types aren't supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleTypeOption
     */

    public ResolverRule withRuleType(RuleTypeOption ruleType) {
        this.ruleType = ruleType.toString();
        return this;
    }

    /**
     * <p>
     * The name for the resolver rule, which you specified when you created the resolver rule.
     * </p>
     * 
     * @param name
     *        The name for the resolver rule, which you specified when you created the resolver rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the resolver rule, which you specified when you created the resolver rule.
     * </p>
     * 
     * @return The name for the resolver rule, which you specified when you created the resolver rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the resolver rule, which you specified when you created the resolver rule.
     * </p>
     * 
     * @param name
     *        The name for the resolver rule, which you specified when you created the resolver rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that you want to forward
     * </p>
     * 
     * @return An array that contains the IP addresses and ports that you want to forward
     */

    public java.util.List<TargetAddress> getTargetIps() {
        return targetIps;
    }

    /**
     * <p>
     * An array that contains the IP addresses and ports that you want to forward
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that you want to forward
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
     * An array that contains the IP addresses and ports that you want to forward
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIps(java.util.Collection)} or {@link #withTargetIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that you want to forward
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
     * An array that contains the IP addresses and ports that you want to forward
     * </p>
     * 
     * @param targetIps
     *        An array that contains the IP addresses and ports that you want to forward
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
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rules is shared and, if so, whether the current account is sharing the rule with another
     *        account, or another account is sharing the rule with the current account.
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @return Whether the rules is shared and, if so, whether the current account is sharing the rule with another
     *         account, or another account is sharing the rule with the current account.
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rules is shared and, if so, whether the current account is sharing the rule with another
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
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or
     * another account is sharing the rule with the current account.
     * </p>
     * 
     * @param shareStatus
     *        Whether the rules is shared and, if so, whether the current account is sharing the rule with another
     *        account, or another account is sharing the rule with the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ResolverRule withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
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
            sb.append("ShareStatus: ").append(getShareStatus());
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
