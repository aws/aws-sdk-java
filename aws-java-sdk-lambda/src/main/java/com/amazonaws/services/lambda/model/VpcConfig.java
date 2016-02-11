/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * If your Lambda function accesses resources in a VPC, you provide this
 * parameter identifying the list of security group IDs and subnet IDs.
 * These must belong to the same VPC. You must provide at least one
 * security group and one subnet ID.
 * </p>
 */
public class VpcConfig implements Serializable, Cloneable {

    /**
     * A list of one or more subnet IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * A list of one or more security groups IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * A list of one or more subnet IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     *
     * @return A list of one or more subnet IDs in your VPC.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * A list of one or more subnet IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     *
     * @param subnetIds A list of one or more subnet IDs in your VPC.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * A list of one or more subnet IDs in your VPC.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or {@link
     * #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     *
     * @param subnetIds A list of one or more subnet IDs in your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcConfig withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more subnet IDs in your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     *
     * @param subnetIds A list of one or more subnet IDs in your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcConfig withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
        }

        return this;
    }

    /**
     * A list of one or more security groups IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return A list of one or more security groups IDs in your VPC.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * A list of one or more security groups IDs in your VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroupIds A list of one or more security groups IDs in your VPC.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * A list of one or more security groups IDs in your VPC.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroupIds A list of one or more security groups IDs in your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcConfig withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more security groups IDs in your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param securityGroupIds A list of one or more security groups IDs in your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcConfig withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

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
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcConfig == false) return false;
        VpcConfig other = (VpcConfig)obj;
        
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        return true;
    }
    
    @Override
    public VpcConfig clone() {
        try {
            return (VpcConfig) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    