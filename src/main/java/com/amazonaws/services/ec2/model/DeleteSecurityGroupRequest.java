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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to delete an Amazon EC2 security group.
 * </p>
 */
public class DeleteSecurityGroupRequest extends AmazonWebServiceRequest {
        
    /**
     * The name of the Amazon EC2 security group to delete.
     */
    private String groupName;

    /**
     * The name of the Amazon EC2 security group to delete.
     *
     * @return The name of the Amazon EC2 security group to delete.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the Amazon EC2 security group to delete.
     *
     * @param groupName The name of the Amazon EC2 security group to delete.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the Amazon EC2 security group to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the Amazon EC2 security group to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteSecurityGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
}
    