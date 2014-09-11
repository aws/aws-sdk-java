/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Adds or removes permission settings for the specified snapshot. You
 * may add or remove specified AWS account IDs from a snapshot's list of
 * create volume permissions, but you cannot do both in a single API
 * call. If you need to both add and remove account IDs for a snapshot,
 * you must use multiple API calls.
 * </p>
 * <p>
 * For more information on modifying snapshot permissions, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * <b>NOTE:</b> Snapshots with AWS Marketplace product codes cannot be
 * made public.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifySnapshotAttribute(ModifySnapshotAttributeRequest)
 */
public class ModifySnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifySnapshotAttributeRequest> {

    /**
     * The ID of the snapshot.
     */
    private String snapshotId;

    /**
     * The snapshot attribute to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     */
    private String attribute;

    /**
     * The type of operation to perform to the attribute.
     */
    private String operationType;

    /**
     * The account ID to modify for the snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userIds;

    /**
     * The group to modify for the snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    /**
     * A JSON representation of the snapshot attribute modification.
     */
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
     * @param snapshotId The ID of the snapshot.
     * @param attribute The snapshot attribute to modify.
     * @param operationType The type of operation to perform to the
     * attribute.
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
     * @param snapshotId The ID of the snapshot.
     * @param attribute The snapshot attribute to modify.
     * @param operationType The type of operation to perform to the
     * attribute.
     */
    public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, String operationType) {
        this.snapshotId = snapshotId;
        this.attribute = attribute.toString();
        this.operationType = operationType;
    }

    /**
     * The ID of the snapshot.
     *
     * @return The ID of the snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     *
     * @param snapshotId The ID of the snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySnapshotAttributeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The snapshot attribute to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @return The snapshot attribute to modify.
     *
     * @see SnapshotAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The snapshot attribute to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The snapshot attribute to modify.
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The snapshot attribute to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The snapshot attribute to modify.
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
     * The snapshot attribute to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The snapshot attribute to modify.
     *
     * @see SnapshotAttributeName
     */
    public void setAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The snapshot attribute to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>productCodes, createVolumePermission
     *
     * @param attribute The snapshot attribute to modify.
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
     * The type of operation to perform to the attribute.
     *
     * @return The type of operation to perform to the attribute.
     */
    public String getOperationType() {
        return operationType;
    }
    
    /**
     * The type of operation to perform to the attribute.
     *
     * @param operationType The type of operation to perform to the attribute.
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    
    /**
     * The type of operation to perform to the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationType The type of operation to perform to the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySnapshotAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * The account ID to modify for the snapshot.
     *
     * @return The account ID to modify for the snapshot.
     */
    public java.util.List<String> getUserIds() {
        if (userIds == null) {
              userIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              userIds.setAutoConstruct(true);
        }
        return userIds;
    }
    
    /**
     * The account ID to modify for the snapshot.
     *
     * @param userIds The account ID to modify for the snapshot.
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
     * The account ID to modify for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The account ID to modify for the snapshot.
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
     * The account ID to modify for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The account ID to modify for the snapshot.
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
     * The group to modify for the snapshot.
     *
     * @return The group to modify for the snapshot.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
        }
        return groupNames;
    }
    
    /**
     * The group to modify for the snapshot.
     *
     * @param groupNames The group to modify for the snapshot.
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
     * The group to modify for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The group to modify for the snapshot.
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
     * The group to modify for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The group to modify for the snapshot.
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
     * A JSON representation of the snapshot attribute modification.
     *
     * @return A JSON representation of the snapshot attribute modification.
     */
    public CreateVolumePermissionModifications getCreateVolumePermission() {
        return createVolumePermission;
    }
    
    /**
     * A JSON representation of the snapshot attribute modification.
     *
     * @param createVolumePermission A JSON representation of the snapshot attribute modification.
     */
    public void setCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
    }
    
    /**
     * A JSON representation of the snapshot attribute modification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createVolumePermission A JSON representation of the snapshot attribute modification.
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
    