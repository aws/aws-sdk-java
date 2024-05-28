/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStoreVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnnotationStoreVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The store ID for annotation store version.
     * </p>
     */
    private String storeId;
    /**
     * <p>
     * The annotation store version ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Arn for the annotation store.
     * </p>
     */
    private String versionArn;
    /**
     * <p>
     * The name of the annotation store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name given to an annotation store version to distinguish it from others.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The description for an annotation store version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time stamp for when an annotation store version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time stamp for when an annotation store version was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * Any tags associated with an annotation store version.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     */
    private VersionOptions versionOptions;
    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The size of the annotation store version in Bytes.
     * </p>
     */
    private Long versionSizeBytes;

    /**
     * <p>
     * The store ID for annotation store version.
     * </p>
     * 
     * @param storeId
     *        The store ID for annotation store version.
     */

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * <p>
     * The store ID for annotation store version.
     * </p>
     * 
     * @return The store ID for annotation store version.
     */

    public String getStoreId() {
        return this.storeId;
    }

    /**
     * <p>
     * The store ID for annotation store version.
     * </p>
     * 
     * @param storeId
     *        The store ID for annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withStoreId(String storeId) {
        setStoreId(storeId);
        return this;
    }

    /**
     * <p>
     * The annotation store version ID.
     * </p>
     * 
     * @param id
     *        The annotation store version ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The annotation store version ID.
     * </p>
     * 
     * @return The annotation store version ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The annotation store version ID.
     * </p>
     * 
     * @param id
     *        The annotation store version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @see VersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @return The status of an annotation store version.
     * @see VersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public GetAnnotationStoreVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public GetAnnotationStoreVersionResult withStatus(VersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Arn for the annotation store.
     * </p>
     * 
     * @param versionArn
     *        The Arn for the annotation store.
     */

    public void setVersionArn(String versionArn) {
        this.versionArn = versionArn;
    }

    /**
     * <p>
     * The Arn for the annotation store.
     * </p>
     * 
     * @return The Arn for the annotation store.
     */

    public String getVersionArn() {
        return this.versionArn;
    }

    /**
     * <p>
     * The Arn for the annotation store.
     * </p>
     * 
     * @param versionArn
     *        The Arn for the annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withVersionArn(String versionArn) {
        setVersionArn(versionArn);
        return this;
    }

    /**
     * <p>
     * The name of the annotation store.
     * </p>
     * 
     * @param name
     *        The name of the annotation store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the annotation store.
     * </p>
     * 
     * @return The name of the annotation store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the annotation store.
     * </p>
     * 
     * @param name
     *        The name of the annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from others.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from others.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from others.
     * </p>
     * 
     * @return The name given to an annotation store version to distinguish it from others.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from others.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from others.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The description for an annotation store version.
     * </p>
     * 
     * @param description
     *        The description for an annotation store version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for an annotation store version.
     * </p>
     * 
     * @return The description for an annotation store version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for an annotation store version.
     * </p>
     * 
     * @param description
     *        The description for an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when an annotation store version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was created.
     * </p>
     * 
     * @return The time stamp for when an annotation store version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when an annotation store version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was updated.
     * </p>
     * 
     * @param updateTime
     *        The time stamp for when an annotation store version was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was updated.
     * </p>
     * 
     * @return The time stamp for when an annotation store version was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time stamp for when an annotation store version was updated.
     * </p>
     * 
     * @param updateTime
     *        The time stamp for when an annotation store version was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * Any tags associated with an annotation store version.
     * </p>
     * 
     * @return Any tags associated with an annotation store version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags associated with an annotation store version.
     * </p>
     * 
     * @param tags
     *        Any tags associated with an annotation store version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags associated with an annotation store version.
     * </p>
     * 
     * @param tags
     *        Any tags associated with an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAnnotationStoreVersionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult addTagsEntry(String key, String value) {
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

    public GetAnnotationStoreVersionResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @param versionOptions
     *        The options for an annotation store version.
     */

    public void setVersionOptions(VersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @return The options for an annotation store version.
     */

    public VersionOptions getVersionOptions() {
        return this.versionOptions;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @param versionOptions
     *        The options for an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withVersionOptions(VersionOptions versionOptions) {
        setVersionOptions(versionOptions);
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param statusMessage
     *        The status of an annotation store version.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @return The status of an annotation store version.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param statusMessage
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The size of the annotation store version in Bytes.
     * </p>
     * 
     * @param versionSizeBytes
     *        The size of the annotation store version in Bytes.
     */

    public void setVersionSizeBytes(Long versionSizeBytes) {
        this.versionSizeBytes = versionSizeBytes;
    }

    /**
     * <p>
     * The size of the annotation store version in Bytes.
     * </p>
     * 
     * @return The size of the annotation store version in Bytes.
     */

    public Long getVersionSizeBytes() {
        return this.versionSizeBytes;
    }

    /**
     * <p>
     * The size of the annotation store version in Bytes.
     * </p>
     * 
     * @param versionSizeBytes
     *        The size of the annotation store version in Bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationStoreVersionResult withVersionSizeBytes(Long versionSizeBytes) {
        setVersionSizeBytes(versionSizeBytes);
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
        if (getStoreId() != null)
            sb.append("StoreId: ").append(getStoreId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVersionArn() != null)
            sb.append("VersionArn: ").append(getVersionArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionOptions() != null)
            sb.append("VersionOptions: ").append(getVersionOptions()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getVersionSizeBytes() != null)
            sb.append("VersionSizeBytes: ").append(getVersionSizeBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnnotationStoreVersionResult == false)
            return false;
        GetAnnotationStoreVersionResult other = (GetAnnotationStoreVersionResult) obj;
        if (other.getStoreId() == null ^ this.getStoreId() == null)
            return false;
        if (other.getStoreId() != null && other.getStoreId().equals(this.getStoreId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVersionArn() == null ^ this.getVersionArn() == null)
            return false;
        if (other.getVersionArn() != null && other.getVersionArn().equals(this.getVersionArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionOptions() == null ^ this.getVersionOptions() == null)
            return false;
        if (other.getVersionOptions() != null && other.getVersionOptions().equals(this.getVersionOptions()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getVersionSizeBytes() == null ^ this.getVersionSizeBytes() == null)
            return false;
        if (other.getVersionSizeBytes() != null && other.getVersionSizeBytes().equals(this.getVersionSizeBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVersionArn() == null) ? 0 : getVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionOptions() == null) ? 0 : getVersionOptions().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVersionSizeBytes() == null) ? 0 : getVersionSizeBytes().hashCode());
        return hashCode;
    }

    @Override
    public GetAnnotationStoreVersionResult clone() {
        try {
            return (GetAnnotationStoreVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
