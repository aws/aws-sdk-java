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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStoreVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnnotationStoreVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A generated ID for the annotation store
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The ID for the annotation store from which new versions are being created.
     * </p>
     */
    private String storeId;
    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     */
    private VersionOptions versionOptions;
    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of a annotation store version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time stamp for the creation of an annotation store version.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A generated ID for the annotation store
     * </p>
     * 
     * @param id
     *        A generated ID for the annotation store
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A generated ID for the annotation store
     * </p>
     * 
     * @return A generated ID for the annotation store
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A generated ID for the annotation store
     * </p>
     * 
     * @param id
     *        A generated ID for the annotation store
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from other versions.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @return The name given to an annotation store version to distinguish it from other versions.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from other versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionResult withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The ID for the annotation store from which new versions are being created.
     * </p>
     * 
     * @param storeId
     *        The ID for the annotation store from which new versions are being created.
     */

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * <p>
     * The ID for the annotation store from which new versions are being created.
     * </p>
     * 
     * @return The ID for the annotation store from which new versions are being created.
     */

    public String getStoreId() {
        return this.storeId;
    }

    /**
     * <p>
     * The ID for the annotation store from which new versions are being created.
     * </p>
     * 
     * @param storeId
     *        The ID for the annotation store from which new versions are being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionResult withStoreId(String storeId) {
        setStoreId(storeId);
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

    public CreateAnnotationStoreVersionResult withVersionOptions(VersionOptions versionOptions) {
        setVersionOptions(versionOptions);
        return this;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param name
     *        The name given to an annotation store version to distinguish it from other versions.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @return The name given to an annotation store version to distinguish it from other versions.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param name
     *        The name given to an annotation store version to distinguish it from other versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of a annotation store version.
     * </p>
     * 
     * @param status
     *        The status of a annotation store version.
     * @see VersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a annotation store version.
     * </p>
     * 
     * @return The status of a annotation store version.
     * @see VersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a annotation store version.
     * </p>
     * 
     * @param status
     *        The status of a annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public CreateAnnotationStoreVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a annotation store version.
     * </p>
     * 
     * @param status
     *        The status of a annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public CreateAnnotationStoreVersionResult withStatus(VersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp for the creation of an annotation store version.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for the creation of an annotation store version.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp for the creation of an annotation store version.
     * </p>
     * 
     * @return The time stamp for the creation of an annotation store version.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp for the creation of an annotation store version.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for the creation of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getStoreId() != null)
            sb.append("StoreId: ").append(getStoreId()).append(",");
        if (getVersionOptions() != null)
            sb.append("VersionOptions: ").append(getVersionOptions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnnotationStoreVersionResult == false)
            return false;
        CreateAnnotationStoreVersionResult other = (CreateAnnotationStoreVersionResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getStoreId() == null ^ this.getStoreId() == null)
            return false;
        if (other.getStoreId() != null && other.getStoreId().equals(this.getStoreId()) == false)
            return false;
        if (other.getVersionOptions() == null ^ this.getVersionOptions() == null)
            return false;
        if (other.getVersionOptions() != null && other.getVersionOptions().equals(this.getVersionOptions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        hashCode = prime * hashCode + ((getVersionOptions() == null) ? 0 : getVersionOptions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnnotationStoreVersionResult clone() {
        try {
            return (CreateAnnotationStoreVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
