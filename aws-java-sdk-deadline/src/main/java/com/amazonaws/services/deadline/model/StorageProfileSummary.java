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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a storage profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StorageProfileSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageProfileSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the storage profile summary to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     */
    private String osFamily;
    /**
     * <p>
     * The storage profile ID.
     * </p>
     */
    private String storageProfileId;

    /**
     * <p>
     * The display name of the storage profile summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile summary to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the storage profile summary to update.
     * </p>
     * 
     * @return The display name of the storage profile summary to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the storage profile summary to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile summary to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageProfileSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @see StorageProfileOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @return The operating system (OS) family.
     * @see StorageProfileOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public StorageProfileSummary withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public StorageProfileSummary withOsFamily(StorageProfileOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
        return this;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @return The storage profile ID.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageProfileSummary withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageProfileSummary == false)
            return false;
        StorageProfileSummary other = (StorageProfileSummary) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        return hashCode;
    }

    @Override
    public StorageProfileSummary clone() {
        try {
            return (StorageProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StorageProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
