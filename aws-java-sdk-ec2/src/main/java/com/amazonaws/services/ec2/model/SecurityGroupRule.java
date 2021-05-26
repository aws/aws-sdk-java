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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SecurityGroupRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRule implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     */
    private String securityGroupRuleId;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The ID of the AWS account that owns the security group.
     * </p>
     */
    private String groupOwnerId;
    /**
     * <p>
     * Indicates whether the security group rule is an outbound rule.
     * </p>
     */
    private Boolean isEgress;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The IPv4 CIDR range.
     * </p>
     */
    private String cidrIpv4;
    /**
     * <p>
     * The IPv6 CIDR range.
     * </p>
     */
    private String cidrIpv6;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * Describes the security group that is referenced in the rule.
     * </p>
     */
    private ReferencedSecurityGroup referencedGroupInfo;
    /**
     * <p>
     * The security group rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @param securityGroupRuleId
     *        The ID of the security group rule.
     */

    public void setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
    }

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @return The ID of the security group rule.
     */

    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    /**
     * <p>
     * The ID of the security group rule.
     * </p>
     * 
     * @param securityGroupRuleId
     *        The ID of the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withSecurityGroupRuleId(String securityGroupRuleId) {
        setSecurityGroupRuleId(securityGroupRuleId);
        return this;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @return The ID of the security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the security group.
     * </p>
     * 
     * @param groupOwnerId
     *        The ID of the AWS account that owns the security group.
     */

    public void setGroupOwnerId(String groupOwnerId) {
        this.groupOwnerId = groupOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the security group.
     * </p>
     * 
     * @return The ID of the AWS account that owns the security group.
     */

    public String getGroupOwnerId() {
        return this.groupOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the security group.
     * </p>
     * 
     * @param groupOwnerId
     *        The ID of the AWS account that owns the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withGroupOwnerId(String groupOwnerId) {
        setGroupOwnerId(groupOwnerId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the security group rule is an outbound rule.
     * </p>
     * 
     * @param isEgress
     *        Indicates whether the security group rule is an outbound rule.
     */

    public void setIsEgress(Boolean isEgress) {
        this.isEgress = isEgress;
    }

    /**
     * <p>
     * Indicates whether the security group rule is an outbound rule.
     * </p>
     * 
     * @return Indicates whether the security group rule is an outbound rule.
     */

    public Boolean getIsEgress() {
        return this.isEgress;
    }

    /**
     * <p>
     * Indicates whether the security group rule is an outbound rule.
     * </p>
     * 
     * @param isEgress
     *        Indicates whether the security group rule is an outbound rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withIsEgress(Boolean isEgress) {
        setIsEgress(isEgress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the security group rule is an outbound rule.
     * </p>
     * 
     * @return Indicates whether the security group rule is an outbound rule.
     */

    public Boolean isEgress() {
        return this.isEgress;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *        Numbers</a>). </p>
     *        <p>
     *        Use <code>-1</code> to specify all protocols.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *         number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). </p>
     *         <p>
     *         Use <code>-1</code> to specify all protocols.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number (see
     * <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * Use <code>-1</code> to specify all protocols.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number (see <a href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *        Numbers</a>). </p>
     *        <p>
     *        Use <code>-1</code> to specify all protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     *        ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates
     *         all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     * ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all
     *        ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *         indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR range.
     * </p>
     * 
     * @param cidrIpv4
     *        The IPv4 CIDR range.
     */

    public void setCidrIpv4(String cidrIpv4) {
        this.cidrIpv4 = cidrIpv4;
    }

    /**
     * <p>
     * The IPv4 CIDR range.
     * </p>
     * 
     * @return The IPv4 CIDR range.
     */

    public String getCidrIpv4() {
        return this.cidrIpv4;
    }

    /**
     * <p>
     * The IPv4 CIDR range.
     * </p>
     * 
     * @param cidrIpv4
     *        The IPv4 CIDR range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withCidrIpv4(String cidrIpv4) {
        setCidrIpv4(cidrIpv4);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR range.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range.
     */

    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range.
     * </p>
     * 
     * @return The IPv6 CIDR range.
     */

    public String getCidrIpv6() {
        return this.cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range.
     * </p>
     * 
     * @param cidrIpv6
     *        The IPv6 CIDR range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withCidrIpv6(String cidrIpv6) {
        setCidrIpv6(cidrIpv6);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * Describes the security group that is referenced in the rule.
     * </p>
     * 
     * @param referencedGroupInfo
     *        Describes the security group that is referenced in the rule.
     */

    public void setReferencedGroupInfo(ReferencedSecurityGroup referencedGroupInfo) {
        this.referencedGroupInfo = referencedGroupInfo;
    }

    /**
     * <p>
     * Describes the security group that is referenced in the rule.
     * </p>
     * 
     * @return Describes the security group that is referenced in the rule.
     */

    public ReferencedSecurityGroup getReferencedGroupInfo() {
        return this.referencedGroupInfo;
    }

    /**
     * <p>
     * Describes the security group that is referenced in the rule.
     * </p>
     * 
     * @param referencedGroupInfo
     *        Describes the security group that is referenced in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withReferencedGroupInfo(ReferencedSecurityGroup referencedGroupInfo) {
        setReferencedGroupInfo(referencedGroupInfo);
        return this;
    }

    /**
     * <p>
     * The security group rule description.
     * </p>
     * 
     * @param description
     *        The security group rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The security group rule description.
     * </p>
     * 
     * @return The security group rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The security group rule description.
     * </p>
     * 
     * @param description
     *        The security group rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @return The tags applied to the security group rule.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @param tags
     *        The tags applied to the security group rule.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags applied to the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @param tags
     *        The tags applied to the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRule withTags(java.util.Collection<Tag> tags) {
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
        if (getSecurityGroupRuleId() != null)
            sb.append("SecurityGroupRuleId: ").append(getSecurityGroupRuleId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupOwnerId() != null)
            sb.append("GroupOwnerId: ").append(getGroupOwnerId()).append(",");
        if (getIsEgress() != null)
            sb.append("IsEgress: ").append(getIsEgress()).append(",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getCidrIpv4() != null)
            sb.append("CidrIpv4: ").append(getCidrIpv4()).append(",");
        if (getCidrIpv6() != null)
            sb.append("CidrIpv6: ").append(getCidrIpv6()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getReferencedGroupInfo() != null)
            sb.append("ReferencedGroupInfo: ").append(getReferencedGroupInfo()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof SecurityGroupRule == false)
            return false;
        SecurityGroupRule other = (SecurityGroupRule) obj;
        if (other.getSecurityGroupRuleId() == null ^ this.getSecurityGroupRuleId() == null)
            return false;
        if (other.getSecurityGroupRuleId() != null && other.getSecurityGroupRuleId().equals(this.getSecurityGroupRuleId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupOwnerId() == null ^ this.getGroupOwnerId() == null)
            return false;
        if (other.getGroupOwnerId() != null && other.getGroupOwnerId().equals(this.getGroupOwnerId()) == false)
            return false;
        if (other.getIsEgress() == null ^ this.getIsEgress() == null)
            return false;
        if (other.getIsEgress() != null && other.getIsEgress().equals(this.getIsEgress()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getCidrIpv4() == null ^ this.getCidrIpv4() == null)
            return false;
        if (other.getCidrIpv4() != null && other.getCidrIpv4().equals(this.getCidrIpv4()) == false)
            return false;
        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getReferencedGroupInfo() == null ^ this.getReferencedGroupInfo() == null)
            return false;
        if (other.getReferencedGroupInfo() != null && other.getReferencedGroupInfo().equals(this.getReferencedGroupInfo()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getSecurityGroupRuleId() == null) ? 0 : getSecurityGroupRuleId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupOwnerId() == null) ? 0 : getGroupOwnerId().hashCode());
        hashCode = prime * hashCode + ((getIsEgress() == null) ? 0 : getIsEgress().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getCidrIpv4() == null) ? 0 : getCidrIpv4().hashCode());
        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getReferencedGroupInfo() == null) ? 0 : getReferencedGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRule clone() {
        try {
            return (SecurityGroupRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
