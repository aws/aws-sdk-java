/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySnapshotAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifySnapshotAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifySnapshotAttributeRequest> {

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     */
    private CreateVolumePermissionModifications createVolumePermission;
    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;
    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIds;

    /**
     * Default constructor for ModifySnapshotAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ModifySnapshotAttributeRequest() {
    }

    /**
     * Constructs a new ModifySnapshotAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @param operationType
     *        The type of operation to perform to the attribute.
     */
    public ModifySnapshotAttributeRequest(String snapshotId, String attribute, String operationType) {
        setSnapshotId(snapshotId);
        setAttribute(attribute);
        setOperationType(operationType);
    }

    /**
     * Constructs a new ModifySnapshotAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @param operationType
     *        The type of operation to perform to the attribute.
     */
    public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) {
        setSnapshotId(snapshotId);
        setAttribute(attribute.toString());
        setOperationType(operationType.toString());
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @see SnapshotAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     * 
     * @return The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @see SnapshotAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeName
     */

    public ModifySnapshotAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @see SnapshotAttributeName
     */

    public void setAttribute(SnapshotAttributeName attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * The snapshot attribute to modify. Only volume creation permissions can be modified.
     * </p>
     * 
     * @param attribute
     *        The snapshot attribute to modify. Only volume creation permissions can be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeName
     */

    public ModifySnapshotAttributeRequest withAttribute(SnapshotAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     * 
     * @param createVolumePermission
     *        A JSON representation of the snapshot attribute modification.
     */

    public void setCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        this.createVolumePermission = createVolumePermission;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     * 
     * @return A JSON representation of the snapshot attribute modification.
     */

    public CreateVolumePermissionModifications getCreateVolumePermission() {
        return this.createVolumePermission;
    }

    /**
     * <p>
     * A JSON representation of the snapshot attribute modification.
     * </p>
     * 
     * @param createVolumePermission
     *        A JSON representation of the snapshot attribute modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withCreateVolumePermission(CreateVolumePermissionModifications createVolumePermission) {
        setCreateVolumePermission(createVolumePermission);
        return this;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * 
     * @return The group to modify for the snapshot.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * 
     * @param groupNames
     *        The group to modify for the snapshot.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        The group to modify for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The group to modify for the snapshot.
     * </p>
     * 
     * @param groupNames
     *        The group to modify for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * 
     * @param operationType
     *        The type of operation to perform to the attribute.
     * @see OperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * 
     * @return The type of operation to perform to the attribute.
     * @see OperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * 
     * @param operationType
     *        The type of operation to perform to the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ModifySnapshotAttributeRequest withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * 
     * @param operationType
     *        The type of operation to perform to the attribute.
     * @see OperationType
     */

    public void setOperationType(OperationType operationType) {
        withOperationType(operationType);
    }

    /**
     * <p>
     * The type of operation to perform to the attribute.
     * </p>
     * 
     * @param operationType
     *        The type of operation to perform to the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ModifySnapshotAttributeRequest withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * 
     * @return The account ID to modify for the snapshot.
     */

    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIds;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * 
     * @param userIds
     *        The account ID to modify for the snapshot.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new com.amazonaws.internal.SdkInternalList<String>(userIds);
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The account ID to modify for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new com.amazonaws.internal.SdkInternalList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account ID to modify for the snapshot.
     * </p>
     * 
     * @param userIds
     *        The account ID to modify for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySnapshotAttributeRequest> getDryRunRequest() {
        Request<ModifySnapshotAttributeRequest> request = new ModifySnapshotAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getCreateVolumePermission() != null)
            sb.append("CreateVolumePermission: ").append(getCreateVolumePermission()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotAttributeRequest == false)
            return false;
        ModifySnapshotAttributeRequest other = (ModifySnapshotAttributeRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getCreateVolumePermission() == null ^ this.getCreateVolumePermission() == null)
            return false;
        if (other.getCreateVolumePermission() != null && other.getCreateVolumePermission().equals(this.getCreateVolumePermission()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getCreateVolumePermission() == null) ? 0 : getCreateVolumePermission().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotAttributeRequest clone() {
        return (ModifySnapshotAttributeRequest) super.clone();
    }
}
