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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for how much storage a user or group can use on the volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSUserOrGroupQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSUserOrGroupQuota implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that specifies whether the quota applies to a user or group.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the user or group.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The amount of storage that the user or group can use in gibibytes (GiB).
     * </p>
     */
    private Integer storageCapacityQuotaGiB;

    /**
     * <p>
     * A value that specifies whether the quota applies to a user or group.
     * </p>
     * 
     * @param type
     *        A value that specifies whether the quota applies to a user or group.
     * @see OpenZFSQuotaType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A value that specifies whether the quota applies to a user or group.
     * </p>
     * 
     * @return A value that specifies whether the quota applies to a user or group.
     * @see OpenZFSQuotaType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A value that specifies whether the quota applies to a user or group.
     * </p>
     * 
     * @param type
     *        A value that specifies whether the quota applies to a user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSQuotaType
     */

    public OpenZFSUserOrGroupQuota withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the quota applies to a user or group.
     * </p>
     * 
     * @param type
     *        A value that specifies whether the quota applies to a user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSQuotaType
     */

    public OpenZFSUserOrGroupQuota withType(OpenZFSQuotaType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the user or group.
     * </p>
     * 
     * @param id
     *        The ID of the user or group.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the user or group.
     * </p>
     * 
     * @return The ID of the user or group.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the user or group.
     * </p>
     * 
     * @param id
     *        The ID of the user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSUserOrGroupQuota withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The amount of storage that the user or group can use in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The amount of storage that the user or group can use in gibibytes (GiB).
     */

    public void setStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        this.storageCapacityQuotaGiB = storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The amount of storage that the user or group can use in gibibytes (GiB).
     * </p>
     * 
     * @return The amount of storage that the user or group can use in gibibytes (GiB).
     */

    public Integer getStorageCapacityQuotaGiB() {
        return this.storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The amount of storage that the user or group can use in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The amount of storage that the user or group can use in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSUserOrGroupQuota withStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        setStorageCapacityQuotaGiB(storageCapacityQuotaGiB);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStorageCapacityQuotaGiB() != null)
            sb.append("StorageCapacityQuotaGiB: ").append(getStorageCapacityQuotaGiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSUserOrGroupQuota == false)
            return false;
        OpenZFSUserOrGroupQuota other = (OpenZFSUserOrGroupQuota) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStorageCapacityQuotaGiB() == null ^ this.getStorageCapacityQuotaGiB() == null)
            return false;
        if (other.getStorageCapacityQuotaGiB() != null && other.getStorageCapacityQuotaGiB().equals(this.getStorageCapacityQuotaGiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityQuotaGiB() == null) ? 0 : getStorageCapacityQuotaGiB().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSUserOrGroupQuota clone() {
        try {
            return (OpenZFSUserOrGroupQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSUserOrGroupQuotaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
