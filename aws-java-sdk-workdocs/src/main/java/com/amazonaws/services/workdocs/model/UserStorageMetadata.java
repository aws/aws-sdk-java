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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UserStorageMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserStorageMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage used, in bytes.
     * </p>
     */
    private Long storageUtilizedInBytes;
    /**
     * <p>
     * The storage for a user.
     * </p>
     */
    private StorageRuleType storageRule;

    /**
     * <p>
     * The amount of storage used, in bytes.
     * </p>
     * 
     * @param storageUtilizedInBytes
     *        The amount of storage used, in bytes.
     */

    public void setStorageUtilizedInBytes(Long storageUtilizedInBytes) {
        this.storageUtilizedInBytes = storageUtilizedInBytes;
    }

    /**
     * <p>
     * The amount of storage used, in bytes.
     * </p>
     * 
     * @return The amount of storage used, in bytes.
     */

    public Long getStorageUtilizedInBytes() {
        return this.storageUtilizedInBytes;
    }

    /**
     * <p>
     * The amount of storage used, in bytes.
     * </p>
     * 
     * @param storageUtilizedInBytes
     *        The amount of storage used, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStorageMetadata withStorageUtilizedInBytes(Long storageUtilizedInBytes) {
        setStorageUtilizedInBytes(storageUtilizedInBytes);
        return this;
    }

    /**
     * <p>
     * The storage for a user.
     * </p>
     * 
     * @param storageRule
     *        The storage for a user.
     */

    public void setStorageRule(StorageRuleType storageRule) {
        this.storageRule = storageRule;
    }

    /**
     * <p>
     * The storage for a user.
     * </p>
     * 
     * @return The storage for a user.
     */

    public StorageRuleType getStorageRule() {
        return this.storageRule;
    }

    /**
     * <p>
     * The storage for a user.
     * </p>
     * 
     * @param storageRule
     *        The storage for a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStorageMetadata withStorageRule(StorageRuleType storageRule) {
        setStorageRule(storageRule);
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
        if (getStorageUtilizedInBytes() != null)
            sb.append("StorageUtilizedInBytes: ").append(getStorageUtilizedInBytes()).append(",");
        if (getStorageRule() != null)
            sb.append("StorageRule: ").append(getStorageRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserStorageMetadata == false)
            return false;
        UserStorageMetadata other = (UserStorageMetadata) obj;
        if (other.getStorageUtilizedInBytes() == null ^ this.getStorageUtilizedInBytes() == null)
            return false;
        if (other.getStorageUtilizedInBytes() != null && other.getStorageUtilizedInBytes().equals(this.getStorageUtilizedInBytes()) == false)
            return false;
        if (other.getStorageRule() == null ^ this.getStorageRule() == null)
            return false;
        if (other.getStorageRule() != null && other.getStorageRule().equals(this.getStorageRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageUtilizedInBytes() == null) ? 0 : getStorageUtilizedInBytes().hashCode());
        hashCode = prime * hashCode + ((getStorageRule() == null) ? 0 : getStorageRule().hashCode());
        return hashCode;
    }

    @Override
    public UserStorageMetadata clone() {
        try {
            return (UserStorageMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.UserStorageMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
