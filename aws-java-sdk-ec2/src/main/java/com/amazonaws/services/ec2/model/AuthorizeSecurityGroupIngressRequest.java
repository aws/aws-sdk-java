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
import com.amazonaws.services.ec2.model.transform.AuthorizeSecurityGroupIngressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AuthorizeSecurityGroupIngressRequest> {

    /**
     * <p>
     * The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6 type
     * number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC only)
     * Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number other than
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you
     * must specify a port range. For protocol <code>58</code> (ICMPv6), you can optionally specify a port range; if you
     * don't, traffic for all types and codes is allowed.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be
     * in the same VPC.
     * </p>
     */
    private String sourceSecurityGroupName;
    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP
     * permissions instead.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6 code
     * number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     */
    private Integer toPort;

    /**
     * Default constructor for AuthorizeSecurityGroupIngressRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public AuthorizeSecurityGroupIngressRequest() {
    }

    /**
     * Constructs a new AuthorizeSecurityGroupIngressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     * @param ipPermissions
     *        The sets of IP permissions. Can be used to specify multiple rules in a single command.
     */
    public AuthorizeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        setGroupName(groupName);
        setIpPermissions(ipPermissions);
    }

    /**
     * <p>
     * The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @return The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IPv4 address range. You can't specify this parameter when specifying a source security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6 type
     * number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6
     *        type number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must
     *        specify all codes.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6 type
     * number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6
     *         type number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must
     *         specify all codes.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6 type
     * number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. For the ICMP/ICMPv6
     *        type number, use <code>-1</code> to specify all types. If you specify all ICMP/ICMPv6 types, you must
     *        specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. You must specify either the security group ID or the security group name in
     *        the request. For security groups in a nondefault VPC, you must specify the security group ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @return The ID of the security group. You must specify either the security group ID or the security group name in
     *         the request. For security groups in a nondefault VPC, you must specify the security group ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group ID or the security group name in the
     * request. For security groups in a nondefault VPC, you must specify the security group ID.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group. You must specify either the security group ID or the security group name in
     *        the request. For security groups in a nondefault VPC, you must specify the security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *         or the security group name in the request.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the
     * security group name in the request.
     * </p>
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * </p>
     * 
     * @return The sets of IP permissions. Can be used to specify multiple rules in a single command.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. Can be used to specify multiple rules in a single command.
     */

    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (this.ipPermissions == null) {
            setIpPermissions(new com.amazonaws.internal.SdkInternalList<IpPermission>(ipPermissions.length));
        }
        for (IpPermission ele : ipPermissions) {
            this.ipPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. Can be used to specify multiple rules in a single command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC only)
     * Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number other than
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you
     * must specify a port range. For protocol <code>58</code> (ICMPv6), you can optionally specify a port range; if you
     * don't, traffic for all types and codes is allowed.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC
     *        only) Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number
     *        other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on
     *        all ports is allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and
     *        <code>icmp</code>, you must specify a port range. For protocol <code>58</code> (ICMPv6), you can
     *        optionally specify a port range; if you don't, traffic for all types and codes is allowed.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC only)
     * Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number other than
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you
     * must specify a port range. For protocol <code>58</code> (ICMPv6), you can optionally specify a port range; if you
     * don't, traffic for all types and codes is allowed.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>).
     *         (VPC only) Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol
     *         number other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6),
     *         traffic on all ports is allowed, regardless of any ports you specify. For <code>tcp</code>,
     *         <code>udp</code>, and <code>icmp</code>, you must specify a port range. For protocol <code>58</code>
     *         (ICMPv6), you can optionally specify a port range; if you don't, traffic for all types and codes is
     *         allowed.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC only)
     * Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number other than
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you
     * must specify a port range. For protocol <code>58</code> (ICMPv6), you can optionally specify a port range; if you
     * don't, traffic for all types and codes is allowed.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). (VPC
     *        only) Use <code>-1</code> to specify all protocols. If you specify <code>-1</code>, or a protocol number
     *        other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or <code>58</code> (ICMPv6), traffic on
     *        all ports is allowed, regardless of any ports you specify. For <code>tcp</code>, <code>udp</code>, and
     *        <code>icmp</code>, you must specify a port range. For protocol <code>58</code> (ICMPv6), you can
     *        optionally specify a port range; if you don't, traffic for all types and codes is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be
     * in the same VPC.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *        combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *        protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To
     *        create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For
     *        EC2-VPC, the source security group must be in the same VPC.
     */

    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be
     * in the same VPC.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *         combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *         protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To
     *         create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For
     *         EC2-VPC, the source security group must be in the same VPC.
     */

    public String getSourceSecurityGroupName() {
        return this.sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be
     * in the same VPC.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *        combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *        protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To
     *        create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For
     *        EC2-VPC, the source security group must be in the same VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        setSourceSecurityGroupName(sourceSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP
     * permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a
     *        different account. You can't specify this parameter in combination with the following parameters: the CIDR
     *        IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates
     *        rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port
     *        range, use a set of IP permissions instead.
     */

    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP
     * permissions instead.
     * </p>
     * 
     * @return [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a
     *         different account. You can't specify this parameter in combination with the following parameters: the
     *         CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range.
     *         Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and
     *         port range, use a set of IP permissions instead.
     */

    public String getSourceSecurityGroupOwnerId() {
        return this.sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP
     * permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a
     *        different account. You can't specify this parameter in combination with the following parameters: the CIDR
     *        IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates
     *        rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port
     *        range, use a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        setSourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6 code
     * number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6
     *        code number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must
     *        specify all codes.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6 code
     * number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6
     *         code number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must
     *         specify all codes.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6 code
     * number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must specify all
     * codes.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code number. For the ICMP/ICMPv6
     *        code number, use <code>-1</code> to specify all codes. If you specify all ICMP/ICMPv6 types, you must
     *        specify all codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AuthorizeSecurityGroupIngressRequest> getDryRunRequest() {
        Request<AuthorizeSecurityGroupIngressRequest> request = new AuthorizeSecurityGroupIngressRequestMarshaller().marshall(this);
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
        if (getCidrIp() != null)
            sb.append("CidrIp: ").append(getCidrIp()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: ").append(getIpPermissions()).append(",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getSourceSecurityGroupName() != null)
            sb.append("SourceSecurityGroupName: ").append(getSourceSecurityGroupName()).append(",");
        if (getSourceSecurityGroupOwnerId() != null)
            sb.append("SourceSecurityGroupOwnerId: ").append(getSourceSecurityGroupOwnerId()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeSecurityGroupIngressRequest == false)
            return false;
        AuthorizeSecurityGroupIngressRequest other = (AuthorizeSecurityGroupIngressRequest) obj;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null)
            return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false)
            return false;
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null)
            return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeSecurityGroupIngressRequest clone() {
        return (AuthorizeSecurityGroupIngressRequest) super.clone();
    }
}
