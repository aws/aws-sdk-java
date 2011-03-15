/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest) AuthorizeSecurityGroupEgress operation}.
 * <p>
 * This action applies only to security groups in a VPC; it's not
 * supported for EC2 security groups. For information about Amazon
 * Virtual Private Cloud and VPC security groups, go to the Amazon
 * Virtual Private Cloud User Guide.
 * </p>
 * <p>
 * The action adds one or more egress rules to a VPC security group.
 * Specifically, this permits instances in a security group to send
 * traffic to either one or more destination CIDR IP address ranges, or
 * to one or more destination security groups in the same VPC.
 * </p>
 * <p>
 * Each rule consists of the protocol (e.g., TCP), plus either a CIDR
 * range, or a source group. For the TCP and UDP protocols, you must also
 * specify the destination port or port range. For the ICMP protocol, you
 * must also specify the ICMP type and code. You can use <code>-1</code>
 * as a wildcard for the ICMP type or code.
 * </p>
 * <p>
 * Rule changes are propagated to instances within the security group as
 * quickly as possible. However, a small delay might occur.
 * </p>
 * <p>
 * <b>Important:</b> For VPC security groups: You can have up to 50
 * rules total per group (covering both ingress and egress).
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest)
 */
public class AuthorizeSecurityGroupEgressRequest extends AmazonWebServiceRequest {

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
    private java.util.List<IpPermission> ipPermissions;

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
    public AuthorizeSecurityGroupEgressRequest withGroupId(String groupId) {
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
    public AuthorizeSecurityGroupEgressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
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
    public AuthorizeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
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
    public AuthorizeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
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
    public AuthorizeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
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
    public AuthorizeSecurityGroupEgressRequest withToPort(Integer toPort) {
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
    public AuthorizeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
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
            ipPermissions = new java.util.ArrayList<IpPermission>();
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
        java.util.List<IpPermission> ipPermissionsCopy = new java.util.ArrayList<IpPermission>();
        if (ipPermissions != null) {
            ipPermissionsCopy.addAll(ipPermissions);
        }
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
    public AuthorizeSecurityGroupEgressRequest withIpPermissions(IpPermission... ipPermissions) {
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
    public AuthorizeSecurityGroupEgressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        java.util.List<IpPermission> ipPermissionsCopy = new java.util.ArrayList<IpPermission>();
        if (ipPermissions != null) {
            ipPermissionsCopy.addAll(ipPermissions);
        }
        this.ipPermissions = ipPermissionsCopy;

        return this;
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
        sb.append("GroupId: " + groupId + ", ");
        sb.append("SourceSecurityGroupName: " + sourceSecurityGroupName + ", ");
        sb.append("SourceSecurityGroupOwnerId: " + sourceSecurityGroupOwnerId + ", ");
        sb.append("IpProtocol: " + ipProtocol + ", ");
        sb.append("FromPort: " + fromPort + ", ");
        sb.append("ToPort: " + toPort + ", ");
        sb.append("CidrIp: " + cidrIp + ", ");
        sb.append("IpPermissions: " + ipPermissions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    