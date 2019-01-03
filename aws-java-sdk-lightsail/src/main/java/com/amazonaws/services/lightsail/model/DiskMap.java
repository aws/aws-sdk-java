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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a block storage disk mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DiskMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     * </p>
     */
    private String originalDiskPath;
    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     */
    private String newDiskName;

    /**
     * <p>
     * The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     * </p>
     * 
     * @param originalDiskPath
     *        The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     */

    public void setOriginalDiskPath(String originalDiskPath) {
        this.originalDiskPath = originalDiskPath;
    }

    /**
     * <p>
     * The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     * </p>
     * 
     * @return The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     */

    public String getOriginalDiskPath() {
        return this.originalDiskPath;
    }

    /**
     * <p>
     * The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     * </p>
     * 
     * @param originalDiskPath
     *        The original disk path exposed to the instance (for example, <code>/dev/sdh</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskMap withOriginalDiskPath(String originalDiskPath) {
        setOriginalDiskPath(originalDiskPath);
        return this;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * 
     * @param newDiskName
     *        The new disk name (e.g., <code>my-new-disk</code>).
     */

    public void setNewDiskName(String newDiskName) {
        this.newDiskName = newDiskName;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * 
     * @return The new disk name (e.g., <code>my-new-disk</code>).
     */

    public String getNewDiskName() {
        return this.newDiskName;
    }

    /**
     * <p>
     * The new disk name (e.g., <code>my-new-disk</code>).
     * </p>
     * 
     * @param newDiskName
     *        The new disk name (e.g., <code>my-new-disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskMap withNewDiskName(String newDiskName) {
        setNewDiskName(newDiskName);
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
        if (getOriginalDiskPath() != null)
            sb.append("OriginalDiskPath: ").append(getOriginalDiskPath()).append(",");
        if (getNewDiskName() != null)
            sb.append("NewDiskName: ").append(getNewDiskName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskMap == false)
            return false;
        DiskMap other = (DiskMap) obj;
        if (other.getOriginalDiskPath() == null ^ this.getOriginalDiskPath() == null)
            return false;
        if (other.getOriginalDiskPath() != null && other.getOriginalDiskPath().equals(this.getOriginalDiskPath()) == false)
            return false;
        if (other.getNewDiskName() == null ^ this.getNewDiskName() == null)
            return false;
        if (other.getNewDiskName() != null && other.getNewDiskName().equals(this.getNewDiskName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginalDiskPath() == null) ? 0 : getOriginalDiskPath().hashCode());
        hashCode = prime * hashCode + ((getNewDiskName() == null) ? 0 : getNewDiskName().hashCode());
        return hashCode;
    }

    @Override
    public DiskMap clone() {
        try {
            return (DiskMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DiskMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
