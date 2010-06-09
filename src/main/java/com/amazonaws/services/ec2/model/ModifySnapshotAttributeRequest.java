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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifySnapshotAttribute(ModifySnapshotAttributeRequest) ModifySnapshotAttribute operation}.
 * <p>
 * Adds or remove permission settings for the specified snapshot.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifySnapshotAttribute(ModifySnapshotAttributeRequest)
 */
public class ModifySnapshotAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the EBS snapshot whose attributes are being modified.
     */
    private String snapshotId;

    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: createVolumePermission
     */
    private String attribute;

    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: add, remove
     */
    private String operationType;

    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * createVolumePermission attribute is being modified. </note>
     */
    private java.util.List<String> userIds;

    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     */
    private java.util.List<String> groupNames;

    /**
     * The ID of the EBS snapshot whose attributes are being modified.
     *
     * @return The ID of the EBS snapshot whose attributes are being modified.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the EBS snapshot whose attributes are being modified.
     *
     * @param snapshotId The ID of the EBS snapshot whose attributes are being modified.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the EBS snapshot whose attributes are being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the EBS snapshot whose attributes are being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: createVolumePermission
     *
     * @return The name of the attribute being modified. <p> Available attribute
     *         names: createVolumePermission
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: createVolumePermission
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: createVolumePermission
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: createVolumePermission
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: createVolumePermission
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: add, remove
     *
     * @return The operation to perform on the attribute. <p> Available operation
     *         names: add, remove
     */
    public String getOperationType() {
        return operationType;
    }
    
    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: add, remove
     *
     * @param operationType The operation to perform on the attribute. <p> Available operation
     *         names: add, remove
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    
    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: add, remove
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationType The operation to perform on the attribute. <p> Available operation
     *         names: add, remove
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * createVolumePermission attribute is being modified. </note>
     *
     * @return The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         createVolumePermission attribute is being modified. </note>
     */
    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new java.util.ArrayList<String>();
        }
        return userIds;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * createVolumePermission attribute is being modified. </note>
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         createVolumePermission attribute is being modified. </note>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        java.util.List<String> userIdsCopy = new java.util.ArrayList<String>();
        if (userIds != null) {
            userIdsCopy.addAll(userIds);
        }
        this.userIds = userIdsCopy;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * createVolumePermission attribute is being modified. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         createVolumePermission attribute is being modified. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withUserIds(String... userIds) {
        for (String value : userIds) {
            getUserIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * createVolumePermission attribute is being modified. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         createVolumePermission attribute is being modified. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        java.util.List<String> userIdsCopy = new java.util.ArrayList<String>();
        if (userIds != null) {
            userIdsCopy.addAll(userIds);
        }
        this.userIds = userIdsCopy;

        return this;
    }
    
    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     *
     * @return The AWS group names to add to or remove from the list of groups that
     *         have permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     *
     * @param groupNames The AWS group names to add to or remove from the list of groups that
     *         have permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The AWS group names to add to or remove from the list of groups that
     *         have permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withGroupNames(String... groupNames) {
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The AWS group names to add to or remove from the list of groups that
     *         have permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifySnapshotAttributeRequest withGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;

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
        
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("Attribute: " + attribute + ", ");
        sb.append("OperationType: " + operationType + ", ");
        sb.append("UserIds: " + userIds + ", ");
        sb.append("GroupNames: " + groupNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    