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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteSecurityGroup(DeleteSecurityGroupRequest) DeleteSecurityGroup operation}.
 * <p>
 * The DeleteSecurityGroup operation deletes a security group.
 * </p>
 * <p>
 * <b>NOTE:</b> If you attempt to delete a security group that contains
 * instances, a fault is returned. If you attempt to delete a security
 * group that is referenced by another security group, a fault is
 * returned. For example, if security group B has a rule that allows
 * access from security group A, security group A cannot be deleted until
 * the allow rule is removed.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteSecurityGroup(DeleteSecurityGroupRequest)
 */
public class DeleteSecurityGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Amazon EC2 security group to delete.
     */
    private String groupName;

    /**
     * The ID of the Amazon EC2 security group to delete.
     */
    private String groupId;

    /**
     * Default constructor for a new DeleteSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteSecurityGroupRequest() {}
    
    /**
     * Constructs a new DeleteSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name of the Amazon EC2 security group to delete.
     */
    public DeleteSecurityGroupRequest(String groupName) {
        this.groupName = groupName;
    }
    
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
    
    
    /**
     * The ID of the Amazon EC2 security group to delete.
     *
     * @return The ID of the Amazon EC2 security group to delete.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of the Amazon EC2 security group to delete.
     *
     * @param groupId The ID of the Amazon EC2 security group to delete.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of the Amazon EC2 security group to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of the Amazon EC2 security group to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteSecurityGroupRequest withGroupId(String groupId) {
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
        sb.append("GroupName: " + groupName + ", ");
        sb.append("GroupId: " + groupId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    