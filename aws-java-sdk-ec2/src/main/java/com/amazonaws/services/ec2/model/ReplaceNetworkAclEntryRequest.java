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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReplaceNetworkAclEntryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ReplaceNetworkAclEntryRequest> {

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * Indicates whether to replace the egress rule.
     * </p>
     * <p>
     * Default: If no value is specified, we replace the ingress rule.
     * </p>
     */
    private Boolean egress;
    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6)
     * with an IPv6 CIDR block.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;
    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example <code>2001:bd8:1234:1a00::/64</code>).
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * The ID of the ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17
     * (UDP).
     * </p>
     */
    private PortRange portRange;
    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6"
     * (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes
     * that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP
     * types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an
     * IPv6 CIDR block, you must specify an ICMP type and code.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The rule number of the entry to replace.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     * </p>
     * 
     * @return The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 network range to allow or deny, in CIDR notation (for example <code>172.16.0.0/24</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * Indicates whether to replace the egress rule.
     * </p>
     * <p>
     * Default: If no value is specified, we replace the ingress rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether to replace the egress rule.</p>
     *        <p>
     *        Default: If no value is specified, we replace the ingress rule.
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether to replace the egress rule.
     * </p>
     * <p>
     * Default: If no value is specified, we replace the ingress rule.
     * </p>
     * 
     * @return Indicates whether to replace the egress rule.</p>
     *         <p>
     *         Default: If no value is specified, we replace the ingress rule.
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Indicates whether to replace the egress rule.
     * </p>
     * <p>
     * Default: If no value is specified, we replace the ingress rule.
     * </p>
     * 
     * @param egress
     *        Indicates whether to replace the egress rule.</p>
     *        <p>
     *        Default: If no value is specified, we replace the ingress rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Indicates whether to replace the egress rule.
     * </p>
     * <p>
     * Default: If no value is specified, we replace the ingress rule.
     * </p>
     * 
     * @return Indicates whether to replace the egress rule.</p>
     *         <p>
     *         Default: If no value is specified, we replace the ingress rule.
     */

    public Boolean isEgress() {
        return this.egress;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6)
     * with an IPv6 CIDR block.
     * </p>
     * 
     * @param icmpTypeCode
     *        ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58
     *        (ICMPv6) with an IPv6 CIDR block.
     */

    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6)
     * with an IPv6 CIDR block.
     * </p>
     * 
     * @return ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58
     *         (ICMPv6) with an IPv6 CIDR block.
     */

    public IcmpTypeCode getIcmpTypeCode() {
        return this.icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6)
     * with an IPv6 CIDR block.
     * </p>
     * 
     * @param icmpTypeCode
     *        ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58
     *        (ICMPv6) with an IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        setIcmpTypeCode(icmpTypeCode);
        return this;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example <code>2001:bd8:1234:1a00::/64</code>).
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range to allow or deny, in CIDR notation (for example
     *        <code>2001:bd8:1234:1a00::/64</code>).
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example <code>2001:bd8:1234:1a00::/64</code>).
     * </p>
     * 
     * @return The IPv6 network range to allow or deny, in CIDR notation (for example
     *         <code>2001:bd8:1234:1a00::/64</code>).
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example <code>2001:bd8:1234:1a00::/64</code>).
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 network range to allow or deny, in CIDR notation (for example
     *        <code>2001:bd8:1234:1a00::/64</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the ACL.
     * </p>
     * 
     * @return The ID of the ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The ID of the ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17
     * (UDP).
     * </p>
     * 
     * @param portRange
     *        TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or
     *        17 (UDP).
     */

    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17
     * (UDP).
     * </p>
     * 
     * @return TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or
     *         17 (UDP).
     */

    public PortRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17
     * (UDP).
     * </p>
     * 
     * @param portRange
     *        TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or
     *        17 (UDP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withPortRange(PortRange portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6"
     * (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes
     * that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP
     * types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an
     * IPv6 CIDR block, you must specify an ICMP type and code.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other
     *        than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     *        ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     *        block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify
     *        protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6"
     * (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes
     * that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP
     * types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an
     * IPv6 CIDR block, you must specify an ICMP type and code.
     * </p>
     * 
     * @return The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other
     *         than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     *         ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     *         block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify
     *         protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6"
     * (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes
     * that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP
     * types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an
     * IPv6 CIDR block, you must specify an ICMP type and code.
     * </p>
     * 
     * @param protocol
     *        The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other
     *        than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     *        ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     *        block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify
     *        protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @see RuleAction
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @return Indicates whether to allow or deny the traffic that matches the rule.
     * @see RuleAction
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleAction
     */

    public ReplaceNetworkAclEntryRequest withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @see RuleAction
     */

    public void setRuleAction(RuleAction ruleAction) {
        withRuleAction(ruleAction);
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * 
     * @param ruleAction
     *        Indicates whether to allow or deny the traffic that matches the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleAction
     */

    public ReplaceNetworkAclEntryRequest withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The rule number of the entry to replace.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the entry to replace.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number of the entry to replace.
     * </p>
     * 
     * @return The rule number of the entry to replace.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number of the entry to replace.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the entry to replace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReplaceNetworkAclEntryRequest> getDryRunRequest() {
        Request<ReplaceNetworkAclEntryRequest> request = new ReplaceNetworkAclEntryRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress()).append(",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: ").append(getIcmpTypeCode()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceNetworkAclEntryRequest == false)
            return false;
        ReplaceNetworkAclEntryRequest other = (ReplaceNetworkAclEntryRequest) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null)
            return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceNetworkAclEntryRequest clone() {
        return (ReplaceNetworkAclEntryRequest) super.clone();
    }
}
