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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The size and type of temporary storage that is used to hold data during the savedown process. All the data written to
 * this storage space is lost when the cluster node is restarted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxSavedownStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxSavedownStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The size of temporary storage in gibibytes.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     * </p>
     */
    private String volumeName;

    /**
     * <p>
     * The type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of writeable storage space for temporarily storing your savedown data. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     *        </p>
     *        </li>
     * @see KxSavedownStorageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of writeable storage space for temporarily storing your savedown data. The valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     *         </p>
     *         </li>
     * @see KxSavedownStorageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of writeable storage space for temporarily storing your savedown data. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxSavedownStorageType
     */

    public KxSavedownStorageConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of writeable storage space for temporarily storing your savedown data. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SDS01 – This type represents 3000 IOPS and io2 ebs volume type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxSavedownStorageType
     */

    public KxSavedownStorageConfiguration withType(KxSavedownStorageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The size of temporary storage in gibibytes.
     * </p>
     * 
     * @param size
     *        The size of temporary storage in gibibytes.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of temporary storage in gibibytes.
     * </p>
     * 
     * @return The size of temporary storage in gibibytes.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of temporary storage in gibibytes.
     * </p>
     * 
     * @param size
     *        The size of temporary storage in gibibytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxSavedownStorageConfiguration withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     * </p>
     * 
     * @param volumeName
     *        The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     * </p>
     * 
     * @return The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     * </p>
     * 
     * @param volumeName
     *        The name of the kdb volume that you want to use as writeable save-down storage for clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxSavedownStorageConfiguration withVolumeName(String volumeName) {
        setVolumeName(volumeName);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxSavedownStorageConfiguration == false)
            return false;
        KxSavedownStorageConfiguration other = (KxSavedownStorageConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        return hashCode;
    }

    @Override
    public KxSavedownStorageConfiguration clone() {
        try {
            return (KxSavedownStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxSavedownStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
