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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Provides ownership and status information for an Amazon EC2 security group.
 * </p>
 */
public class EC2SecurityGroup implements Serializable {

    /**
     * The status of the Amazon EC2 security group.
     */
    private String status;

    /**
     * The name of the Amazon EC2 security group.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS account ID of the Amazon EC2 security group owner.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for a new EC2SecurityGroup object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EC2SecurityGroup() {}
    
    /**
     * The status of the Amazon EC2 security group.
     *
     * @return The status of the Amazon EC2 security group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the Amazon EC2 security group.
     *
     * @param status The status of the Amazon EC2 security group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the Amazon EC2 security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the Amazon EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The name of the Amazon EC2 security group.
     *
     * @return The name of the Amazon EC2 security group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The name of the Amazon EC2 security group.
     *
     * @param eC2SecurityGroupName The name of the Amazon EC2 security group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The name of the Amazon EC2 security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The name of the Amazon EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The AWS account ID of the Amazon EC2 security group owner.
     *
     * @return The AWS account ID of the Amazon EC2 security group owner.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account ID of the Amazon EC2 security group owner.
     *
     * @param eC2SecurityGroupOwnerId The AWS account ID of the Amazon EC2 security group owner.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account ID of the Amazon EC2 security group owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS account ID of the Amazon EC2 security group owner.
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EC2SecurityGroup == false) return false;
        EC2SecurityGroup other = (EC2SecurityGroup)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    