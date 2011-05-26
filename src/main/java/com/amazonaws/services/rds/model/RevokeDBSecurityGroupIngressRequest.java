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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest) RevokeDBSecurityGroupIngress operation}.
 * <p>
 * Revokes ingress from a DBSecurityGroup for previously authorized IP
 * ranges or EC2 Security Groups. Required parameters for this API are
 * one of CIDRIP or (EC2SecurityGroupName AND EC2SecurityGroupOwnerId).
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest)
 */
public class RevokeDBSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Security Group to revoke ingress from.
     */
    private String dBSecurityGroupName;

    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    private String cIDRIP;

    /**
     * The name of the EC2 Security Group to revoke access from. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS Account Number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified <code>EC2SecurityGroupName</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
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
     * @param dBSecurityGroupName The name of the DB Security Group to revoke
     * ingress from.
     */
    public RevokeDBSecurityGroupIngressRequest(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to revoke ingress from.
     *
     * @return The name of the DB Security Group to revoke ingress from.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to revoke ingress from.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to revoke ingress from.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to revoke ingress from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to revoke ingress from.
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
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @param cIDRIP The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range to revoke access from. Must be a valid CIDR range. If
     * <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     * and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range to revoke access from. Must be a valid CIDR range. If
     *         <code>CIDRIP</code> is specified, <code>EC2SecurityGroupName</code>
     *         and <code>EC2SecurityGroupOwnerId</code> cannot be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeDBSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }
    
    
    /**
     * The name of the EC2 Security Group to revoke access from. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @return The name of the EC2 Security Group to revoke access from. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group to revoke access from. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group to revoke access from. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group to revoke access from. If
     * <code>EC2SecurityGroupName</code> is specified,
     * <code>EC2SecurityGroupOwnerId</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group to revoke access from. If
     *         <code>EC2SecurityGroupName</code> is specified,
     *         <code>EC2SecurityGroupOwnerId</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }
    
    
    /**
     * The AWS Account Number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified <code>EC2SecurityGroupName</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @return The AWS Account Number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified <code>EC2SecurityGroupName</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS Account Number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified <code>EC2SecurityGroupName</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     *
     * @param eC2SecurityGroupOwnerId The AWS Account Number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified <code>EC2SecurityGroupName</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS Account Number of the owner of the security group specified in
     * the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     * is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     * specified <code>EC2SecurityGroupName</code> must also be provided and
     * <code>CIDRIP</code> cannot be provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS Account Number of the owner of the security group specified in
     *         the <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID
     *         is not an acceptable value. If <code>EC2SecurityGroupOwnerId</code> is
     *         specified <code>EC2SecurityGroupName</code> must also be provided and
     *         <code>CIDRIP</code> cannot be provided.
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
        sb.append("DBSecurityGroupName: " + dBSecurityGroupName + ", ");
        sb.append("CIDRIP: " + cIDRIP + ", ");
        sb.append("EC2SecurityGroupName: " + eC2SecurityGroupName + ", ");
        sb.append("EC2SecurityGroupOwnerId: " + eC2SecurityGroupOwnerId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    