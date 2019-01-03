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
 * Describes the storage for a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/StorageRuleType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageRuleType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage allocated, in bytes.
     * </p>
     */
    private Long storageAllocatedInBytes;
    /**
     * <p>
     * The type of storage.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The amount of storage allocated, in bytes.
     * </p>
     * 
     * @param storageAllocatedInBytes
     *        The amount of storage allocated, in bytes.
     */

    public void setStorageAllocatedInBytes(Long storageAllocatedInBytes) {
        this.storageAllocatedInBytes = storageAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of storage allocated, in bytes.
     * </p>
     * 
     * @return The amount of storage allocated, in bytes.
     */

    public Long getStorageAllocatedInBytes() {
        return this.storageAllocatedInBytes;
    }

    /**
     * <p>
     * The amount of storage allocated, in bytes.
     * </p>
     * 
     * @param storageAllocatedInBytes
     *        The amount of storage allocated, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageRuleType withStorageAllocatedInBytes(Long storageAllocatedInBytes) {
        setStorageAllocatedInBytes(storageAllocatedInBytes);
        return this;
    }

    /**
     * <p>
     * The type of storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage.
     * </p>
     * 
     * @return The type of storage.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public StorageRuleType withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The type of storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage.
     * @see StorageType
     */

    public void setStorageType(StorageType storageType) {
        withStorageType(storageType);
    }

    /**
     * <p>
     * The type of storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public StorageRuleType withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
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
        if (getStorageAllocatedInBytes() != null)
            sb.append("StorageAllocatedInBytes: ").append(getStorageAllocatedInBytes()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageRuleType == false)
            return false;
        StorageRuleType other = (StorageRuleType) obj;
        if (other.getStorageAllocatedInBytes() == null ^ this.getStorageAllocatedInBytes() == null)
            return false;
        if (other.getStorageAllocatedInBytes() != null && other.getStorageAllocatedInBytes().equals(this.getStorageAllocatedInBytes()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageAllocatedInBytes() == null) ? 0 : getStorageAllocatedInBytes().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        return hashCode;
    }

    @Override
    public StorageRuleType clone() {
        try {
            return (StorageRuleType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.StorageRuleTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
