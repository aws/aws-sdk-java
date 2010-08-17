/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest) RevokeSecurityGroupIngress operation}.
 * <p>
 * The RevokeSecurityGroupIngress operation revokes permissions from a
 * security group. The permissions used to revoke must be specified using
 * the same values used to grant the permissions.
 * </p>
 * <p>
 * Permissions are specified by IP protocol (TCP, UDP, or ICMP), the
 * source of the request (by IP range or an Amazon EC2 user-group pair),
 * the source and destination port ranges (for TCP and UDP), and the ICMP
 * codes and types (for ICMP).
 * </p>
 * <p>
 * Permission changes are quickly propagated to instances within the
 * security group. However, depending on the number of instances in the
 * group, a small delay might occur.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest)
 */
public class RevokeSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * The name of the security group from which to remove permissions.
     */
    private String groupName;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Name of the source security group. Cannot be
     * used when specifying a CIDR IP address.
     */
    private String sourceSecurityGroupName;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> AWS user ID of an account. Cannot be used
     * when specifying a CIDR IP address.
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     */
    private String ipProtocol;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Start of port range for the TCP and UDP
     * protocols, or an ICMP type number. An ICMP type number of -1 indicates
     * a wildcard (i.e., any ICMP type number).
     */
    private Integer fromPort;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> End of port range for the TCP and UDP
     * protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     * (i.e., any ICMP code).
     */
    private Integer toPort;

    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> CIDR range.
     */
    private String cidrIp;

    /**
     * List of IP permissions to revoke on the specified security group. For
     * an IP permission to be removed, it must exactly match one of the IP
     * permissions you specify in this list. Specifying permissions through
     * IP permissions is the preferred way of revoking permissions since it
     * offers more flexibility and control.
     */
    private java.util.List<IpPermission> ipPermissions;

    /**
     * Default constructor for a new RevokeSecurityGroupIngressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RevokeSecurityGroupIngressRequest() {}
    
    /**
     * Constructs a new RevokeSecurityGroupIngressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name of the security group from which to remove
     * permissions.
     * @param ipPermissions List of IP permissions to revoke on the specified
     * security group. For an IP permission to be removed, it must exactly
     * match one of the IP permissions you specify in this list. Specifying
     * permissions through IP permissions is the preferred way of revoking
     * permissions since it offers more flexibility and control.
     */
    public RevokeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        this.groupName = groupName;
        this.ipPermissions = ipPermissions;
    }
    
    /**
     * The name of the security group from which to remove permissions.
     *
     * @return The name of the security group from which to remove permissions.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group from which to remove permissions.
     *
     * @param groupName The name of the security group from which to remove permissions.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group from which to remove permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group from which to remove permissions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Name of the source security group. Cannot be
     * used when specifying a CIDR IP address.
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Name of the source security group. Cannot be
     *         used when specifying a CIDR IP address.
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Name of the source security group. Cannot be
     * used when specifying a CIDR IP address.
     *
     * @param sourceSecurityGroupName Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Name of the source security group. Cannot be
     *         used when specifying a CIDR IP address.
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Name of the source security group. Cannot be
     * used when specifying a CIDR IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Name of the source security group. Cannot be
     *         used when specifying a CIDR IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> AWS user ID of an account. Cannot be used
     * when specifying a CIDR IP address.
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> AWS user ID of an account. Cannot be used
     *         when specifying a CIDR IP address.
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> AWS user ID of an account. Cannot be used
     * when specifying a CIDR IP address.
     *
     * @param sourceSecurityGroupOwnerId Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> AWS user ID of an account. Cannot be used
     *         when specifying a CIDR IP address.
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> AWS user ID of an account. Cannot be used
     * when specifying a CIDR IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> AWS user ID of an account. Cannot be used
     *         when specifying a CIDR IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     *
     * @param ipProtocol Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> IP protocol. <p> Valid values: tcp, udp, icmp
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Start of port range for the TCP and UDP
     * protocols, or an ICMP type number. An ICMP type number of -1 indicates
     * a wildcard (i.e., any ICMP type number).
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Start of port range for the TCP and UDP
     *         protocols, or an ICMP type number. An ICMP type number of -1 indicates
     *         a wildcard (i.e., any ICMP type number).
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Start of port range for the TCP and UDP
     * protocols, or an ICMP type number. An ICMP type number of -1 indicates
     * a wildcard (i.e., any ICMP type number).
     *
     * @param fromPort Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Start of port range for the TCP and UDP
     *         protocols, or an ICMP type number. An ICMP type number of -1 indicates
     *         a wildcard (i.e., any ICMP type number).
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> Start of port range for the TCP and UDP
     * protocols, or an ICMP type number. An ICMP type number of -1 indicates
     * a wildcard (i.e., any ICMP type number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> Start of port range for the TCP and UDP
     *         protocols, or an ICMP type number. An ICMP type number of -1 indicates
     *         a wildcard (i.e., any ICMP type number).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> End of port range for the TCP and UDP
     * protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     * (i.e., any ICMP code).
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> End of port range for the TCP and UDP
     *         protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     *         (i.e., any ICMP code).
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> End of port range for the TCP and UDP
     * protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     * (i.e., any ICMP code).
     *
     * @param toPort Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> End of port range for the TCP and UDP
     *         protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     *         (i.e., any ICMP code).
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> End of port range for the TCP and UDP
     * protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     * (i.e., any ICMP code).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> End of port range for the TCP and UDP
     *         protocols, or an ICMP code. An ICMP code of -1 indicates a wildcard
     *         (i.e., any ICMP code).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> CIDR range.
     *
     * @return Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> CIDR range.
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> CIDR range.
     *
     * @param cidrIp Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> CIDR range.
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * Deprecated - use the list of IP permissions to specify this
     * information instead. <p> CIDR range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp Deprecated - use the list of IP permissions to specify this
     *         information instead. <p> CIDR range.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    
    
    /**
     * List of IP permissions to revoke on the specified security group. For
     * an IP permission to be removed, it must exactly match one of the IP
     * permissions you specify in this list. Specifying permissions through
     * IP permissions is the preferred way of revoking permissions since it
     * offers more flexibility and control.
     *
     * @return List of IP permissions to revoke on the specified security group. For
     *         an IP permission to be removed, it must exactly match one of the IP
     *         permissions you specify in this list. Specifying permissions through
     *         IP permissions is the preferred way of revoking permissions since it
     *         offers more flexibility and control.
     */
    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
            ipPermissions = new java.util.ArrayList<IpPermission>();
        }
        return ipPermissions;
    }
    
    /**
     * List of IP permissions to revoke on the specified security group. For
     * an IP permission to be removed, it must exactly match one of the IP
     * permissions you specify in this list. Specifying permissions through
     * IP permissions is the preferred way of revoking permissions since it
     * offers more flexibility and control.
     *
     * @param ipPermissions List of IP permissions to revoke on the specified security group. For
     *         an IP permission to be removed, it must exactly match one of the IP
     *         permissions you specify in this list. Specifying permissions through
     *         IP permissions is the preferred way of revoking permissions since it
     *         offers more flexibility and control.
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        java.util.List<IpPermission> ipPermissionsCopy = new java.util.ArrayList<IpPermission>();
        if (ipPermissions != null) {
            ipPermissionsCopy.addAll(ipPermissions);
        }
        this.ipPermissions = ipPermissionsCopy;
    }
    
    /**
     * List of IP permissions to revoke on the specified security group. For
     * an IP permission to be removed, it must exactly match one of the IP
     * permissions you specify in this list. Specifying permissions through
     * IP permissions is the preferred way of revoking permissions since it
     * offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to revoke on the specified security group. For
     *         an IP permission to be removed, it must exactly match one of the IP
     *         permissions you specify in this list. Specifying permissions through
     *         IP permissions is the preferred way of revoking permissions since it
     *         offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        for (IpPermission value : ipPermissions) {
            getIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * List of IP permissions to revoke on the specified security group. For
     * an IP permission to be removed, it must exactly match one of the IP
     * permissions you specify in this list. Specifying permissions through
     * IP permissions is the preferred way of revoking permissions since it
     * offers more flexibility and control.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions List of IP permissions to revoke on the specified security group. For
     *         an IP permission to be removed, it must exactly match one of the IP
     *         permissions you specify in this list. Specifying permissions through
     *         IP permissions is the preferred way of revoking permissions since it
     *         offers more flexibility and control.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
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
        sb.append("GroupName: " + groupName + ", ");
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
    