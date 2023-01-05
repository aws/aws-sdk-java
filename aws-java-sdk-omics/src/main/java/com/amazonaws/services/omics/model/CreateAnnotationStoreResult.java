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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnnotationStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the store was created.
     * </p>
     */
    private java.util.Date creationTime;
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
     * The store's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     */
    private String storeFormat;
    /**
     * <p>
     * The store's file parsing options.
     * </p>
     */
    private StoreOptions storeOptions;

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

    public CreateAnnotationStoreResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public CreateAnnotationStoreResult withId(String id) {
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

    public CreateAnnotationStoreResult withName(String name) {
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

    public CreateAnnotationStoreResult withReference(ReferenceItem reference) {
        setReference(reference);
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

    public CreateAnnotationStoreResult withStatus(String status) {
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

    public CreateAnnotationStoreResult withStatus(StoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @see StoreFormat
     */

    public void setStoreFormat(String storeFormat) {
        this.storeFormat = storeFormat;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @return The annotation file format of the store.
     * @see StoreFormat
     */

    public String getStoreFormat() {
        return this.storeFormat;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public CreateAnnotationStoreResult withStoreFormat(String storeFormat) {
        setStoreFormat(storeFormat);
        return this;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public CreateAnnotationStoreResult withStoreFormat(StoreFormat storeFormat) {
        this.storeFormat = storeFormat.toString();
        return this;
    }

    /**
     * <p>
     * The store's file parsing options.
     * </p>
     * 
     * @param storeOptions
     *        The store's file parsing options.
     */

    public void setStoreOptions(StoreOptions storeOptions) {
        this.storeOptions = storeOptions;
    }

    /**
     * <p>
     * The store's file parsing options.
     * </p>
     * 
     * @return The store's file parsing options.
     */

    public StoreOptions getStoreOptions() {
        return this.storeOptions;
    }

    /**
     * <p>
     * The store's file parsing options.
     * </p>
     * 
     * @param storeOptions
     *        The store's file parsing options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreResult withStoreOptions(StoreOptions storeOptions) {
        setStoreOptions(storeOptions);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReference() != null)
            sb.append("Reference: ").append(getReference()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStoreFormat() != null)
            sb.append("StoreFormat: ").append(getStoreFormat()).append(",");
        if (getStoreOptions() != null)
            sb.append("StoreOptions: ").append(getStoreOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnnotationStoreResult == false)
            return false;
        CreateAnnotationStoreResult other = (CreateAnnotationStoreResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStoreFormat() == null ^ this.getStoreFormat() == null)
            return false;
        if (other.getStoreFormat() != null && other.getStoreFormat().equals(this.getStoreFormat()) == false)
            return false;
        if (other.getStoreOptions() == null ^ this.getStoreOptions() == null)
            return false;
        if (other.getStoreOptions() != null && other.getStoreOptions().equals(this.getStoreOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStoreFormat() == null) ? 0 : getStoreFormat().hashCode());
        hashCode = prime * hashCode + ((getStoreOptions() == null) ? 0 : getStoreOptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnnotationStoreResult clone() {
        try {
            return (CreateAnnotationStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
