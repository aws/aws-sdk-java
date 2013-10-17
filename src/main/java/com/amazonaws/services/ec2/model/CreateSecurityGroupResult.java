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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Create Security Group Result
 */
public class CreateSecurityGroupResult implements Serializable {

    private String groupId;

    /**
     * Returns the value of the GroupId property for this object.
     *
     * @return The value of the GroupId property for this object.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * Sets the value of the GroupId property for this object.
     *
     * @param groupId The new value for the GroupId property for this object.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * Sets the value of the GroupId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The new value for the GroupId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSecurityGroupResult withGroupId(String groupId) {
        this.groupId = groupId;
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
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSecurityGroupResult == false) return false;
        CreateSecurityGroupResult other = (CreateSecurityGroupResult)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        return true;
    }
    
}
    