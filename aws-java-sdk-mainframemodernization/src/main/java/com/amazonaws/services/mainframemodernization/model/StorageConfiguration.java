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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the storage configuration for a runtime environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StorageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the storage configuration for an Amazon EFS file system.
     * </p>
     */
    private EfsStorageConfiguration efs;
    /**
     * <p>
     * Defines the storage configuration for an Amazon FSx file system.
     * </p>
     */
    private FsxStorageConfiguration fsx;

    /**
     * <p>
     * Defines the storage configuration for an Amazon EFS file system.
     * </p>
     * 
     * @param efs
     *        Defines the storage configuration for an Amazon EFS file system.
     */

    public void setEfs(EfsStorageConfiguration efs) {
        this.efs = efs;
    }

    /**
     * <p>
     * Defines the storage configuration for an Amazon EFS file system.
     * </p>
     * 
     * @return Defines the storage configuration for an Amazon EFS file system.
     */

    public EfsStorageConfiguration getEfs() {
        return this.efs;
    }

    /**
     * <p>
     * Defines the storage configuration for an Amazon EFS file system.
     * </p>
     * 
     * @param efs
     *        Defines the storage configuration for an Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withEfs(EfsStorageConfiguration efs) {
        setEfs(efs);
        return this;
    }

    /**
     * <p>
     * Defines the storage configuration for an Amazon FSx file system.
     * </p>
     * 
     * @param fsx
     *        Defines the storage configuration for an Amazon FSx file system.
     */

    public void setFsx(FsxStorageConfiguration fsx) {
        this.fsx = fsx;
    }

    /**
     * <p>
     * Defines the storage configuration for an Amazon FSx file system.
     * </p>
     * 
     * @return Defines the storage configuration for an Amazon FSx file system.
     */

    public FsxStorageConfiguration getFsx() {
        return this.fsx;
    }

    /**
     * <p>
     * Defines the storage configuration for an Amazon FSx file system.
     * </p>
     * 
     * @param fsx
     *        Defines the storage configuration for an Amazon FSx file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withFsx(FsxStorageConfiguration fsx) {
        setFsx(fsx);
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
        if (getEfs() != null)
            sb.append("Efs: ").append(getEfs()).append(",");
        if (getFsx() != null)
            sb.append("Fsx: ").append(getFsx());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageConfiguration == false)
            return false;
        StorageConfiguration other = (StorageConfiguration) obj;
        if (other.getEfs() == null ^ this.getEfs() == null)
            return false;
        if (other.getEfs() != null && other.getEfs().equals(this.getEfs()) == false)
            return false;
        if (other.getFsx() == null ^ this.getFsx() == null)
            return false;
        if (other.getFsx() != null && other.getFsx().equals(this.getFsx()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEfs() == null) ? 0 : getEfs().hashCode());
        hashCode = prime * hashCode + ((getFsx() == null) ? 0 : getFsx().hashCode());
        return hashCode;
    }

    @Override
    public StorageConfiguration clone() {
        try {
            return (StorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.StorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
