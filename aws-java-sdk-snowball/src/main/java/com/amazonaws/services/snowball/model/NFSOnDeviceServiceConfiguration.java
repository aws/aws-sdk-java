/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents metadata and configuration settings for NFS service on an AWS Snow Family device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/NFSOnDeviceServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NFSOnDeviceServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum NFS storage for one Snowball Family device.
     * </p>
     */
    private Integer storageLimit;
    /**
     * <p>
     * The scale unit of the NFS storage on the device.
     * </p>
     * <p>
     * Valid values: TB.
     * </p>
     */
    private String storageUnit;

    /**
     * <p>
     * The maximum NFS storage for one Snowball Family device.
     * </p>
     * 
     * @param storageLimit
     *        The maximum NFS storage for one Snowball Family device.
     */

    public void setStorageLimit(Integer storageLimit) {
        this.storageLimit = storageLimit;
    }

    /**
     * <p>
     * The maximum NFS storage for one Snowball Family device.
     * </p>
     * 
     * @return The maximum NFS storage for one Snowball Family device.
     */

    public Integer getStorageLimit() {
        return this.storageLimit;
    }

    /**
     * <p>
     * The maximum NFS storage for one Snowball Family device.
     * </p>
     * 
     * @param storageLimit
     *        The maximum NFS storage for one Snowball Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSOnDeviceServiceConfiguration withStorageLimit(Integer storageLimit) {
        setStorageLimit(storageLimit);
        return this;
    }

    /**
     * <p>
     * The scale unit of the NFS storage on the device.
     * </p>
     * <p>
     * Valid values: TB.
     * </p>
     * 
     * @param storageUnit
     *        The scale unit of the NFS storage on the device.</p>
     *        <p>
     *        Valid values: TB.
     * @see StorageUnit
     */

    public void setStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit;
    }

    /**
     * <p>
     * The scale unit of the NFS storage on the device.
     * </p>
     * <p>
     * Valid values: TB.
     * </p>
     * 
     * @return The scale unit of the NFS storage on the device.</p>
     *         <p>
     *         Valid values: TB.
     * @see StorageUnit
     */

    public String getStorageUnit() {
        return this.storageUnit;
    }

    /**
     * <p>
     * The scale unit of the NFS storage on the device.
     * </p>
     * <p>
     * Valid values: TB.
     * </p>
     * 
     * @param storageUnit
     *        The scale unit of the NFS storage on the device.</p>
     *        <p>
     *        Valid values: TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageUnit
     */

    public NFSOnDeviceServiceConfiguration withStorageUnit(String storageUnit) {
        setStorageUnit(storageUnit);
        return this;
    }

    /**
     * <p>
     * The scale unit of the NFS storage on the device.
     * </p>
     * <p>
     * Valid values: TB.
     * </p>
     * 
     * @param storageUnit
     *        The scale unit of the NFS storage on the device.</p>
     *        <p>
     *        Valid values: TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageUnit
     */

    public NFSOnDeviceServiceConfiguration withStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit.toString();
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
        if (getStorageLimit() != null)
            sb.append("StorageLimit: ").append(getStorageLimit()).append(",");
        if (getStorageUnit() != null)
            sb.append("StorageUnit: ").append(getStorageUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NFSOnDeviceServiceConfiguration == false)
            return false;
        NFSOnDeviceServiceConfiguration other = (NFSOnDeviceServiceConfiguration) obj;
        if (other.getStorageLimit() == null ^ this.getStorageLimit() == null)
            return false;
        if (other.getStorageLimit() != null && other.getStorageLimit().equals(this.getStorageLimit()) == false)
            return false;
        if (other.getStorageUnit() == null ^ this.getStorageUnit() == null)
            return false;
        if (other.getStorageUnit() != null && other.getStorageUnit().equals(this.getStorageUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageLimit() == null) ? 0 : getStorageLimit().hashCode());
        hashCode = prime * hashCode + ((getStorageUnit() == null) ? 0 : getStorageUnit().hashCode());
        return hashCode;
    }

    @Override
    public NFSOnDeviceServiceConfiguration clone() {
        try {
            return (NFSOnDeviceServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.NFSOnDeviceServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
