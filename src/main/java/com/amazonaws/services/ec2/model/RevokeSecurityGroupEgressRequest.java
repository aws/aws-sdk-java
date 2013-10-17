/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RevokeSecurityGroupEgressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest) RevokeSecurityGroupEgress operation}.
 * <p>
 * This action applies only to security groups in a VPC. It doesn't work with EC2 security groups. For information about Amazon Virtual Private Cloud
 * and VPC security groups, go to the Amazon Virtual Private Cloud User Guide.
 * </p>
 * <p>
 * The action removes one or more egress rules from a VPC security group. The values that you specify in the revoke request (e.g., ports, etc.) must
 * match the existing rule's values in order for the rule to be revoked.
 * </p>
 * <p>
 * Each rule consists of the protocol, and the CIDR range or destination security group. For the TCP and UDP protocols, you must also specify the
 * destination port or range of ports. For the ICMP protocol, you must also specify the ICMP type and code.
 * </p>
 * <p>
 * Rule changes are propagated to instances within the security group as quickly as possible. However, a small delay might occur.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest)
 */
public class RevokeSecurityGroupEgressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RevokeSecurityGroupEgressRequest> {

    /**
     * ID of the VPC security group to modify.
     */
    private String groupId;

    /**
     * Deprecated.
     */
    private String sourceSecurityGroupName;

    /**
     * Deprecated.
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * Deprecated.
     */
    private String ipProtocol;

    /**
     * Deprecated.
     */
    private Integer fromPort;

    /**
     * Deprecated.
     */
    private Integer toPort;

    /**
     * Deprecated.
     */
    private String cidrIp;

    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissions;

    /**
     * ID of the VPC security group to modify.
     *
     * @return ID of the VPC security group to modify.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * ID of the VPC security group to modify.
     *
     * @param groupId ID of the VPC security group to modify.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * ID of the VPC security group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId ID of the VPC security group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * Deprecated.
     *
     * @param sourceSecurityGroupName Deprecated.
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated.
     *
     * @param sourceSecurityGroupOwnerId Deprecated.
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * Deprecated.
     *
     * @param ipProtocol Deprecated.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Deprecated.
     *
     * @param fromPort Deprecated.
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * Deprecated.
     *
     * @param toPort Deprecated.
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * Deprecated.
     *
     * @return Deprecated.
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * Deprecated.
     *
     * @param cidrIp Deprecated.
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * Deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp Deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     *
     * @return List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     */
    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
              ipPermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>();
              ipPermissions.setAutoConstruct(true);
        }
        return ipPermissions;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
        ipPermissionsCopy.addAll(ipPermissions);
        this.ipPermissions = ipPermissionsCopy;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) setIpPermissions(new java.util.ArrayList<IpPermission>(ipPermissions.length));
        for (IpPermission value : ipPermissions) {
            getIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * List of IP permissions to authorize on the specified security group.
     * Specifying permissions through IP permissions is the preferred way of
     * authorizing permissions since it offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to authorize on the specified security group.
     *         Specifying permissions through IP permissions is the preferred way of
     *         authorizing permissions since it offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeSecurityGroupEgressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
            ipPermissionsCopy.addAll(ipPermissions);
            this.ipPermissions = ipPermissionsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RevokeSecurityGroupEgressRequest> getDryRunRequest() {
        Request<RevokeSecurityGroupEgressRequest> request = new RevokeSecurityGroupEgressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() + ",");
        if (getSourceSecurityGroupName() != null) sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null) sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId() + ",");
        if (getIpProtocol() != null) sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null) sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null) sb.append("ToPort: " + getToPort() + ",");
        if (getCidrIp() != null) sb.append("CidrIp: " + getCidrIp() + ",");
        if (getIpPermissions() != null) sb.append("IpPermissions: " + getIpPermissions() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevokeSecurityGroupEgressRequest == false) return false;
        RevokeSecurityGroupEgressRequest other = (RevokeSecurityGroupEgressRequest)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null) return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false) return false; 
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null) return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false) return false; 
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getCidrIp() == null ^ this.getCidrIp() == null) return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false) return false; 
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null) return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false) return false; 
        return true;
    }
    
}
    