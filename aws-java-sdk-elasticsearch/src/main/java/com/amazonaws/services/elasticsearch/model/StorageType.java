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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * StorageTypes represents the list of storage related types and their attributes that are available for given
 * InstanceType.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageType implements Serializable, Cloneable, StructuredPojo {

    private String storageTypeName;

    private String storageSubTypeName;
    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     */
    private java.util.List<StorageTypeLimit> storageTypeLimits;

    /**
     * @param storageTypeName
     */

    public void setStorageTypeName(String storageTypeName) {
        this.storageTypeName = storageTypeName;
    }

    /**
     * @return
     */

    public String getStorageTypeName() {
        return this.storageTypeName;
    }

    /**
     * @param storageTypeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageType withStorageTypeName(String storageTypeName) {
        setStorageTypeName(storageTypeName);
        return this;
    }

    /**
     * @param storageSubTypeName
     */

    public void setStorageSubTypeName(String storageSubTypeName) {
        this.storageSubTypeName = storageSubTypeName;
    }

    /**
     * @return
     */

    public String getStorageSubTypeName() {
        return this.storageSubTypeName;
    }

    /**
     * @param storageSubTypeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageType withStorageSubTypeName(String storageSubTypeName) {
        setStorageSubTypeName(storageSubTypeName);
        return this;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * 
     * @return List of limits that are applicable for given storage type.
     */

    public java.util.List<StorageTypeLimit> getStorageTypeLimits() {
        return storageTypeLimits;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * 
     * @param storageTypeLimits
     *        List of limits that are applicable for given storage type.
     */

    public void setStorageTypeLimits(java.util.Collection<StorageTypeLimit> storageTypeLimits) {
        if (storageTypeLimits == null) {
            this.storageTypeLimits = null;
            return;
        }

        this.storageTypeLimits = new java.util.ArrayList<StorageTypeLimit>(storageTypeLimits);
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageTypeLimits(java.util.Collection)} or {@link #withStorageTypeLimits(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param storageTypeLimits
     *        List of limits that are applicable for given storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageType withStorageTypeLimits(StorageTypeLimit... storageTypeLimits) {
        if (this.storageTypeLimits == null) {
            setStorageTypeLimits(new java.util.ArrayList<StorageTypeLimit>(storageTypeLimits.length));
        }
        for (StorageTypeLimit ele : storageTypeLimits) {
            this.storageTypeLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of limits that are applicable for given storage type.
     * </p>
     * 
     * @param storageTypeLimits
     *        List of limits that are applicable for given storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageType withStorageTypeLimits(java.util.Collection<StorageTypeLimit> storageTypeLimits) {
        setStorageTypeLimits(storageTypeLimits);
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
        if (getStorageTypeName() != null)
            sb.append("StorageTypeName: ").append(getStorageTypeName()).append(",");
        if (getStorageSubTypeName() != null)
            sb.append("StorageSubTypeName: ").append(getStorageSubTypeName()).append(",");
        if (getStorageTypeLimits() != null)
            sb.append("StorageTypeLimits: ").append(getStorageTypeLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageType == false)
            return false;
        StorageType other = (StorageType) obj;
        if (other.getStorageTypeName() == null ^ this.getStorageTypeName() == null)
            return false;
        if (other.getStorageTypeName() != null && other.getStorageTypeName().equals(this.getStorageTypeName()) == false)
            return false;
        if (other.getStorageSubTypeName() == null ^ this.getStorageSubTypeName() == null)
            return false;
        if (other.getStorageSubTypeName() != null && other.getStorageSubTypeName().equals(this.getStorageSubTypeName()) == false)
            return false;
        if (other.getStorageTypeLimits() == null ^ this.getStorageTypeLimits() == null)
            return false;
        if (other.getStorageTypeLimits() != null && other.getStorageTypeLimits().equals(this.getStorageTypeLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageTypeName() == null) ? 0 : getStorageTypeName().hashCode());
        hashCode = prime * hashCode + ((getStorageSubTypeName() == null) ? 0 : getStorageSubTypeName().hashCode());
        hashCode = prime * hashCode + ((getStorageTypeLimits() == null) ? 0 : getStorageTypeLimits().hashCode());
        return hashCode;
    }

    @Override
    public StorageType clone() {
        try {
            return (StorageType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.StorageTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
