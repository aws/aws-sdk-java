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
import com.amazonaws.services.ec2.model.transform.RevokeSecurityGroupEgressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the
     * same set of permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> ipPermissions;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name or number.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     */
    private String sourceSecurityGroupName;
    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;

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
     * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the
     * same set of permissions.
     * </p>
     * 
     * @return The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in
     *         the same set of permissions.
     */

    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return ipPermissions;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the
     * same set of permissions.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in
     *        the same set of permissions.
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
     * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the
     * same set of permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in
     *        the same set of permissions.
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
     * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the
     * same set of permissions.
     * </p>
     * 
     * @param ipPermissions
     *        The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in
     *        the same set of permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     * 
     * @param cidrIp
     *        Not supported. Use a set of IP permissions to specify the CIDR.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify the CIDR.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     * 
     * @param cidrIp
     *        Not supported. Use a set of IP permissions to specify the CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @param fromPort
     *        Not supported. Use a set of IP permissions to specify the port.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify the port.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @param fromPort
     *        Not supported. Use a set of IP permissions to specify the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name or number.
     * </p>
     * 
     * @param ipProtocol
     *        Not supported. Use a set of IP permissions to specify the protocol name or number.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name or number.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify the protocol name or number.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name or number.
     * </p>
     * 
     * @param ipProtocol
     *        Not supported. Use a set of IP permissions to specify the protocol name or number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @param toPort
     *        Not supported. Use a set of IP permissions to specify the port.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify the port.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * 
     * @param toPort
     *        Not supported. Use a set of IP permissions to specify the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        Not supported. Use a set of IP permissions to specify a destination security group.
     */

    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify a destination security group.
     */

    public String getSourceSecurityGroupName() {
        return this.sourceSecurityGroupName;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @param sourceSecurityGroupName
     *        Not supported. Use a set of IP permissions to specify a destination security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        setSourceSecurityGroupName(sourceSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        Not supported. Use a set of IP permissions to specify a destination security group.
     */

    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @return Not supported. Use a set of IP permissions to specify a destination security group.
     */

    public String getSourceSecurityGroupOwnerId() {
        return this.sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination security group.
     * </p>
     * 
     * @param sourceSecurityGroupOwnerId
     *        Not supported. Use a set of IP permissions to specify a destination security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        setSourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: ").append(getIpPermissions()).append(",");
        if (getCidrIp() != null)
            sb.append("CidrIp: ").append(getCidrIp()).append(",");
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getSourceSecurityGroupName() != null)
            sb.append("SourceSecurityGroupName: ").append(getSourceSecurityGroupName()).append(",");
        if (getSourceSecurityGroupOwnerId() != null)
            sb.append("SourceSecurityGroupOwnerId: ").append(getSourceSecurityGroupOwnerId());
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
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null)
            return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false)
            return false;
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null)
            return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSecurityGroupEgressRequest clone() {
        return (RevokeSecurityGroupEgressRequest) super.clone();
    }
}
