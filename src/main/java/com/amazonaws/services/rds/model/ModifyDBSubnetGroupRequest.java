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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBSubnetGroup(ModifyDBSubnetGroupRequest) ModifyDBSubnetGroup operation}.
 * <p>
 * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the region.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBSubnetGroup(ModifyDBSubnetGroupRequest)
 */
public class ModifyDBSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name for the DB subnet group. This value is stored as a lowercase
     * string. <p>Constraints: Must contain no more than 255 alphanumeric
     * characters or hyphens. Must not be "Default". <p>Example:
     * <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * The description for the DB subnet group.
     */
    private String dBSubnetGroupDescription;

    /**
     * The EC2 subnet IDs for the DB subnet group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The name for the DB subnet group. This value is stored as a lowercase
     * string. <p>Constraints: Must contain no more than 255 alphanumeric
     * characters or hyphens. Must not be "Default". <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @return The name for the DB subnet group. This value is stored as a lowercase
     *         string. <p>Constraints: Must contain no more than 255 alphanumeric
     *         characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * The name for the DB subnet group. This value is stored as a lowercase
     * string. <p>Constraints: Must contain no more than 255 alphanumeric
     * characters or hyphens. Must not be "Default". <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName The name for the DB subnet group. This value is stored as a lowercase
     *         string. <p>Constraints: Must contain no more than 255 alphanumeric
     *         characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * The name for the DB subnet group. This value is stored as a lowercase
     * string. <p>Constraints: Must contain no more than 255 alphanumeric
     * characters or hyphens. Must not be "Default". <p>Example:
     * <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName The name for the DB subnet group. This value is stored as a lowercase
     *         string. <p>Constraints: Must contain no more than 255 alphanumeric
     *         characters or hyphens. Must not be "Default". <p>Example:
     *         <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyDBSubnetGroupRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The description for the DB subnet group.
     *
     * @return The description for the DB subnet group.
     */
    public String getDBSubnetGroupDescription() {
        return dBSubnetGroupDescription;
    }
    
    /**
     * The description for the DB subnet group.
     *
     * @param dBSubnetGroupDescription The description for the DB subnet group.
     */
    public void setDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }
    
    /**
     * The description for the DB subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupDescription The description for the DB subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyDBSubnetGroupRequest withDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
        return this;
    }

    /**
     * The EC2 subnet IDs for the DB subnet group.
     *
     * @return The EC2 subnet IDs for the DB subnet group.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * The EC2 subnet IDs for the DB subnet group.
     *
     * @param subnetIds The EC2 subnet IDs for the DB subnet group.
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
     * The EC2 subnet IDs for the DB subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The EC2 subnet IDs for the DB subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyDBSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * The EC2 subnet IDs for the DB subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The EC2 subnet IDs for the DB subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyDBSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
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
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDBSubnetGroupDescription() != null) sb.append("DBSubnetGroupDescription: " + getDBSubnetGroupDescription() + ",");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupDescription() == null) ? 0 : getDBSubnetGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyDBSubnetGroupRequest == false) return false;
        ModifyDBSubnetGroupRequest other = (ModifyDBSubnetGroupRequest)obj;
        
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getDBSubnetGroupDescription() == null ^ this.getDBSubnetGroupDescription() == null) return false;
        if (other.getDBSubnetGroupDescription() != null && other.getDBSubnetGroupDescription().equals(this.getDBSubnetGroupDescription()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        return true;
    }
    
}
    