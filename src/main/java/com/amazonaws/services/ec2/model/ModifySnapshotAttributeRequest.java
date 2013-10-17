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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySnapshotAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifySnapshotAttribute(ModifySnapshotAttributeRequest) ModifySnapshotAttribute operation}.
 * <p>
 * Adds or remove permission settings for the specified snapshot.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifySnapshotAttribute(ModifySnapshotAttributeRequest)
 */
public class ModifySnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifySnapshotAttributeRequest> {

    /**
     * The ID of the EBS snapshot whose attributes are being modified.
     */
    private String snapshotId;

    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     */
    private String attribute;

    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: <code>add</code>, <code>remove</code>
     */
    private String operationType;

    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userIds;

    /**
     * The AWS group names to add to or remove from the list of groups that
     * have permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    private CreateVolumePermissionModifications createVolumePermission;

    /**
     * Default constructor for a new ModifySnapshotAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifySnapshotAttributeRequest() {}
    
    /**
     * Constructs a new ModifySnapshotAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The ID of the EBS snapshot whose attributes are
     * being modified.
     * @param attribute The name of the attribute being modified. <p>
     * Available attribute names: <code>createVolumePermission</code>
     * @param operationType The operation to perform on the attribute. <p>
     * Available operation names: <code>add</code>, <code>remove</code>
     */
    public ModifySnapshotAttributeRequest(String snapshotId, String attribute, String operationType) {
        setSnapshotId(snapshotId);
        setAttribute(attribute);
        setOperationType(operationType);
    }

    /**
     * Constructs a new ModifySnapshotAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param snapshotId The ID of the EBS snapshot whose attributes are
     * being modified.
     * @param attribute The name of the attribute being modified. <p>
     * Available attribute names: <code>createVolumePermission</code>
     * @param operationType The operation to perform on the attribute. <p>
     * Available operation names: <code>add</code>, <code>remove</code>
     */
    public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, String operationType) {
        this.snapshotId = snapshotId;
        this.attribute = attribute.toString();
        this.operationType = operationType;
    }

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
     * names: <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @return The name of the attribute being modified. <p> Available attribute
     *         names: <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>createVolumePermission</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>createVolumePermission</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotAttributeName
     */
    public ModifySnapshotAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>createVolumePermission</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>createVolumePermission</code>
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>createVolumePermission</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>createVolumePermission</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SnapshotAttributeName
     */
    public ModifySnapshotAttributeRequest withAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: <code>add</code>, <code>remove</code>
     *
     * @return The operation to perform on the attribute. <p> Available operation
     *         names: <code>add</code>, <code>remove</code>
     */
    public String getOperationType() {
        return operationType;
    }
    
    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: <code>add</code>, <code>remove</code>
     *
     * @param operationType The operation to perform on the attribute. <p> Available operation
     *         names: <code>add</code>, <code>remove</code>
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    
    /**
     * The operation to perform on the attribute. <p> Available operation
     * names: <code>add</code>, <code>remove</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationType The operation to perform on the attribute. <p> Available operation
     *         names: <code>add</code>, <code>remove</code>
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
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     *
     * @return The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     */
    public java.util.List<String> getUserIds() {
        if (userIds == null) {
              userIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              userIds.setAutoConstruct(true);
        }
        return userIds;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> userIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userIds.size());
        userIdsCopy.addAll(userIds);
        this.userIds = userIdsCopy;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifySnapshotAttributeRequest withUserIds(String... userIds) {
        if (getUserIds() == null) setUserIds(new java.util.ArrayList<String>(userIds.length));
        for (String value : userIds) {
            getUserIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS user IDs to add to or remove from the list of users that have
     * permission to create EBS volumes from the specified snapshot.
     * Currently supports "all". <note> Only valid when the
     * <code>createVolumePermission</code> attribute is being modified.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user IDs to add to or remove from the list of users that have
     *         permission to create EBS volumes from the specified snapshot.
     *         Currently supports "all". <note> Only valid when the
     *         <code>createVolumePermission</code> attribute is being modified.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifySnapshotAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> userIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userIds.size());
            userIdsCopy.addAll(userIds);
            this.userIds = userIdsCopy;
        }

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
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
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
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
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
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
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
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the CreateVolumePermission property for this
     * object.
     *
     * @return The value of the CreateVolumePermission property for this object.
     */
    public CreateVolumePermissionModifications getCreateVolumePermission() {
        return createVolumePermission;
    }
    
    /**
     * Sets the value of the CreateVolumePermission property for this object.
     *
     * @param createVolumePermission The new value for the CreateVolumePermission property for this object.
     */
    public void setCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
    }
    
    /**
     * Sets the value of the CreateVolumePermission property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createVolumePermission The new value for the CreateVolumePermission property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifySnapshotAttributeRequest withCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifySnapshotAttributeRequest> getDryRunRequest() {
        Request<ModifySnapshotAttributeRequest> request = new ModifySnapshotAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() + ",");
        if (getOperationType() != null) sb.append("OperationType: " + getOperationType() + ",");
        if (getUserIds() != null) sb.append("UserIds: " + getUserIds() + ",");
        if (getGroupNames() != null) sb.append("GroupNames: " + getGroupNames() + ",");
        if (getCreateVolumePermission() != null) sb.append("CreateVolumePermission: " + getCreateVolumePermission() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode()); 
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode()); 
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getCreateVolumePermission() == null) ? 0 : getCreateVolumePermission().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifySnapshotAttributeRequest == false) return false;
        ModifySnapshotAttributeRequest other = (ModifySnapshotAttributeRequest)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        if (other.getOperationType() == null ^ this.getOperationType() == null) return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false) return false; 
        if (other.getUserIds() == null ^ this.getUserIds() == null) return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false) return false; 
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getCreateVolumePermission() == null ^ this.getCreateVolumePermission() == null) return false;
        if (other.getCreateVolumePermission() != null && other.getCreateVolumePermission().equals(this.getCreateVolumePermission()) == false) return false; 
        return true;
    }
    
}
    