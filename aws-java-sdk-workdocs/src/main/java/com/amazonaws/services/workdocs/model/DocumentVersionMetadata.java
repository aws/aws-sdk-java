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
 * Describes a version of a document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DocumentVersionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentVersionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the version.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The content type of the document.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The signature of the document.
     * </p>
     */
    private String signature;
    /**
     * <p>
     * The status of the document.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the document was first uploaded.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp when the document was last uploaded.
     * </p>
     */
    private java.util.Date modifiedTimestamp;
    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     */
    private java.util.Date contentCreatedTimestamp;
    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     */
    private java.util.Date contentModifiedTimestamp;
    /**
     * <p>
     * The ID of the creator.
     * </p>
     */
    private String creatorId;
    /**
     * <p>
     * The thumbnail of the document.
     * </p>
     */
    private java.util.Map<String, String> thumbnail;
    /**
     * <p>
     * The source of the document.
     * </p>
     */
    private java.util.Map<String, String> source;

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @param id
     *        The ID of the version.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @return The ID of the version.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @param id
     *        The ID of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the version.
     * </p>
     * 
     * @param name
     *        The name of the version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the version.
     * </p>
     * 
     * @return The name of the version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the version.
     * </p>
     * 
     * @param name
     *        The name of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @param contentType
     *        The content type of the document.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @return The content type of the document.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @param contentType
     *        The content type of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @param size
     *        The size of the document, in bytes.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @return The size of the document, in bytes.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @param size
     *        The size of the document, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The signature of the document.
     * </p>
     * 
     * @param signature
     *        The signature of the document.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The signature of the document.
     * </p>
     * 
     * @return The signature of the document.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The signature of the document.
     * </p>
     * 
     * @param signature
     *        The signature of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * The status of the document.
     * </p>
     * 
     * @param status
     *        The status of the document.
     * @see DocumentStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the document.
     * </p>
     * 
     * @return The status of the document.
     * @see DocumentStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the document.
     * </p>
     * 
     * @param status
     *        The status of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatusType
     */

    public DocumentVersionMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the document.
     * </p>
     * 
     * @param status
     *        The status of the document.
     * @see DocumentStatusType
     */

    public void setStatus(DocumentStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the document.
     * </p>
     * 
     * @param status
     *        The status of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatusType
     */

    public DocumentVersionMetadata withStatus(DocumentStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the document was first uploaded.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp when the document was first uploaded.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp when the document was first uploaded.
     * </p>
     * 
     * @return The timestamp when the document was first uploaded.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp when the document was first uploaded.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp when the document was first uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the document was last uploaded.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The timestamp when the document was last uploaded.
     */

    public void setModifiedTimestamp(java.util.Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the document was last uploaded.
     * </p>
     * 
     * @return The timestamp when the document was last uploaded.
     */

    public java.util.Date getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the document was last uploaded.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The timestamp when the document was last uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withModifiedTimestamp(java.util.Date modifiedTimestamp) {
        setModifiedTimestamp(modifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @param contentCreatedTimestamp
     *        The timestamp when the content of the document was originally created.
     */

    public void setContentCreatedTimestamp(java.util.Date contentCreatedTimestamp) {
        this.contentCreatedTimestamp = contentCreatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @return The timestamp when the content of the document was originally created.
     */

    public java.util.Date getContentCreatedTimestamp() {
        return this.contentCreatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @param contentCreatedTimestamp
     *        The timestamp when the content of the document was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withContentCreatedTimestamp(java.util.Date contentCreatedTimestamp) {
        setContentCreatedTimestamp(contentCreatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @param contentModifiedTimestamp
     *        The timestamp when the content of the document was modified.
     */

    public void setContentModifiedTimestamp(java.util.Date contentModifiedTimestamp) {
        this.contentModifiedTimestamp = contentModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @return The timestamp when the content of the document was modified.
     */

    public java.util.Date getContentModifiedTimestamp() {
        return this.contentModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @param contentModifiedTimestamp
     *        The timestamp when the content of the document was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withContentModifiedTimestamp(java.util.Date contentModifiedTimestamp) {
        setContentModifiedTimestamp(contentModifiedTimestamp);
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

    public DocumentVersionMetadata withCreatorId(String creatorId) {
        setCreatorId(creatorId);
        return this;
    }

    /**
     * <p>
     * The thumbnail of the document.
     * </p>
     * 
     * @return The thumbnail of the document.
     */

    public java.util.Map<String, String> getThumbnail() {
        return thumbnail;
    }

    /**
     * <p>
     * The thumbnail of the document.
     * </p>
     * 
     * @param thumbnail
     *        The thumbnail of the document.
     */

    public void setThumbnail(java.util.Map<String, String> thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * <p>
     * The thumbnail of the document.
     * </p>
     * 
     * @param thumbnail
     *        The thumbnail of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withThumbnail(java.util.Map<String, String> thumbnail) {
        setThumbnail(thumbnail);
        return this;
    }

    public DocumentVersionMetadata addThumbnailEntry(String key, String value) {
        if (null == this.thumbnail) {
            this.thumbnail = new java.util.HashMap<String, String>();
        }
        if (this.thumbnail.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.thumbnail.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Thumbnail.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata clearThumbnailEntries() {
        this.thumbnail = null;
        return this;
    }

    /**
     * <p>
     * The source of the document.
     * </p>
     * 
     * @return The source of the document.
     */

    public java.util.Map<String, String> getSource() {
        return source;
    }

    /**
     * <p>
     * The source of the document.
     * </p>
     * 
     * @param source
     *        The source of the document.
     */

    public void setSource(java.util.Map<String, String> source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the document.
     * </p>
     * 
     * @param source
     *        The source of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata withSource(java.util.Map<String, String> source) {
        setSource(source);
        return this;
    }

    public DocumentVersionMetadata addSourceEntry(String key, String value) {
        if (null == this.source) {
            this.source = new java.util.HashMap<String, String>();
        }
        if (this.source.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.source.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Source.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionMetadata clearSourceEntries() {
        this.source = null;
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getModifiedTimestamp() != null)
            sb.append("ModifiedTimestamp: ").append(getModifiedTimestamp()).append(",");
        if (getContentCreatedTimestamp() != null)
            sb.append("ContentCreatedTimestamp: ").append(getContentCreatedTimestamp()).append(",");
        if (getContentModifiedTimestamp() != null)
            sb.append("ContentModifiedTimestamp: ").append(getContentModifiedTimestamp()).append(",");
        if (getCreatorId() != null)
            sb.append("CreatorId: ").append(getCreatorId()).append(",");
        if (getThumbnail() != null)
            sb.append("Thumbnail: ").append("***Sensitive Data Redacted***").append(",");
        if (getSource() != null)
            sb.append("Source: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentVersionMetadata == false)
            return false;
        DocumentVersionMetadata other = (DocumentVersionMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getModifiedTimestamp() == null ^ this.getModifiedTimestamp() == null)
            return false;
        if (other.getModifiedTimestamp() != null && other.getModifiedTimestamp().equals(this.getModifiedTimestamp()) == false)
            return false;
        if (other.getContentCreatedTimestamp() == null ^ this.getContentCreatedTimestamp() == null)
            return false;
        if (other.getContentCreatedTimestamp() != null && other.getContentCreatedTimestamp().equals(this.getContentCreatedTimestamp()) == false)
            return false;
        if (other.getContentModifiedTimestamp() == null ^ this.getContentModifiedTimestamp() == null)
            return false;
        if (other.getContentModifiedTimestamp() != null && other.getContentModifiedTimestamp().equals(this.getContentModifiedTimestamp()) == false)
            return false;
        if (other.getCreatorId() == null ^ this.getCreatorId() == null)
            return false;
        if (other.getCreatorId() != null && other.getCreatorId().equals(this.getCreatorId()) == false)
            return false;
        if (other.getThumbnail() == null ^ this.getThumbnail() == null)
            return false;
        if (other.getThumbnail() != null && other.getThumbnail().equals(this.getThumbnail()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimestamp() == null) ? 0 : getModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getContentCreatedTimestamp() == null) ? 0 : getContentCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getContentModifiedTimestamp() == null) ? 0 : getContentModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        hashCode = prime * hashCode + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public DocumentVersionMetadata clone() {
        try {
            return (DocumentVersionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.DocumentVersionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
