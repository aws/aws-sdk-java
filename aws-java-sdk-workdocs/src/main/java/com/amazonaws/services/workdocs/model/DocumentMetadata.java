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
 * Describes the document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DocumentMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the document.
     * </p>
     */
    private String id;
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
     * The time when the document was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time when the document was updated.
     * </p>
     */
    private java.util.Date modifiedTimestamp;
    /**
     * <p>
     * The latest version of the document.
     * </p>
     */
    private DocumentVersionMetadata latestVersionMetadata;
    /**
     * <p>
     * The resource state.
     * </p>
     */
    private String resourceState;
    /**
     * <p>
     * List of labels on the document.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param id
     *        The ID of the document.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @return The ID of the document.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param id
     *        The ID of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withId(String id) {
        setId(id);
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

    public DocumentMetadata withCreatorId(String creatorId) {
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

    public DocumentMetadata withParentFolderId(String parentFolderId) {
        setParentFolderId(parentFolderId);
        return this;
    }

    /**
     * <p>
     * The time when the document was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the document was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the document was created.
     * </p>
     * 
     * @return The time when the document was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the document was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the document was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the document was updated.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the document was updated.
     */

    public void setModifiedTimestamp(java.util.Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the document was updated.
     * </p>
     * 
     * @return The time when the document was updated.
     */

    public java.util.Date getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * <p>
     * The time when the document was updated.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time when the document was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withModifiedTimestamp(java.util.Date modifiedTimestamp) {
        setModifiedTimestamp(modifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @param latestVersionMetadata
     *        The latest version of the document.
     */

    public void setLatestVersionMetadata(DocumentVersionMetadata latestVersionMetadata) {
        this.latestVersionMetadata = latestVersionMetadata;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @return The latest version of the document.
     */

    public DocumentVersionMetadata getLatestVersionMetadata() {
        return this.latestVersionMetadata;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @param latestVersionMetadata
     *        The latest version of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withLatestVersionMetadata(DocumentVersionMetadata latestVersionMetadata) {
        setLatestVersionMetadata(latestVersionMetadata);
        return this;
    }

    /**
     * <p>
     * The resource state.
     * </p>
     * 
     * @param resourceState
     *        The resource state.
     * @see ResourceStateType
     */

    public void setResourceState(String resourceState) {
        this.resourceState = resourceState;
    }

    /**
     * <p>
     * The resource state.
     * </p>
     * 
     * @return The resource state.
     * @see ResourceStateType
     */

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * <p>
     * The resource state.
     * </p>
     * 
     * @param resourceState
     *        The resource state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public DocumentMetadata withResourceState(String resourceState) {
        setResourceState(resourceState);
        return this;
    }

    /**
     * <p>
     * The resource state.
     * </p>
     * 
     * @param resourceState
     *        The resource state.
     * @see ResourceStateType
     */

    public void setResourceState(ResourceStateType resourceState) {
        withResourceState(resourceState);
    }

    /**
     * <p>
     * The resource state.
     * </p>
     * 
     * @param resourceState
     *        The resource state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public DocumentMetadata withResourceState(ResourceStateType resourceState) {
        this.resourceState = resourceState.toString();
        return this;
    }

    /**
     * <p>
     * List of labels on the document.
     * </p>
     * 
     * @return List of labels on the document.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * List of labels on the document.
     * </p>
     * 
     * @param labels
     *        List of labels on the document.
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
     * List of labels on the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        List of labels on the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withLabels(String... labels) {
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
     * List of labels on the document.
     * </p>
     * 
     * @param labels
     *        List of labels on the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getParentFolderId() != null)
            sb.append("ParentFolderId: ").append(getParentFolderId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getModifiedTimestamp() != null)
            sb.append("ModifiedTimestamp: ").append(getModifiedTimestamp()).append(",");
        if (getLatestVersionMetadata() != null)
            sb.append("LatestVersionMetadata: ").append(getLatestVersionMetadata()).append(",");
        if (getResourceState() != null)
            sb.append("ResourceState: ").append(getResourceState()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentMetadata == false)
            return false;
        DocumentMetadata other = (DocumentMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getLatestVersionMetadata() == null ^ this.getLatestVersionMetadata() == null)
            return false;
        if (other.getLatestVersionMetadata() != null && other.getLatestVersionMetadata().equals(this.getLatestVersionMetadata()) == false)
            return false;
        if (other.getResourceState() == null ^ this.getResourceState() == null)
            return false;
        if (other.getResourceState() != null && other.getResourceState().equals(this.getResourceState()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getParentFolderId() == null) ? 0 : getParentFolderId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimestamp() == null) ? 0 : getModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionMetadata() == null) ? 0 : getLatestVersionMetadata().hashCode());
        hashCode = prime * hashCode + ((getResourceState() == null) ? 0 : getResourceState().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public DocumentMetadata clone() {
        try {
            return (DocumentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.DocumentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
