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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An IP permission for an EC2 security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2SecurityGroupIpPermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupIpPermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and codes
     * is allowed.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs;
    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpRange> ipRanges;
    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpv6Range> ipv6Ranges;
    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through
     * a VPC endpoint from instances associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupPrefixListId> prefixListIds;

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and codes
     * is allowed.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number.</p>
     *        <p>
     *        [VPC only] Use <code>-1</code> to specify all protocols.
     *        </p>
     *        <p>
     *        When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     *        <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any
     *        port range you specify.
     *        </p>
     *        <p>
     *        For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     *        </p>
     *        <p>
     *        For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and
     *        codes is allowed.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and codes
     * is allowed.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *         number.</p>
     *         <p>
     *         [VPC only] Use <code>-1</code> to specify all protocols.
     *         </p>
     *         <p>
     *         When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     *         <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of
     *         any port range you specify.
     *         </p>
     *         <p>
     *         For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     *         </p>
     *         <p>
     *         For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types
     *         and codes is allowed.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     * <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and codes
     * is allowed.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>, <code>icmpv6</code>) or
     *        number.</p>
     *        <p>
     *        [VPC only] Use <code>-1</code> to specify all protocols.
     *        </p>
     *        <p>
     *        When authorizing security group rules, specifying -1 or a protocol number other than <code>tcp</code>,
     *        <code>udp</code>, <code>icmp</code>, or <code>icmpv6</code> allows traffic on all ports, regardless of any
     *        port range you specify.
     *        </p>
     *        <p>
     *        For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     *        </p>
     *        <p>
     *        For <code>icmpv6</code>, the port range is optional. If you omit the port range, traffic for all types and
     *        codes is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.</p>
     *        <p>
     *        A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all
     *        codes.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.</p>
     *         <p>
     *         A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all
     *         codes.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number.</p>
     *        <p>
     *        A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all
     *        codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.</p>
     *        <p>
     *        A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all
     *        codes.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.</p>
     *         <p>
     *         A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all
     *         codes.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code.</p>
     *        <p>
     *        A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all
     *        codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * 
     * @return The security group and AWS account ID pairs.
     */

    public java.util.List<AwsEc2SecurityGroupUserIdGroupPair> getUserIdGroupPairs() {
        return userIdGroupPairs;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group and AWS account ID pairs.
     */

    public void setUserIdGroupPairs(java.util.Collection<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }

        this.userIdGroupPairs = new java.util.ArrayList<AwsEc2SecurityGroupUserIdGroupPair>(userIdGroupPairs);
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIdGroupPairs(java.util.Collection)} or {@link #withUserIdGroupPairs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group and AWS account ID pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withUserIdGroupPairs(AwsEc2SecurityGroupUserIdGroupPair... userIdGroupPairs) {
        if (this.userIdGroupPairs == null) {
            setUserIdGroupPairs(new java.util.ArrayList<AwsEc2SecurityGroupUserIdGroupPair>(userIdGroupPairs.length));
        }
        for (AwsEc2SecurityGroupUserIdGroupPair ele : userIdGroupPairs) {
            this.userIdGroupPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group and AWS account ID pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withUserIdGroupPairs(java.util.Collection<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs) {
        setUserIdGroupPairs(userIdGroupPairs);
        return this;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * 
     * @return The IPv4 ranges.
     */

    public java.util.List<AwsEc2SecurityGroupIpRange> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * 
     * @param ipRanges
     *        The IPv4 ranges.
     */

    public void setIpRanges(java.util.Collection<AwsEc2SecurityGroupIpRange> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<AwsEc2SecurityGroupIpRange>(ipRanges);
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRanges(java.util.Collection)} or {@link #withIpRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRanges
     *        The IPv4 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withIpRanges(AwsEc2SecurityGroupIpRange... ipRanges) {
        if (this.ipRanges == null) {
            setIpRanges(new java.util.ArrayList<AwsEc2SecurityGroupIpRange>(ipRanges.length));
        }
        for (AwsEc2SecurityGroupIpRange ele : ipRanges) {
            this.ipRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * 
     * @param ipRanges
     *        The IPv4 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withIpRanges(java.util.Collection<AwsEc2SecurityGroupIpRange> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * 
     * @return The IPv6 ranges.
     */

    public java.util.List<AwsEc2SecurityGroupIpv6Range> getIpv6Ranges() {
        return ipv6Ranges;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * 
     * @param ipv6Ranges
     *        The IPv6 ranges.
     */

    public void setIpv6Ranges(java.util.Collection<AwsEc2SecurityGroupIpv6Range> ipv6Ranges) {
        if (ipv6Ranges == null) {
            this.ipv6Ranges = null;
            return;
        }

        this.ipv6Ranges = new java.util.ArrayList<AwsEc2SecurityGroupIpv6Range>(ipv6Ranges);
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Ranges(java.util.Collection)} or {@link #withIpv6Ranges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv6Ranges
     *        The IPv6 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withIpv6Ranges(AwsEc2SecurityGroupIpv6Range... ipv6Ranges) {
        if (this.ipv6Ranges == null) {
            setIpv6Ranges(new java.util.ArrayList<AwsEc2SecurityGroupIpv6Range>(ipv6Ranges.length));
        }
        for (AwsEc2SecurityGroupIpv6Range ele : ipv6Ranges) {
            this.ipv6Ranges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * 
     * @param ipv6Ranges
     *        The IPv6 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withIpv6Ranges(java.util.Collection<AwsEc2SecurityGroupIpv6Range> ipv6Ranges) {
        setIpv6Ranges(ipv6Ranges);
        return this;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through
     * a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @return [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access
     *         through a VPC endpoint from instances associated with the security group.
     */

    public java.util.List<AwsEc2SecurityGroupPrefixListId> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through
     * a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @param prefixListIds
     *        [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access
     *        through a VPC endpoint from instances associated with the security group.
     */

    public void setPrefixListIds(java.util.Collection<AwsEc2SecurityGroupPrefixListId> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<AwsEc2SecurityGroupPrefixListId>(prefixListIds);
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through
     * a VPC endpoint from instances associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixListIds(java.util.Collection)} or {@link #withPrefixListIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access
     *        through a VPC endpoint from instances associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withPrefixListIds(AwsEc2SecurityGroupPrefixListId... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new java.util.ArrayList<AwsEc2SecurityGroupPrefixListId>(prefixListIds.length));
        }
        for (AwsEc2SecurityGroupPrefixListId ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through
     * a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @param prefixListIds
     *        [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access
     *        through a VPC endpoint from instances associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupIpPermission withPrefixListIds(java.util.Collection<AwsEc2SecurityGroupPrefixListId> prefixListIds) {
        setPrefixListIds(prefixListIds);
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
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getUserIdGroupPairs() != null)
            sb.append("UserIdGroupPairs: ").append(getUserIdGroupPairs()).append(",");
        if (getIpRanges() != null)
            sb.append("IpRanges: ").append(getIpRanges()).append(",");
        if (getIpv6Ranges() != null)
            sb.append("Ipv6Ranges: ").append(getIpv6Ranges()).append(",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: ").append(getPrefixListIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpPermission == false)
            return false;
        AwsEc2SecurityGroupIpPermission other = (AwsEc2SecurityGroupIpPermission) obj;
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
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null)
            return false;
        if (other.getUserIdGroupPairs() != null && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getIpv6Ranges() == null ^ this.getIpv6Ranges() == null)
            return false;
        if (other.getIpv6Ranges() != null && other.getIpv6Ranges().equals(this.getIpv6Ranges()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode + ((getIpv6Ranges() == null) ? 0 : getIpv6Ranges().hashCode());
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2SecurityGroupIpPermission clone() {
        try {
            return (AwsEc2SecurityGroupIpPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2SecurityGroupIpPermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
