/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnnotationStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the store was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The store's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The store's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The store's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The store's genome reference.
     * </p>
     */
    private ReferenceItem reference;
    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     */
    private SseConfig sseConfig;
    /**
     * <p>
     * The store's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The store's ARN.
     * </p>
     */
    private String storeArn;
    /**
     * <p>
     * The store's annotation file format.
     * </p>
     */
    private String storeFormat;
    /**
     * <p>
     * The store's parsing options.
     * </p>
     */
    private StoreOptions storeOptions;
    /**
     * <p>
     * The store's size in bytes.
     * </p>
     */
    private Long storeSizeBytes;
    /**
     * <p>
     * The store's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * When the store was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @param creationTime
     *        When the store was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @return When the store was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the store was created.
     * </p>
     * 
     * @param creationTime
     *        When the store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @param description
     *        The store's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @return The store's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The store's description.
     * </p>
     * 
     * @param description
     *        The store's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @param id
     *        The store's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @return The store's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The store's ID.
     * </p>
     * 
     * @param id
     *        The store's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @param name
     *        The store's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @return The store's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The store's name.
     * </p>
     * 
     * @param name
     *        The store's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The store's genome reference.
     * </p>
     * 
     * @param reference
     *        The store's genome reference.
     */

    public void setReference(ReferenceItem reference) {
        this.reference = reference;
    }

    /**
     * <p>
     * The store's genome reference.
     * </p>
     * 
     * @return The store's genome reference.
     */

    public ReferenceItem getReference() {
        return this.reference;
    }

    /**
     * <p>
     * The store's genome reference.
     * </p>
     * 
     * @param reference
     *        The store's genome reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withReference(ReferenceItem reference) {
        setReference(reference);
        return this;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @param sseConfig
     *        The store's server-side encryption (SSE) settings.
     */

    public void setSseConfig(SseConfig sseConfig) {
        this.sseConfig = sseConfig;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @return The store's server-side encryption (SSE) settings.
     */

    public SseConfig getSseConfig() {
        return this.sseConfig;
    }

    /**
     * <p>
     * The store's server-side encryption (SSE) settings.
     * </p>
     * 
     * @param sseConfig
     *        The store's server-side encryption (SSE) settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withSseConfig(SseConfig sseConfig) {
        setSseConfig(sseConfig);
        return this;
    }

    /**
     * <p>
     * The store's status.
     * </p>
     * 
     * @param status
     *        The store's status.
     * @see StoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The store's status.
     * </p>
     * 
     * @return The store's status.
     * @see StoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The store's status.
     * </p>
     * 
     * @param status
     *        The store's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreStatus
     */

    public GetAnnotationStoreResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The store's status.
     * </p>
     * 
     * @param status
     *        The store's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreStatus
     */

    public GetAnnotationStoreResult withStatus(StoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A status message.
     * </p>
     * 
     * @param statusMessage
     *        A status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A status message.
     * </p>
     * 
     * @return A status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A status message.
     * </p>
     * 
     * @param statusMessage
     *        A status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @param storeArn
     *        The store's ARN.
     */

    public void setStoreArn(String storeArn) {
        this.storeArn = storeArn;
    }

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @return The store's ARN.
     */

    public String getStoreArn() {
        return this.storeArn;
    }

    /**
     * <p>
     * The store's ARN.
     * </p>
     * 
     * @param storeArn
     *        The store's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withStoreArn(String storeArn) {
        setStoreArn(storeArn);
        return this;
    }

    /**
     * <p>
     * The store's annotation file format.
     * </p>
     * 
     * @param storeFormat
     *        The store's annotation file format.
     * @see StoreFormat
     */

    public void setStoreFormat(String storeFormat) {
        this.storeFormat = storeFormat;
    }

    /**
     * <p>
     * The store's annotation file format.
     * </p>
     * 
     * @return The store's annotation file format.
     * @see StoreFormat
     */

    public String getStoreFormat() {
        return this.storeFormat;
    }

    /**
     * <p>
     * The store's annotation file format.
     * </p>
     * 
     * @param storeFormat
     *        The store's annotation file format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public GetAnnotationStoreResult withStoreFormat(String storeFormat) {
        setStoreFormat(storeFormat);
        return this;
    }

    /**
     * <p>
     * The store's annotation file format.
     * </p>
     * 
     * @param storeFormat
     *        The store's annotation file format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public GetAnnotationStoreResult withStoreFormat(StoreFormat storeFormat) {
        this.storeFormat = storeFormat.toString();
        return this;
    }

    /**
     * <p>
     * The store's parsing options.
     * </p>
     * 
     * @param storeOptions
     *        The store's parsing options.
     */

    public void setStoreOptions(StoreOptions storeOptions) {
        this.storeOptions = storeOptions;
    }

    /**
     * <p>
     * The store's parsing options.
     * </p>
     * 
     * @return The store's parsing options.
     */

    public StoreOptions getStoreOptions() {
        return this.storeOptions;
    }

    /**
     * <p>
     * The store's parsing options.
     * </p>
     * 
     * @param storeOptions
     *        The store's parsing options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withStoreOptions(StoreOptions storeOptions) {
        setStoreOptions(storeOptions);
        return this;
    }

    /**
     * <p>
     * The store's size in bytes.
     * </p>
     * 
     * @param storeSizeBytes
     *        The store's size in bytes.
     */

    public void setStoreSizeBytes(Long storeSizeBytes) {
        this.storeSizeBytes = storeSizeBytes;
    }

    /**
     * <p>
     * The store's size in bytes.
     * </p>
     * 
     * @return The store's size in bytes.
     */

    public Long getStoreSizeBytes() {
        return this.storeSizeBytes;
    }

    /**
     * <p>
     * The store's size in bytes.
     * </p>
     * 
     * @param storeSizeBytes
     *        The store's size in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withStoreSizeBytes(Long storeSizeBytes) {
        setStoreSizeBytes(storeSizeBytes);
        return this;
    }

    /**
     * <p>
     * The store's tags.
     * </p>
     * 
     * @return The store's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The store's tags.
     * </p>
     * 
     * @param tags
     *        The store's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The store's tags.
     * </p>
     * 
     * @param tags
     *        The store's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAnnotationStoreResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * When the store was updated.
     * </p>
     * 
     * @param updateTime
     *        When the store was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * When the store was updated.
     * </p>
     * 
     * @return When the store was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * When the store was updated.
     * </p>
     * 
     * @param updateTime
     *        When the store was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReference() != null)
            sb.append("Reference: ").append(getReference()).append(",");
        if (getSseConfig() != null)
            sb.append("SseConfig: ").append(getSseConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStoreArn() != null)
            sb.append("StoreArn: ").append(getStoreArn()).append(",");
        if (getStoreFormat() != null)
            sb.append("StoreFormat: ").append(getStoreFormat()).append(",");
        if (getStoreOptions() != null)
            sb.append("StoreOptions: ").append(getStoreOptions()).append(",");
        if (getStoreSizeBytes() != null)
            sb.append("StoreSizeBytes: ").append(getStoreSizeBytes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnnotationStoreResult == false)
            return false;
        GetAnnotationStoreResult other = (GetAnnotationStoreResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReference() == null ^ this.getReference() == null)
            return false;
        if (other.getReference() != null && other.getReference().equals(this.getReference()) == false)
            return false;
        if (other.getSseConfig() == null ^ this.getSseConfig() == null)
            return false;
        if (other.getSseConfig() != null && other.getSseConfig().equals(this.getSseConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStoreArn() == null ^ this.getStoreArn() == null)
            return false;
        if (other.getStoreArn() != null && other.getStoreArn().equals(this.getStoreArn()) == false)
            return false;
        if (other.getStoreFormat() == null ^ this.getStoreFormat() == null)
            return false;
        if (other.getStoreFormat() != null && other.getStoreFormat().equals(this.getStoreFormat()) == false)
            return false;
        if (other.getStoreOptions() == null ^ this.getStoreOptions() == null)
            return false;
        if (other.getStoreOptions() != null && other.getStoreOptions().equals(this.getStoreOptions()) == false)
            return false;
        if (other.getStoreSizeBytes() == null ^ this.getStoreSizeBytes() == null)
            return false;
        if (other.getStoreSizeBytes() != null && other.getStoreSizeBytes().equals(this.getStoreSizeBytes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        hashCode = prime * hashCode + ((getSseConfig() == null) ? 0 : getSseConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStoreArn() == null) ? 0 : getStoreArn().hashCode());
        hashCode = prime * hashCode + ((getStoreFormat() == null) ? 0 : getStoreFormat().hashCode());
        hashCode = prime * hashCode + ((getStoreOptions() == null) ? 0 : getStoreOptions().hashCode());
        hashCode = prime * hashCode + ((getStoreSizeBytes() == null) ? 0 : getStoreSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetAnnotationStoreResult clone() {
        try {
            return (GetAnnotationStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
