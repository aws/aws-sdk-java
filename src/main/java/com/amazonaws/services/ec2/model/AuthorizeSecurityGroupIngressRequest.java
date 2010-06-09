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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest) AuthorizeSecurityGroupIngress operation}.
 * <p>
 * The AuthorizeSecurityGroupIngress operation adds permissions to a
 * security group.
 * </p>
 * <p>
 * Permissions are specified by the IP protocol (TCP, UDP or ICMP), the
 * source of the request (by IP range or an Amazon EC2 user-group pair),
 * the source and destination port ranges (for TCP and UDP), and the ICMP
 * codes and types (for ICMP). When authorizing ICMP, -1 can be used as a
 * wildcard in the type and code fields.
 * </p>
 * <p>
 * Permission changes are propagated to instances within the security
 * group as quickly as possible. However, depending on the number of
 * instances, a small delay might occur.
 * </p>
 * <p>
 * When authorizing a user/group pair permission, GroupName,
 * SourceSecurityGroupName and SourceSecurityGroupOwnerId must be
 * specified. When authorizing a CIDR IP permission, GroupName,
 * IpProtocol, FromPort, ToPort and CidrIp must be specified. Mixing
 * these two types of parameters is not allowed.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest)
 */
public class AuthorizeSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * Name of the group to modify. The name must be valid and belong to the
     * account.
     */
    private String groupName;

    /**
     * Name of the security group. Cannot be used when specifying a CIDR IP
     * address.
     */
    private String sourceSecurityGroupName;

    /**
     * AWS user ID of an account. Cannot be used when specifying a CIDR IP
     * address.
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * IP protocol.
     */
    private String ipProtocol;

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     */
    private Integer fromPort;

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    private Integer toPort;

    /**
     * CIDR range.
     */
    private String cidrIp;

    /**
     * Name of the group to modify. The name must be valid and belong to the
     * account.
     *
     * @return Name of the group to modify. The name must be valid and belong to the
     *         account.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * Name of the group to modify. The name must be valid and belong to the
     * account.
     *
     * @param groupName Name of the group to modify. The name must be valid and belong to the
     *         account.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * Name of the group to modify. The name must be valid and belong to the
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName Name of the group to modify. The name must be valid and belong to the
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
    /**
     * Name of the security group. Cannot be used when specifying a CIDR IP
     * address.
     *
     * @return Name of the security group. Cannot be used when specifying a CIDR IP
     *         address.
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * Name of the security group. Cannot be used when specifying a CIDR IP
     * address.
     *
     * @param sourceSecurityGroupName Name of the security group. Cannot be used when specifying a CIDR IP
     *         address.
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * Name of the security group. Cannot be used when specifying a CIDR IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName Name of the security group. Cannot be used when specifying a CIDR IP
     *         address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }
    
    
    /**
     * AWS user ID of an account. Cannot be used when specifying a CIDR IP
     * address.
     *
     * @return AWS user ID of an account. Cannot be used when specifying a CIDR IP
     *         address.
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * AWS user ID of an account. Cannot be used when specifying a CIDR IP
     * address.
     *
     * @param sourceSecurityGroupOwnerId AWS user ID of an account. Cannot be used when specifying a CIDR IP
     *         address.
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * AWS user ID of an account. Cannot be used when specifying a CIDR IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId AWS user ID of an account. Cannot be used when specifying a CIDR IP
     *         address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }
    
    
    /**
     * IP protocol.
     *
     * @return IP protocol.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * IP protocol.
     *
     * @param ipProtocol IP protocol.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * IP protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol IP protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     *
     * @return Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     *
     * @return End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    
    
    /**
     * CIDR range.
     *
     * @return CIDR range.
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * CIDR range.
     *
     * @param cidrIp CIDR range.
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * CIDR range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp CIDR range.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    