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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule for the network ACL. Each rule allows or denies access based on the IP address, traffic direction, port, and
 * protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkAclEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkAclEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPV4 network range for which to deny or allow access.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
     * </p>
     */
    private Boolean egress;
    /**
     * <p>
     * The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;
    /**
     * <p>
     * The IPV6 network range for which to deny or allow access.
     * </p>
     */
    private String ipv6CidrBlock;
    /**
     * <p>
     * For TCP or UDP protocols, the range of ports that the rule applies to.
     * </p>
     */
    private PortRangeFromTo portRange;
    /**
     * <p>
     * The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Whether the rule is used to allow access or deny access.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The rule number. The rules are processed in order by their number.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The IPV4 network range for which to deny or allow access.
     * </p>
     * 
     * @param cidrBlock
     *        The IPV4 network range for which to deny or allow access.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPV4 network range for which to deny or allow access.
     * </p>
     * 
     * @return The IPV4 network range for which to deny or allow access.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPV4 network range for which to deny or allow access.
     * </p>
     * 
     * @param cidrBlock
     *        The IPV4 network range for which to deny or allow access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
     * </p>
     * 
     * @param egress
     *        Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the
     *        subnet.
     */

    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
     * </p>
     * 
     * @return Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the
     *         subnet.
     */

    public Boolean getEgress() {
        return this.egress;
    }

    /**
     * <p>
     * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
     * </p>
     * 
     * @param egress
     *        Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the
     *        subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withEgress(Boolean egress) {
        setEgress(egress);
        return this;
    }

    /**
     * <p>
     * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
     * </p>
     * 
     * @return Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the
     *         subnet.
     */

    public Boolean isEgress() {
        return this.egress;
    }

    /**
     * <p>
     * The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     * </p>
     * 
     * @param icmpTypeCode
     *        The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     */

    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     * </p>
     * 
     * @return The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     */

    public IcmpTypeCode getIcmpTypeCode() {
        return this.icmpTypeCode;
    }

    /**
     * <p>
     * The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     * </p>
     * 
     * @param icmpTypeCode
     *        The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        setIcmpTypeCode(icmpTypeCode);
        return this;
    }

    /**
     * <p>
     * The IPV6 network range for which to deny or allow access.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPV6 network range for which to deny or allow access.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPV6 network range for which to deny or allow access.
     * </p>
     * 
     * @return The IPV6 network range for which to deny or allow access.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPV6 network range for which to deny or allow access.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPV6 network range for which to deny or allow access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * <p>
     * For TCP or UDP protocols, the range of ports that the rule applies to.
     * </p>
     * 
     * @param portRange
     *        For TCP or UDP protocols, the range of ports that the rule applies to.
     */

    public void setPortRange(PortRangeFromTo portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * For TCP or UDP protocols, the range of ports that the rule applies to.
     * </p>
     * 
     * @return For TCP or UDP protocols, the range of ports that the rule applies to.
     */

    public PortRangeFromTo getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * For TCP or UDP protocols, the range of ports that the rule applies to.
     * </p>
     * 
     * @param portRange
     *        For TCP or UDP protocols, the range of ports that the rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withPortRange(PortRangeFromTo portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     * </p>
     * 
     * @param protocol
     *        The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     * </p>
     * 
     * @return The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     * </p>
     * 
     * @param protocol
     *        The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Whether the rule is used to allow access or deny access.
     * </p>
     * 
     * @param ruleAction
     *        Whether the rule is used to allow access or deny access.
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * Whether the rule is used to allow access or deny access.
     * </p>
     * 
     * @return Whether the rule is used to allow access or deny access.
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * Whether the rule is used to allow access or deny access.
     * </p>
     * 
     * @param ruleAction
     *        Whether the rule is used to allow access or deny access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The rule number. The rules are processed in order by their number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number. The rules are processed in order by their number.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number. The rules are processed in order by their number.
     * </p>
     * 
     * @return The rule number. The rules are processed in order by their number.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number. The rules are processed in order by their number.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number. The rules are processed in order by their number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getEgress() != null)
            sb.append("Egress: ").append(getEgress()).append(",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: ").append(getIcmpTypeCode()).append(",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock()).append(",");
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

        if (obj instanceof AwsEc2NetworkAclEntry == false)
            return false;
        AwsEc2NetworkAclEntry other = (AwsEc2NetworkAclEntry) obj;
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
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkAclEntry clone() {
        try {
            return (AwsEc2NetworkAclEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkAclEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
