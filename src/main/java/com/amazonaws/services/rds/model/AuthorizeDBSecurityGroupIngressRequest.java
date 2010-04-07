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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * 
 * </p>
 */
public class AuthorizeDBSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Security Group to authorize.
     */
    private String dBSecurityGroupName;

    /**
     * The IP range to authorize.
     */
    private String cIDRIP;

    /**
     * Name of the EC2 Security Group to authorize.
     */
    private String eC2SecurityGroupName;

    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * The name of the DB Security Group to authorize.
     *
     * @return The name of the DB Security Group to authorize.
     */
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to authorize.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to authorize.
     */
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }
    
    /**
     * The name of the DB Security Group to authorize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupName The name of the DB Security Group to authorize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeDBSecurityGroupIngressRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }
    
    
    /**
     * The IP range to authorize.
     *
     * @return The IP range to authorize.
     */
    public String getCIDRIP() {
        return cIDRIP;
    }
    
    /**
     * The IP range to authorize.
     *
     * @param cIDRIP The IP range to authorize.
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }
    
    /**
     * The IP range to authorize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cIDRIP The IP range to authorize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeDBSecurityGroupIngressRequest withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }
    
    
    /**
     * Name of the EC2 Security Group to authorize.
     *
     * @return Name of the EC2 Security Group to authorize.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * Name of the EC2 Security Group to authorize.
     *
     * @param eC2SecurityGroupName Name of the EC2 Security Group to authorize.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * Name of the EC2 Security Group to authorize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName Name of the EC2 Security Group to authorize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeDBSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }
    
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     *
     * @return AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     *
     * @param eC2SecurityGroupOwnerId AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeDBSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }
    
    
}
    