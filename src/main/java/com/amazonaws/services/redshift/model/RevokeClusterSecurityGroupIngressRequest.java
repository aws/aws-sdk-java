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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest) RevokeClusterSecurityGroupIngress operation}.
 * <p>
 * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress
 * rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a> in the
 * <i>Amazon Redshift Management Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest)
 */
public class RevokeClusterSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the security Group from which to revoke the ingress rule.
     */
    private String clusterSecurityGroupName;

    /**
     * The IP range for which to revoke access. This range must be a valid
     * Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    private String cIDRIP;

    /**
     * The name of the EC2 Security Group whose access is to be revoked. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS account number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified, <code>EC2SecurityGroupName</code> must also be provided.
     * and <code>CIDRIP</code> cannot be provided. <p>Example:
     * <code>111122223333</code>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * The name of the security Group from which to revoke the ingress rule.
     *
     * @return The name of the security Group from which to revoke the ingress rule.
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name of the security Group from which to revoke the ingress rule.
     *
     * @param clusterSecurityGroupName The name of the security Group from which to revoke the ingress rule.
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name of the security Group from which to revoke the ingress rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name of the security Group from which to revoke the ingress rule.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeClusterSecurityGroupIngressRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * The IP range for which to revoke access. This range must be a valid
     * Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return The IP range for which to revoke access. This range must be a valid
     *         Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range for which to revoke access. This range must be a valid
     * Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @param cIDRIP The IP range for which to revoke access. This range must be a valid
     *         Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range for which to revoke access. This range must be a valid
     * Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range for which to revoke access. This range must be a valid
     *         Classless Inter-Domain Routing (CIDR) block of IP addresses. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeClusterSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * The name of the EC2 Security Group whose access is to be revoked. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @return The name of the EC2 Security Group whose access is to be revoked. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group whose access is to be revoked. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group whose access is to be revoked. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group whose access is to be revoked. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group whose access is to be revoked. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeClusterSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The AWS account number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified, <code>EC2SecurityGroupName</code> must also be provided.
     * and <code>CIDRIP</code> cannot be provided. <p>Example:
     * <code>111122223333</code>
     *
     * @return The AWS account number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified, <code>EC2SecurityGroupName</code> must also be provided.
     *         and <code>CIDRIP</code> cannot be provided. <p>Example:
     *         <code>111122223333</code>
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified, <code>EC2SecurityGroupName</code> must also be provided.
     * and <code>CIDRIP</code> cannot be provided. <p>Example:
     * <code>111122223333</code>
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified, <code>EC2SecurityGroupName</code> must also be provided.
     *         and <code>CIDRIP</code> cannot be provided. <p>Example:
     *         <code>111122223333</code>
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified, <code>EC2SecurityGroupName</code> must also be provided.
     * and <code>CIDRIP</code> cannot be provided. <p>Example:
     * <code>111122223333</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS access key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified, <code>EC2SecurityGroupName</code> must also be provided.
     *         and <code>CIDRIP</code> cannot be provided. <p>Example:
     *         <code>111122223333</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeClusterSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getClusterSecurityGroupName() != null) sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getCIDRIP() != null) sb.append("CIDRIP: " + getCIDRIP() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevokeClusterSecurityGroupIngressRequest == false) return false;
        RevokeClusterSecurityGroupIngressRequest other = (RevokeClusterSecurityGroupIngressRequest)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null) return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    