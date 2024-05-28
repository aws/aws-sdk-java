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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStoreVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnnotationStoreVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The annotation store ID.
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
     * The name of an annotation store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The description of an annotation store version.
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
     * The annotation store ID.
     * </p>
     * 
     * @param storeId
     *        The annotation store ID.
     */

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * <p>
     * The annotation store ID.
     * </p>
     * 
     * @return The annotation store ID.
     */

    public String getStoreId() {
        return this.storeId;
    }

    /**
     * <p>
     * The annotation store ID.
     * </p>
     * 
     * @param storeId
     *        The annotation store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionResult withStoreId(String storeId) {
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

    public UpdateAnnotationStoreVersionResult withId(String id) {
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

    public UpdateAnnotationStoreVersionResult withStatus(String status) {
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

    public UpdateAnnotationStoreVersionResult withStatus(VersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @return The name of an annotation store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name of an annotation store version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @return The name of an annotation store version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name of an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionResult withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @param description
     *        The description of an annotation store version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @return The description of an annotation store version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @param description
     *        The description of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnnotationStoreVersionResult withDescription(String description) {
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

    public UpdateAnnotationStoreVersionResult withCreationTime(java.util.Date creationTime) {
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

    public UpdateAnnotationStoreVersionResult withUpdateTime(java.util.Date updateTime) {
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
        if (getStoreId() != null)
            sb.append("StoreId: ").append(getStoreId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof UpdateAnnotationStoreVersionResult == false)
            return false;
        UpdateAnnotationStoreVersionResult other = (UpdateAnnotationStoreVersionResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnnotationStoreVersionResult clone() {
        try {
            return (UpdateAnnotationStoreVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
