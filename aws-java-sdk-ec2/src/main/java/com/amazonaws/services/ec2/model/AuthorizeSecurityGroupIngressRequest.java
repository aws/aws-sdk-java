/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The IPv4 address range, in CIDR format.
     * </p>
     * <p>
     * To specify an IPv6 address range, use IP permissions instead.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the ICMP
     * type or -1 (all ICMP types).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * [Default VPC] The name of the security group. For security groups for a default VPC you can specify either the ID
     * or the name of the security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The permissions for the security group rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To specify
     * all protocols, use <code>-1</code>.
     * </p>
     * <p>
     * To specify <code>icmpv6</code>, use IP permissions instead.
     * </p>
     * <p>
     * If you specify a protocol other than one of the supported values, traffic is allowed on all ports, regardless of
     * any ports that you specify.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * [Default VPC] The name of the source security group.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, specify
     * a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupName;
    /**
     * <p>
     * The Amazon Web Services account ID for the source security group, if the source security group is in a different
     * account.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, use IP
     * permissions instead.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;
    /**
     * <p>
     * If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the ICMP code
     * or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

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
     *        [Default VPC] The name of the security group. For security groups for a default VPC you can specify either
     *        the ID or the name of the security group. For security groups for a nondefault VPC, you must specify the
     *        ID of the security group.
     * @param ipPermissions
     *        The permissions for the security group rules.
     */
    public AuthorizeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        setGroupName(groupName);
        setIpPermissions(ipPermissions);
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR format.
     * </p>
     * <p>
     * To specify an IPv6 address range, use IP permissions instead.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 address range, in CIDR format.</p>
     *        <p>
     *        To specify an IPv6 address range, use IP permissions instead.
     *        </p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR format.
     * </p>
     * <p>
     * To specify an IPv6 address range, use IP permissions instead.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR format.</p>
     *         <p>
     *         To specify an IPv6 address range, use IP permissions instead.
     *         </p>
     *         <p>
     *         To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR format.
     * </p>
     * <p>
     * To specify an IPv6 address range, use IP permissions instead.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param cidrIp
     *        The IPv4 address range, in CIDR format.</p>
     *        <p>
     *        To specify an IPv6 address range, use IP permissions instead.
     *        </p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the ICMP
     * type or -1 (all ICMP types).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param fromPort
     *        If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the
     *        ICMP type or -1 (all ICMP types).</p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the ICMP
     * type or -1 (all ICMP types).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @return If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the
     *         ICMP type or -1 (all ICMP types).</p>
     *         <p>
     *         To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the ICMP
     * type or -1 (all ICMP types).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param fromPort
     *        If the protocol is TCP or UDP, this is the start of the port range. If the protocol is ICMP, this is the
     *        ICMP type or -1 (all ICMP types).</p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        setFromPort(fromPort);
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

    public AuthorizeSecurityGroupIngressRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * [Default VPC] The name of the security group. For security groups for a default VPC you can specify either the ID
     * or the name of the security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     * </p>
     * 
     * @param groupName
     *        [Default VPC] The name of the security group. For security groups for a default VPC you can specify either
     *        the ID or the name of the security group. For security groups for a nondefault VPC, you must specify the
     *        ID of the security group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * [Default VPC] The name of the security group. For security groups for a default VPC you can specify either the ID
     * or the name of the security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     * </p>
     * 
     * @return [Default VPC] The name of the security group. For security groups for a default VPC you can specify
     *         either the ID or the name of the security group. For security groups for a nondefault VPC, you must
     *         specify the ID of the security group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * [Default VPC] The name of the security group. For security groups for a default VPC you can specify either the ID
     * or the name of the security group. For security groups for a nondefault VPC, you must specify the ID of the
     * security group.
     * </p>
     * 
     * @param groupName
     *        [Default VPC] The name of the security group. For security groups for a default VPC you can specify either
     *        the ID or the name of the security group. For security groups for a nondefault VPC, you must specify the
     *        ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The permissions for the security group rules.
     * </p>
     * 
     * @return The permissions for the security group rules.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The permissions for the security group rules.
     * </p>
     * 
     * @param ipPermissions
     *        The permissions for the security group rules.
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
     * The permissions for the security group rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The permissions for the security group rules.
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
     * The permissions for the security group rules.
     * </p>
     * 
     * @param ipPermissions
     *        The permissions for the security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To specify
     * all protocols, use <code>-1</code>.
     * </p>
     * <p>
     * To specify <code>icmpv6</code>, use IP permissions instead.
     * </p>
     * <p>
     * If you specify a protocol other than one of the supported values, traffic is allowed on all ports, regardless of
     * any ports that you specify.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To
     *        specify all protocols, use <code>-1</code>.</p>
     *        <p>
     *        To specify <code>icmpv6</code>, use IP permissions instead.
     *        </p>
     *        <p>
     *        If you specify a protocol other than one of the supported values, traffic is allowed on all ports,
     *        regardless of any ports that you specify.
     *        </p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To specify
     * all protocols, use <code>-1</code>.
     * </p>
     * <p>
     * To specify <code>icmpv6</code>, use IP permissions instead.
     * </p>
     * <p>
     * If you specify a protocol other than one of the supported values, traffic is allowed on all ports, regardless of
     * any ports that you specify.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To
     *         specify all protocols, use <code>-1</code>.</p>
     *         <p>
     *         To specify <code>icmpv6</code>, use IP permissions instead.
     *         </p>
     *         <p>
     *         If you specify a protocol other than one of the supported values, traffic is allowed on all ports,
     *         regardless of any ports that you specify.
     *         </p>
     *         <p>
     *         To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To specify
     * all protocols, use <code>-1</code>.
     * </p>
     * <p>
     * To specify <code>icmpv6</code>, use IP permissions instead.
     * </p>
     * <p>
     * If you specify a protocol other than one of the supported values, traffic is allowed on all ports, regardless of
     * any ports that you specify.
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). To
     *        specify all protocols, use <code>-1</code>.</p>
     *        <p>
     *        To specify <code>icmpv6</code>, use IP permissions instead.
     *        </p>
     *        <p>
     *        If you specify a protocol other than one of the supported values, traffic is allowed on all ports,
     *        regardless of any ports that you specify.
     *        </p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * [Default VPC] The name of the source security group.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, specify
     * a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [Default VPC] The name of the source security group.</p>
     *        <p>
     *        The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *        specify a set of IP permissions instead.
     */

    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * [Default VPC] The name of the source security group.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, specify
     * a set of IP permissions instead.
     * </p>
     * 
     * @return [Default VPC] The name of the source security group.</p>
     *         <p>
     *         The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *         specify a set of IP permissions instead.
     */

    public String getSourceSecurityGroupName() {
        return this.sourceSecurityGroupName;
    }

    /**
     * <p>
     * [Default VPC] The name of the source security group.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, specify
     * a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [Default VPC] The name of the source security group.</p>
     *        <p>
     *        The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *        specify a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        setSourceSecurityGroupName(sourceSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the source security group, if the source security group is in a different
     * account.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, use IP
     * permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        The Amazon Web Services account ID for the source security group, if the source security group is in a
     *        different account.</p>
     *        <p>
     *        The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *        use IP permissions instead.
     */

    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the source security group, if the source security group is in a different
     * account.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, use IP
     * permissions instead.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the source security group, if the source security group is in a
     *         different account.</p>
     *         <p>
     *         The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *         use IP permissions instead.
     */

    public String getSourceSecurityGroupOwnerId() {
        return this.sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the source security group, if the source security group is in a different
     * account.
     * </p>
     * <p>
     * The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range, use IP
     * permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        The Amazon Web Services account ID for the source security group, if the source security group is in a
     *        different account.</p>
     *        <p>
     *        The rule grants full ICMP, UDP, and TCP access. To create a rule with a specific protocol and port range,
     *        use IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        setSourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the ICMP code
     * or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param toPort
     *        If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the
     *        ICMP code or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1
     *        (all ICMP codes).</p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the ICMP code
     * or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @return If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the
     *         ICMP code or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1
     *         (all ICMP codes).</p>
     *         <p>
     *         To specify multiple rules and descriptions for the rules, use IP permissions instead.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the ICMP code
     * or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1 (all ICMP codes).
     * </p>
     * <p>
     * To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * </p>
     * 
     * @param toPort
     *        If the protocol is TCP or UDP, this is the end of the port range. If the protocol is ICMP, this is the
     *        ICMP code or -1 (all ICMP codes). If the start port is -1 (all ICMP types), then the end port must be -1
     *        (all ICMP codes).</p>
     *        <p>
     *        To specify multiple rules and descriptions for the rules, use IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @return The tags applied to the security group rule.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags applied to the security group rule.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags applied to the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags applied to the security group rule.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags applied to the security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
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
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeSecurityGroupIngressRequest clone() {
        return (AuthorizeSecurityGroupIngressRequest) super.clone();
    }
}
