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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a folder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/FolderMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the folder.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the folder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the creator.
     * </p>
     */
    private String creatorId;
    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     */
    private String parentFolderId;
    /**
     * <p>
     * The time when the folder was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time when the folder was updated.
     * </p>
     */
    private java.util.Date modifiedTimestamp;
    /**
     * <p>
     * The resource state of the folder.
     * </p>
     */
    private String resourceState;
    /**
     * <p>
     * The unique identifier created from the subfolders and documents of the folder.
     * </p>
     */
    private String signature;
    /**
     * <p>
     * List of labels on the folder.
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * The size of the folder metadata.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The size of the latest version of the folder metadata.
     * </p>
     */
    private Long latestVersionSize;

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param id
     *        The ID of the folder.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @return The ID of the folder.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param id
     *        The ID of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @param name
     *        The name of the folder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @return The name of the folder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @param name
     *        The name of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the creator.
     * </p>
     * 
     * @param creatorId
     *        The ID of the creator.
     */

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * <p>
     * The ID of the creator.
     * </p>
     * 
     * @return The ID of the creator.
     */

    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * <p>
     * The ID of the creator.
     * </p>
     * 
     * @param creatorId
     *        The ID of the creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withCreatorId(String creatorId) {
        setCreatorId(creatorId);
        return this;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @param parentFolderId
     *        The ID of the parent folder.
     */

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @return The ID of the parent folder.
     */

    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @param parentFolderId
     *        The ID of the parent folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withParentFolderId(String parentFolderId) {
        setParentFolderId(parentFolderId);
        return this;
    }

    /**
     * <p>
     * The time when the folder was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the folder was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the folder was created.
     * </p>
     * 
     * @return The time when the folder was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the folder was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the folder was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the folder was updated.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the folder was updated.
     */

    public void setModifiedTimestamp(java.util.Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the folder was updated.
     * </p>
     * 
     * @return The time when the folder was updated.
     */

    public java.util.Date getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the folder was updated.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the folder was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withModifiedTimestamp(java.util.Date modifiedTimestamp) {
        setModifiedTimestamp(modifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The resource state of the folder.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the folder.
     * @see ResourceStateType
     */

    public void setResourceState(String resourceState) {
        this.resourceState = resourceState;
    }

    /**
     * <p>
     * The resource state of the folder.
     * </p>
     * 
     * @return The resource state of the folder.
     * @see ResourceStateType
     */

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * <p>
     * The resource state of the folder.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public FolderMetadata withResourceState(String resourceState) {
        setResourceState(resourceState);
        return this;
    }

    /**
     * <p>
     * The resource state of the folder.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the folder.
     * @see ResourceStateType
     */

    public void setResourceState(ResourceStateType resourceState) {
        withResourceState(resourceState);
    }

    /**
     * <p>
     * The resource state of the folder.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public FolderMetadata withResourceState(ResourceStateType resourceState) {
        this.resourceState = resourceState.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier created from the subfolders and documents of the folder.
     * </p>
     * 
     * @param signature
     *        The unique identifier created from the subfolders and documents of the folder.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The unique identifier created from the subfolders and documents of the folder.
     * </p>
     * 
     * @return The unique identifier created from the subfolders and documents of the folder.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The unique identifier created from the subfolders and documents of the folder.
     * </p>
     * 
     * @param signature
     *        The unique identifier created from the subfolders and documents of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * List of labels on the folder.
     * </p>
     * 
     * @return List of labels on the folder.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * List of labels on the folder.
     * </p>
     * 
     * @param labels
     *        List of labels on the folder.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * List of labels on the folder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        List of labels on the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of labels on the folder.
     * </p>
     * 
     * @param labels
     *        List of labels on the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The size of the folder metadata.
     * </p>
     * 
     * @param size
     *        The size of the folder metadata.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the folder metadata.
     * </p>
     * 
     * @return The size of the folder metadata.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the folder metadata.
     * </p>
     * 
     * @param size
     *        The size of the folder metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The size of the latest version of the folder metadata.
     * </p>
     * 
     * @param latestVersionSize
     *        The size of the latest version of the folder metadata.
     */

    public void setLatestVersionSize(Long latestVersionSize) {
        this.latestVersionSize = latestVersionSize;
    }

    /**
     * <p>
     * The size of the latest version of the folder metadata.
     * </p>
     * 
     * @return The size of the latest version of the folder metadata.
     */

    public Long getLatestVersionSize() {
        return this.latestVersionSize;
    }

    /**
     * <p>
     * The size of the latest version of the folder metadata.
     * </p>
     * 
     * @param latestVersionSize
     *        The size of the latest version of the folder metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FolderMetadata withLatestVersionSize(Long latestVersionSize) {
        setLatestVersionSize(latestVersionSize);
        return this;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getParentFolderId() != null)
            sb.append("ParentFolderId: ").append(getParentFolderId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getModifiedTimestamp() != null)
            sb.append("ModifiedTimestamp: ").append(getModifiedTimestamp()).append(",");
        if (getResourceState() != null)
            sb.append("ResourceState: ").append(getResourceState()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getLatestVersionSize() != null)
            sb.append("LatestVersionSize: ").append(getLatestVersionSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FolderMetadata == false)
            return false;
        FolderMetadata other = (FolderMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatorId() == null ^ this.getCreatorId() == null)
            return false;
        if (other.getCreatorId() != null && other.getCreatorId().equals(this.getCreatorId()) == false)
            return false;
        if (other.getParentFolderId() == null ^ this.getParentFolderId() == null)
            return false;
        if (other.getParentFolderId() != null && other.getParentFolderId().equals(this.getParentFolderId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getModifiedTimestamp() == null ^ this.getModifiedTimestamp() == null)
            return false;
        if (other.getModifiedTimestamp() != null && other.getModifiedTimestamp().equals(this.getModifiedTimestamp()) == false)
            return false;
        if (other.getResourceState() == null ^ this.getResourceState() == null)
            return false;
        if (other.getResourceState() != null && other.getResourceState().equals(this.getResourceState()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getLatestVersionSize() == null ^ this.getLatestVersionSize() == null)
            return false;
        if (other.getLatestVersionSize() != null && other.getLatestVersionSize().equals(this.getLatestVersionSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getParentFolderId() == null) ? 0 : getParentFolderId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimestamp() == null) ? 0 : getModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getResourceState() == null) ? 0 : getResourceState().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionSize() == null) ? 0 : getLatestVersionSize().hashCode());
        return hashCode;
    }

    @Override
    public FolderMetadata clone() {
        try {
            return (FolderMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.FolderMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
