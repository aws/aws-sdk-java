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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest) RevokeDBSecurityGroupIngress operation}.
 * <p>
 * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of
 * CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest)
 */
public class RevokeDBSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the DB security group to revoke ingress from.
     */
    private String dBSecurityGroupName;

    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     * <code>EC2SecurityGroupId</code> and
     * <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    private String cIDRIP;

    /**
     * The name of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     */
    private String eC2SecurityGroupName;

    /**
     * The id of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     */
    private String eC2SecurityGroupId;

    /**
     * The AWS Account Number of the owner of the EC2 security group
     * specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     * Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     * or <code>EC2SecurityGroupId</code> must be provided.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for a new RevokeDBSecurityGroupIngressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RevokeDBSecurityGroupIngressRequest() {}
    
    /**
     * Constructs a new RevokeDBSecurityGroupIngressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBSecurityGroupName The name of the DB security group to revoke
     * ingress from.
     */
    public RevokeDBSecurityGroupIngressRequest(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
    }

    /**
     * The name of the DB security group to revoke ingress from.
     *
     * @return The name of the DB security group to revoke ingress from.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB security group to revoke ingress from.
     *
     * @param dBSecurityGroupName The name of the DB security group to revoke ingress from.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB security group to revoke ingress from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB security group to revoke ingress from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeDBSecurityGroupIngressRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     * <code>EC2SecurityGroupId</code> and
     * <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     *         <code>EC2SecurityGroupId</code> and
     *         <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     * <code>EC2SecurityGroupId</code> and
     * <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @param cIDRIP The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     *         <code>EC2SecurityGroupId</code> and
     *         <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     * <code>EC2SecurityGroupId</code> and
     * <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>,
     *         <code>EC2SecurityGroupId</code> and
     *         <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeDBSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * The name of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     *
     * @return The name of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     *
     * @param eC2SecurityGroupName The name of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The name of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The id of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     *
     * @return The id of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     */
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }
    
    /**
     * The id of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     *
     * @param eC2SecurityGroupId The id of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     */
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }
    
    /**
     * The id of the EC2 security group to revoke access from. For VPC DB
     * security groups, <code>EC2SecurityGroupId</code> must be provided.
     * Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     * must be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupId The id of the EC2 security group to revoke access from. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided.
     *         Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code>
     *         must be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * The AWS Account Number of the owner of the EC2 security group
     * specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     * Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     * or <code>EC2SecurityGroupId</code> must be provided.
     *
     * @return The AWS Account Number of the owner of the EC2 security group
     *         specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     *         Access Key ID is not an acceptable value. For VPC DB security groups,
     *         <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     *         EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     *         or <code>EC2SecurityGroupId</code> must be provided.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS Account Number of the owner of the EC2 security group
     * specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     * Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     * or <code>EC2SecurityGroupId</code> must be provided.
     *
     * @param eC2SecurityGroupOwnerId The AWS Account Number of the owner of the EC2 security group
     *         specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     *         Access Key ID is not an acceptable value. For VPC DB security groups,
     *         <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     *         EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     *         or <code>EC2SecurityGroupId</code> must be provided.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS Account Number of the owner of the EC2 security group
     * specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     * Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     * EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     * or <code>EC2SecurityGroupId</code> must be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS Account Number of the owner of the EC2 security group
     *         specified in the <code>EC2SecurityGroupName</code> parameter. The AWS
     *         Access Key ID is not an acceptable value. For VPC DB security groups,
     *         <code>EC2SecurityGroupId</code> must be provided. Otherwise,
     *         EC2SecurityGroupOwnerId and either <code>EC2SecurityGroupName</code>
     *         or <code>EC2SecurityGroupId</code> must be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
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
        if (getDBSecurityGroupName() != null) sb.append("DBSecurityGroupName: " + getDBSecurityGroupName() + ",");
        if (getCIDRIP() != null) sb.append("CIDRIP: " + getCIDRIP() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupId() != null) sb.append("EC2SecurityGroupId: " + getEC2SecurityGroupId() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupId() == null) ? 0 : getEC2SecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevokeDBSecurityGroupIngressRequest == false) return false;
        RevokeDBSecurityGroupIngressRequest other = (RevokeDBSecurityGroupIngressRequest)obj;
        
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null) return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false) return false; 
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null) return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupId() == null ^ this.getEC2SecurityGroupId() == null) return false;
        if (other.getEC2SecurityGroupId() != null && other.getEC2SecurityGroupId().equals(this.getEC2SecurityGroupId()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    