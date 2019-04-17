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

/**
 * <p>
 * Describes a set of permissions for a security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpPermission implements Serializable, Cloneable {

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules, specifying
     * <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range you specify. For
     * <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range. For <code>58</code>
     * (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is allowed when
     * authorizing rules.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * [EC2-VPC only] The IPv6 ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Ipv6Range> ipv6Ranges;
    /**
     * <p>
     * [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is the AWS
     * service that you want to access through a VPC endpoint from instances associated with the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrefixListId> prefixListIds;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserIdGroupPair> userIdGroupPairs;
    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpRange> ipv4Ranges;

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify
     *        all codes.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *         <code>-1</code> indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify
     *         all codes.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of <code>-1</code>
     * indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of
     *        <code>-1</code> indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify
     *        all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules, specifying
     * <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range you specify. For
     * <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range. For <code>58</code>
     * (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is allowed when
     * authorizing rules.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). </p>
     *        <p>
     *        [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules,
     *        specifying <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>,
     *        <code>icmp</code>, or <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range
     *        you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     *        For <code>58</code> (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types
     *        and codes is allowed when authorizing rules.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules, specifying
     * <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range you specify. For
     * <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range. For <code>58</code>
     * (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is allowed when
     * authorizing rules.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     *         </p>
     *         <p>
     *         [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules,
     *         specifying <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>, or <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range
     *         you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port
     *         range. For <code>58</code> (ICMPv6), you can optionally specify a port range; if you don't, traffic for
     *         all types and codes is allowed when authorizing rules.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     * </p>
     * <p>
     * [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules, specifying
     * <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range you specify. For
     * <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range. For <code>58</code>
     * (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is allowed when
     * authorizing rules.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). </p>
     *        <p>
     *        [EC2-VPC only] Use <code>-1</code> to specify all protocols. When authorizing security group rules,
     *        specifying <code>-1</code> or a protocol number other than <code>tcp</code>, <code>udp</code>,
     *        <code>icmp</code>, or <code>58</code> (ICMPv6) allows traffic on all ports, regardless of any port range
     *        you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must specify a port range.
     *        For <code>58</code> (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types
     *        and codes is allowed when authorizing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC only] The IPv6 ranges.
     * </p>
     * 
     * @return [EC2-VPC only] The IPv6 ranges.
     */

    public java.util.List<Ipv6Range> getIpv6Ranges() {
        if (ipv6Ranges == null) {
            ipv6Ranges = new com.amazonaws.internal.SdkInternalList<Ipv6Range>();
        }
        return ipv6Ranges;
    }

    /**
     * <p>
     * [EC2-VPC only] The IPv6 ranges.
     * </p>
     * 
     * @param ipv6Ranges
     *        [EC2-VPC only] The IPv6 ranges.
     */

    public void setIpv6Ranges(java.util.Collection<Ipv6Range> ipv6Ranges) {
        if (ipv6Ranges == null) {
            this.ipv6Ranges = null;
            return;
        }

        this.ipv6Ranges = new com.amazonaws.internal.SdkInternalList<Ipv6Range>(ipv6Ranges);
    }

    /**
     * <p>
     * [EC2-VPC only] The IPv6 ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Ranges(java.util.Collection)} or {@link #withIpv6Ranges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv6Ranges
     *        [EC2-VPC only] The IPv6 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withIpv6Ranges(Ipv6Range... ipv6Ranges) {
        if (this.ipv6Ranges == null) {
            setIpv6Ranges(new com.amazonaws.internal.SdkInternalList<Ipv6Range>(ipv6Ranges.length));
        }
        for (Ipv6Range ele : ipv6Ranges) {
            this.ipv6Ranges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC only] The IPv6 ranges.
     * </p>
     * 
     * @param ipv6Ranges
     *        [EC2-VPC only] The IPv6 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withIpv6Ranges(java.util.Collection<Ipv6Range> ipv6Ranges) {
        setIpv6Ranges(ipv6Ranges);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is the AWS
     * service that you want to access through a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @return [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is
     *         the AWS service that you want to access through a VPC endpoint from instances associated with the
     *         security group.
     */

    public java.util.List<PrefixListId> getPrefixListIds() {
        if (prefixListIds == null) {
            prefixListIds = new com.amazonaws.internal.SdkInternalList<PrefixListId>();
        }
        return prefixListIds;
    }

    /**
     * <p>
     * [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is the AWS
     * service that you want to access through a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @param prefixListIds
     *        [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is
     *        the AWS service that you want to access through a VPC endpoint from instances associated with the security
     *        group.
     */

    public void setPrefixListIds(java.util.Collection<PrefixListId> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new com.amazonaws.internal.SdkInternalList<PrefixListId>(prefixListIds);
    }

    /**
     * <p>
     * [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is the AWS
     * service that you want to access through a VPC endpoint from instances associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixListIds(java.util.Collection)} or {@link #withPrefixListIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is
     *        the AWS service that you want to access through a VPC endpoint from instances associated with the security
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withPrefixListIds(PrefixListId... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new com.amazonaws.internal.SdkInternalList<PrefixListId>(prefixListIds.length));
        }
        for (PrefixListId ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is the AWS
     * service that you want to access through a VPC endpoint from instances associated with the security group.
     * </p>
     * 
     * @param prefixListIds
     *        [EC2-VPC only] The prefix list IDs for an AWS service. With <a>AuthorizeSecurityGroupEgress</a>, this is
     *        the AWS service that you want to access through a VPC endpoint from instances associated with the security
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withPrefixListIds(java.util.Collection<PrefixListId> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you
     *        must specify all codes.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *         indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you
     *         must specify all codes.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code> indicates
     * all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of <code>-1</code>
     *        indicates all ICMP/ICMPv6 codes for the specified ICMP type. If you specify all ICMP/ICMPv6 types, you
     *        must specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withToPort(Integer toPort) {
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

    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        if (userIdGroupPairs == null) {
            userIdGroupPairs = new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>();
        }
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

    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }

        this.userIdGroupPairs = new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>(userIdGroupPairs);
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

    public IpPermission withUserIdGroupPairs(UserIdGroupPair... userIdGroupPairs) {
        if (this.userIdGroupPairs == null) {
            setUserIdGroupPairs(new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>(userIdGroupPairs.length));
        }
        for (UserIdGroupPair ele : userIdGroupPairs) {
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

    public IpPermission withUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
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

    public java.util.List<IpRange> getIpv4Ranges() {
        if (ipv4Ranges == null) {
            ipv4Ranges = new com.amazonaws.internal.SdkInternalList<IpRange>();
        }
        return ipv4Ranges;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * 
     * @param ipv4Ranges
     *        The IPv4 ranges.
     */

    public void setIpv4Ranges(java.util.Collection<IpRange> ipv4Ranges) {
        if (ipv4Ranges == null) {
            this.ipv4Ranges = null;
            return;
        }

        this.ipv4Ranges = new com.amazonaws.internal.SdkInternalList<IpRange>(ipv4Ranges);
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv4Ranges(java.util.Collection)} or {@link #withIpv4Ranges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv4Ranges
     *        The IPv4 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withIpv4Ranges(IpRange... ipv4Ranges) {
        if (this.ipv4Ranges == null) {
            setIpv4Ranges(new com.amazonaws.internal.SdkInternalList<IpRange>(ipv4Ranges.length));
        }
        for (IpRange ele : ipv4Ranges) {
            this.ipv4Ranges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * 
     * @param ipv4Ranges
     *        The IPv4 ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpPermission withIpv4Ranges(java.util.Collection<IpRange> ipv4Ranges) {
        setIpv4Ranges(ipv4Ranges);
        return this;
    }

    /**
     * <p>
     * One or more IP ranges.
     * </p>
     *
     * @return One or more IP ranges.
     * @deprecated Use {@link #getIpv4Ranges()}.
     */
    @Deprecated
    public java.util.List<String> getIpRanges() {
        if (ipv4Ranges == null) {
            ipv4Ranges = new com.amazonaws.internal.SdkInternalList<IpRange>();
        }
        return newLegacyIpRangeList(ipv4Ranges);
    }

    /**
     * <p>
     * One or more IP ranges.
     * </p>
     *
     * @param ipRanges
     *        One or more IP ranges.
     * @deprecated Use {@link #setIpv4Ranges(java.util.Collection)}
     */
    @Deprecated
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipv4Ranges = null;
            return;
        }

        this.ipv4Ranges = newIpRangeList(ipRanges);
    }

    /**
     * <p>
     * One or more IP ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRanges(java.util.Collection)} or {@link #withIpRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     *
     * @param ipRanges
     *        One or more IP ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @deprecated Use {@link #withIpv4Ranges(IpRange...)}
     */
    @Deprecated
    public IpPermission withIpRanges(String... ipRanges) {
        if (this.ipv4Ranges == null) {
            setIpRanges(new com.amazonaws.internal.SdkInternalList<String>(ipRanges.length));
        }
        for (String ele : ipRanges) {
            this.ipv4Ranges.add(newIpRange(ele));
        }
        return this;
    }

    /**
     * <p>
     * One or more IP ranges.
     * </p>
     *
     * @param ipRanges
     *        One or more IP ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @deprecated Use {@link #withIpv4Ranges(java.util.Collection)}
     */
    @Deprecated
    public IpPermission withIpRanges(java.util.Collection<String> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    private IpRange newIpRange(String ipRange) {
        return new IpRange().withCidrIp(ipRange);
    }

    private com.amazonaws.internal.SdkInternalList<IpRange> newIpRangeList(java.util.Collection<String> ipRanges) {
        com.amazonaws.internal.SdkInternalList<IpRange> ipRangeList = new com.amazonaws.internal.SdkInternalList<IpRange>(ipRanges.size());
        for (String ipRange : ipRanges) {
            ipRangeList.add(newIpRange(ipRange));
        }
        return ipRangeList;
    }

    private java.util.List<String> newLegacyIpRangeList(java.util.List<IpRange> ipRanges) {
        java.util.List<String> ipRangeList = new java.util.ArrayList<String>();
        for (IpRange ipRange : ipRanges) {
            ipRangeList.add(ipRange.getCidrIp());
        }
        return ipRangeList;
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getIpv6Ranges() != null)
            sb.append("Ipv6Ranges: ").append(getIpv6Ranges()).append(",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: ").append(getPrefixListIds()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getUserIdGroupPairs() != null)
            sb.append("UserIdGroupPairs: ").append(getUserIdGroupPairs()).append(",");
        if (getIpv4Ranges() != null)
            sb.append("Ipv4Ranges: ").append(getIpv4Ranges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpPermission == false)
            return false;
        IpPermission other = (IpPermission) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getIpv6Ranges() == null ^ this.getIpv6Ranges() == null)
            return false;
        if (other.getIpv6Ranges() != null && other.getIpv6Ranges().equals(this.getIpv6Ranges()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null)
            return false;
        if (other.getUserIdGroupPairs() != null && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false)
            return false;
        if (other.getIpv4Ranges() == null ^ this.getIpv4Ranges() == null)
            return false;
        if (other.getIpv4Ranges() != null && other.getIpv4Ranges().equals(this.getIpv4Ranges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getIpv6Ranges() == null) ? 0 : getIpv6Ranges().hashCode());
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode());
        hashCode = prime * hashCode + ((getIpv4Ranges() == null) ? 0 : getIpv4Ranges().hashCode());
        return hashCode;
    }

    @Override
    public IpPermission clone() {
        try {
            return (IpPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
