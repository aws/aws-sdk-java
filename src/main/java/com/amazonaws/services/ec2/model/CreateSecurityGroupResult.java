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
package com.amazonaws.services.ec2.model;

/**
 * Create Security Group Result
 */
public class CreateSecurityGroupResult {

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
        sb.append("GroupId: " + groupId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    