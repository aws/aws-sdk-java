/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RevokeSecurityGroupEgressRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RevokeSecurityGroupEgress.
 * </p>
 */
public class RevokeSecurityGroupEgressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RevokeSecurityGroupEgressRequest> {

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The name of a destination security group. To revoke outbound access to a destination security group, we recommend
     * that you use a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupName;
    /**
     * <p>
     * The AWS account number for a destination security group. To revoke outbound access to a destination security
     * group, we recommend that you use a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;
    /**
     * <p>
     * The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions instead.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions instead.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;

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

    public RevokeSecurityGroupEgressRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The name of a destination security group. To revoke outbound access to a destination security group, we recommend
     * that you use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        The name of a destination security group. To revoke outbound access to a destination security group, we
     *        recommend that you use a set of IP permissions instead.
     */

    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * The name of a destination security group. To revoke outbound access to a destination security group, we recommend
     * that you use a set of IP permissions instead.
     * </p>
     * 
     * @return The name of a destination security group. To revoke outbound access to a destination security group, we
     *         recommend that you use a set of IP permissions instead.
     */

    public String getSourceSecurityGroupName() {
        return this.sourceSecurityGroupName;
    }

    /**
     * <p>
     * The name of a destination security group. To revoke outbound access to a destination security group, we recommend
     * that you use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        The name of a destination security group. To revoke outbound access to a destination security group, we
     *        recommend that you use a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        setSourceSecurityGroupName(sourceSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The AWS account number for a destination security group. To revoke outbound access to a destination security
     * group, we recommend that you use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        The AWS account number for a destination security group. To revoke outbound access to a destination
     *        security group, we recommend that you use a set of IP permissions instead.
     */

    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS account number for a destination security group. To revoke outbound access to a destination security
     * group, we recommend that you use a set of IP permissions instead.
     * </p>
     * 
     * @return The AWS account number for a destination security group. To revoke outbound access to a destination
     *         security group, we recommend that you use a set of IP permissions instead.
     */

    public String getSourceSecurityGroupOwnerId() {
        return this.sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS account number for a destination security group. To revoke outbound access to a destination security
     * group, we recommend that you use a set of IP permissions instead.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        The AWS account number for a destination security group. To revoke outbound access to a destination
     *        security group, we recommend that you use a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        setSourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId);
        return this;
    }

    /**
     * <p>
     * The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions instead.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions
     *        instead.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions instead.
     * </p>
     * 
     * @return The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions
     *         instead.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions instead.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name or number. We recommend that you specify the protocol in a set of IP permissions
     *        instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you
     *        specify the port range in a set of IP permissions instead.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @return The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you
     *         specify the port range in a set of IP permissions instead.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @param fromPort
     *        The start of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you
     *        specify the port range in a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify
     *        the port range in a set of IP permissions instead.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @return The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you
     *         specify the port range in a set of IP permissions instead.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify the
     * port range in a set of IP permissions instead.
     * </p>
     * 
     * @param toPort
     *        The end of port range for the TCP and UDP protocols, or an ICMP type number. We recommend that you specify
     *        the port range in a set of IP permissions instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions instead.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions
     *        instead.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions instead.
     * </p>
     * 
     * @return The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions
     *         instead.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions instead.
     * </p>
     * 
     * @param cidrIp
     *        The CIDR IP address range. We recommend that you specify the CIDR range in a set of IP permissions
     *        instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * </p>
     * 
     * @return A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * </p>
     * 
     * @param ipPermissions
     *        A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
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
     * A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withIpPermissions(IpPermission... ipPermissions) {
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
     * A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * </p>
     * 
     * @param ipPermissions
     *        A set of IP permissions. You can't specify a destination security group and a CIDR IP address range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RevokeSecurityGroupEgressRequest> getDryRunRequest() {
        Request<RevokeSecurityGroupEgressRequest> request = new RevokeSecurityGroupEgressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getSourceSecurityGroupName() != null)
            sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null)
            sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId() + ",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getCidrIp() != null)
            sb.append("CidrIp: " + getCidrIp() + ",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: " + getIpPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSecurityGroupEgressRequest == false)
            return false;
        RevokeSecurityGroupEgressRequest other = (RevokeSecurityGroupEgressRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null)
            return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false)
            return false;
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null)
            return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false)
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
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSecurityGroupEgressRequest clone() {
        return (RevokeSecurityGroupEgressRequest) super.clone();
    }
}
