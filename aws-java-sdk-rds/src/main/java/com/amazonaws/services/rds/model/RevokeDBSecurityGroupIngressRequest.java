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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RevokeDBSecurityGroupIngress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeDBSecurityGroupIngressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB security group to revoke ingress from.
     * </p>
     */
    private String dBSecurityGroupName;
    /**
     * <p>
     * The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     * <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and <code>EC2SecurityGroupOwnerId</code> can't
     * be provided.
     * </p>
     */
    private String cIDRIP;
    /**
     * <p>
     * The name of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     */
    private String eC2SecurityGroupName;
    /**
     * <p>
     * The id of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     */
    private String eC2SecurityGroupId;
    /**
     * <p>
     * The AWS Account Number of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     * parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for RevokeDBSecurityGroupIngressRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public RevokeDBSecurityGroupIngressRequest() {
    }

    /**
     * Constructs a new RevokeDBSecurityGroupIngressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to revoke ingress from.
     */
    public RevokeDBSecurityGroupIngressRequest(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
    }

    /**
     * <p>
     * The name of the DB security group to revoke ingress from.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to revoke ingress from.
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to revoke ingress from.
     * </p>
     * 
     * @return The name of the DB security group to revoke ingress from.
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to revoke ingress from.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to revoke ingress from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeDBSecurityGroupIngressRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     * <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and <code>EC2SecurityGroupOwnerId</code> can't
     * be provided.
     * </p>
     * 
     * @param cIDRIP
     *        The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     *        <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and
     *        <code>EC2SecurityGroupOwnerId</code> can't be provided.
     */

    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     * <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and <code>EC2SecurityGroupOwnerId</code> can't
     * be provided.
     * </p>
     * 
     * @return The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     *         <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and
     *         <code>EC2SecurityGroupOwnerId</code> can't be provided.
     */

    public String getCIDRIP() {
        return this.cIDRIP;
    }

    /**
     * <p>
     * The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     * <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and <code>EC2SecurityGroupOwnerId</code> can't
     * be provided.
     * </p>
     * 
     * @param cIDRIP
     *        The IP range to revoke access from. Must be a valid CIDR range. If <code>CIDRIP</code> is specified,
     *        <code>EC2SecurityGroupName</code>, <code>EC2SecurityGroupId</code> and
     *        <code>EC2SecurityGroupOwnerId</code> can't be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeDBSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        setCIDRIP(cIDRIP);
        return this;
    }

    /**
     * <p>
     * The name of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the EC2 security group to revoke access from. For VPC DB security groups,
     *        <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *        <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @return The name of the EC2 security group to revoke access from. For VPC DB security groups,
     *         <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public String getEC2SecurityGroupName() {
        return this.eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the EC2 security group to revoke access from. For VPC DB security groups,
     *        <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *        <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        setEC2SecurityGroupName(eC2SecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The id of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupId
     *        The id of the EC2 security group to revoke access from. For VPC DB security groups,
     *        <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *        <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    /**
     * <p>
     * The id of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @return The id of the EC2 security group to revoke access from. For VPC DB security groups,
     *         <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *         <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public String getEC2SecurityGroupId() {
        return this.eC2SecurityGroupId;
    }

    /**
     * <p>
     * The id of the EC2 security group to revoke access from. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupId
     *        The id of the EC2 security group to revoke access from. For VPC DB security groups,
     *        <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     *        <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupId(String eC2SecurityGroupId) {
        setEC2SecurityGroupId(eC2SecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The AWS Account Number of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     * parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS Account Number of the owner of the EC2 security group specified in the
     *        <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID is not an acceptable value. For VPC DB
     *        security groups, <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and
     *        either <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS Account Number of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     * parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @return The AWS Account Number of the owner of the EC2 security group specified in the
     *         <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID is not an acceptable value. For VPC DB
     *         security groups, <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and
     *         either <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     */

    public String getEC2SecurityGroupOwnerId() {
        return this.eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS Account Number of the owner of the EC2 security group specified in the <code>EC2SecurityGroupName</code>
     * parameter. The AWS Access Key ID is not an acceptable value. For VPC DB security groups,
     * <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and either
     * <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS Account Number of the owner of the EC2 security group specified in the
     *        <code>EC2SecurityGroupName</code> parameter. The AWS Access Key ID is not an acceptable value. For VPC DB
     *        security groups, <code>EC2SecurityGroupId</code> must be provided. Otherwise, EC2SecurityGroupOwnerId and
     *        either <code>EC2SecurityGroupName</code> or <code>EC2SecurityGroupId</code> must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeDBSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        setEC2SecurityGroupOwnerId(eC2SecurityGroupOwnerId);
        return this;
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
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: ").append(getDBSecurityGroupName()).append(",");
        if (getCIDRIP() != null)
            sb.append("CIDRIP: ").append(getCIDRIP()).append(",");
        if (getEC2SecurityGroupName() != null)
            sb.append("EC2SecurityGroupName: ").append(getEC2SecurityGroupName()).append(",");
        if (getEC2SecurityGroupId() != null)
            sb.append("EC2SecurityGroupId: ").append(getEC2SecurityGroupId()).append(",");
        if (getEC2SecurityGroupOwnerId() != null)
            sb.append("EC2SecurityGroupOwnerId: ").append(getEC2SecurityGroupOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeDBSecurityGroupIngressRequest == false)
            return false;
        RevokeDBSecurityGroupIngressRequest other = (RevokeDBSecurityGroupIngressRequest) obj;
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
            return false;
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null)
            return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupId() == null ^ this.getEC2SecurityGroupId() == null)
            return false;
        if (other.getEC2SecurityGroupId() != null && other.getEC2SecurityGroupId().equals(this.getEC2SecurityGroupId()) == false)
            return false;
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false)
            return false;
        return true;
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
    public RevokeDBSecurityGroupIngressRequest clone() {
        return (RevokeDBSecurityGroupIngressRequest) super.clone();
    }

}
