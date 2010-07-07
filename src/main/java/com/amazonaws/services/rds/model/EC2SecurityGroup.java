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

/**
 * <p>
 * 
 * </p>
 */
public class EC2SecurityGroup {

    /**
     * Provides the status of the EC2 security group.
     */
    private String status;

    /**
     * Specifies the name of the EC2 Security Group.
     */
    private String eC2SecurityGroupName;

    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <i>EC2SecurityGroupName</i> field.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Provides the status of the EC2 security group.
     *
     * @return Provides the status of the EC2 security group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Provides the status of the EC2 security group.
     *
     * @param status Provides the status of the EC2 security group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Provides the status of the EC2 security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Provides the status of the EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EC2SecurityGroup withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Specifies the name of the EC2 Security Group.
     *
     * @return Specifies the name of the EC2 Security Group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * Specifies the name of the EC2 Security Group.
     *
     * @param eC2SecurityGroupName Specifies the name of the EC2 Security Group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * Specifies the name of the EC2 Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName Specifies the name of the EC2 Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }
    
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <i>EC2SecurityGroupName</i> field.
     *
     * @return Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <i>EC2SecurityGroupName</i> field.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <i>EC2SecurityGroupName</i> field.
     *
     * @param eC2SecurityGroupOwnerId Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <i>EC2SecurityGroupName</i> field.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <i>EC2SecurityGroupName</i> field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <i>EC2SecurityGroupName</i> field.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EC2SecurityGroup withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
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
        sb.append("Status: " + status + ", ");
        sb.append("EC2SecurityGroupName: " + eC2SecurityGroupName + ", ");
        sb.append("EC2SecurityGroupOwnerId: " + eC2SecurityGroupOwnerId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    