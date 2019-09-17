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
import com.amazonaws.services.ec2.model.transform.RevokeSecurityGroupIngressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RevokeSecurityGroupIngressRequest> {

    /**
     * <p>
     * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use
     * <code>-1</code> to specify all ICMP types.
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
     * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set
     * of permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     * <code>-1</code> to specify all.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule
     * for an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupName;
    /**
     * <p>
     * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for
     * an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     * <code>-1</code> to specify all ICMP codes for the ICMP type.
     * </p>
     */
    private Integer toPort;

    /**
     * Default constructor for RevokeSecurityGroupIngressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public RevokeSecurityGroupIngressRequest() {
    }

    /**
     * Constructs a new RevokeSecurityGroupIngressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param groupName
     *        [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID
     *        or the security group name in the request.
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the
     *        same set of permissions.
     */
    public RevokeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        setGroupName(groupName);
        setIpPermissions(ipPermissions);
    }

    /**
     * <p>
     * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @return The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IP address range. You can't specify this parameter when specifying a source security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use
     * <code>-1</code> to specify all ICMP types.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number,
     *        use <code>-1</code> to specify all ICMP types.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use
     * <code>-1</code> to specify all ICMP types.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number,
     *         use <code>-1</code> to specify all ICMP types.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use
     * <code>-1</code> to specify all ICMP types.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number,
     *        use <code>-1</code> to specify all ICMP types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
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

    public RevokeSecurityGroupIngressRequest withGroupId(String groupId) {
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

    public RevokeSecurityGroupIngressRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set
     * of permissions.
     * </p>
     * 
     * @return The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the
     *         same set of permissions.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set
     * of permissions.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the
     *        same set of permissions.
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
     * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set
     * of permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the
     *        same set of permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
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
     * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set
     * of permissions.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the
     *        same set of permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     * <code>-1</code> to specify all.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     *        <code>-1</code> to specify all.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     * <code>-1</code> to specify all.
     * </p>
     * 
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     *         <code>-1</code> to specify all.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     * <code>-1</code> to specify all.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (<code>tcp</code>, <code>udp</code>, <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a>). Use
     *        <code>-1</code> to specify all.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule
     * for an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *        combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *        protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC.
     *        To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
     */

    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule
     * for an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *         combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *         protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC.
     *         To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
     */

    public String getSourceSecurityGroupName() {
        return this.sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination
     * with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the
     * end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule
     * for an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in
     *        combination with the following parameters: the CIDR IP address range, the start of the port range, the IP
     *        protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC.
     *        To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        setSourceSecurityGroupName(sourceSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for
     * an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a
     *        different account. You can't specify this parameter in combination with the following parameters: the CIDR
     *        IP address range, the IP protocol, the start of the port range, and the end of the port range. To revoke a
     *        specific rule for an IP protocol and port range, use a set of IP permissions instead.
     */

    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for
     * an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @return [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a
     *         different account. You can't specify this parameter in combination with the following parameters: the
     *         CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. To
     *         revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
     */

    public String getSourceSecurityGroupOwnerId() {
        return this.sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different
     * account. You can't specify this parameter in combination with the following parameters: the CIDR IP address
     * range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for
     * an IP protocol and port range, use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a
     *        different account. You can't specify this parameter in combination with the following parameters: the CIDR
     *        IP address range, the IP protocol, the start of the port range, and the end of the port range. To revoke a
     *        specific rule for an IP protocol and port range, use a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        setSourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     * <code>-1</code> to specify all ICMP codes for the ICMP type.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     *        <code>-1</code> to specify all ICMP codes for the ICMP type.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     * <code>-1</code> to specify all ICMP codes for the ICMP type.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number,
     *         use <code>-1</code> to specify all ICMP codes for the ICMP type.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     * <code>-1</code> to specify all ICMP codes for the ICMP type.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use
     *        <code>-1</code> to specify all ICMP codes for the ICMP type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupIngressRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RevokeSecurityGroupIngressRequest> getDryRunRequest() {
        Request<RevokeSecurityGroupIngressRequest> request = new RevokeSecurityGroupIngressRequestMarshaller().marshall(this);
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

        if (obj instanceof RevokeSecurityGroupIngressRequest == false)
            return false;
        RevokeSecurityGroupIngressRequest other = (RevokeSecurityGroupIngressRequest) obj;
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
    public RevokeSecurityGroupIngressRequest clone() {
        return (RevokeSecurityGroupIngressRequest) super.clone();
    }
}
