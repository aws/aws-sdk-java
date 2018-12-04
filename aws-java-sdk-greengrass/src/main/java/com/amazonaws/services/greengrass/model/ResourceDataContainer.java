/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A container of data for all resource types.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResourceDataContainer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataContainer implements Serializable, Cloneable, StructuredPojo {

    /** Attributes that define the Local Device Resource. */
    private LocalDeviceResourceData localDeviceResourceData;
    /** Attributes that define the Local Volume Resource. */
    private LocalVolumeResourceData localVolumeResourceData;

    /**
     * Attributes that define the Local Device Resource.
     * 
     * @param localDeviceResourceData
     *        Attributes that define the Local Device Resource.
     */

    public void setLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
    }

    /**
     * Attributes that define the Local Device Resource.
     * 
     * @return Attributes that define the Local Device Resource.
     */

    public LocalDeviceResourceData getLocalDeviceResourceData() {
        return this.localDeviceResourceData;
    }

    /**
     * Attributes that define the Local Device Resource.
     * 
     * @param localDeviceResourceData
     *        Attributes that define the Local Device Resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        setLocalDeviceResourceData(localDeviceResourceData);
        return this;
    }

    /**
     * Attributes that define the Local Volume Resource.
     * 
     * @param localVolumeResourceData
     *        Attributes that define the Local Volume Resource.
     */

    public void setLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
    }

    /**
     * Attributes that define the Local Volume Resource.
     * 
     * @return Attributes that define the Local Volume Resource.
     */

    public LocalVolumeResourceData getLocalVolumeResourceData() {
        return this.localVolumeResourceData;
    }

    /**
     * Attributes that define the Local Volume Resource.
     * 
     * @param localVolumeResourceData
     *        Attributes that define the Local Volume Resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataContainer withLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        setLocalVolumeResourceData(localVolumeResourceData);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocalDeviceResourceData() != null)
            sb.append("LocalDeviceResourceData: ").append(getLocalDeviceResourceData()).append(",");
        if (getLocalVolumeResourceData() != null)
            sb.append("LocalVolumeResourceData: ").append(getLocalVolumeResourceData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataContainer == false)
            return false;
        ResourceDataContainer other = (ResourceDataContainer) obj;
        if (other.getLocalDeviceResourceData() == null ^ this.getLocalDeviceResourceData() == null)
            return false;
        if (other.getLocalDeviceResourceData() != null && other.getLocalDeviceResourceData().equals(this.getLocalDeviceResourceData()) == false)
            return false;
        if (other.getLocalVolumeResourceData() == null ^ this.getLocalVolumeResourceData() == null)
            return false;
        if (other.getLocalVolumeResourceData() != null && other.getLocalVolumeResourceData().equals(this.getLocalVolumeResourceData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalDeviceResourceData() == null) ? 0 : getLocalDeviceResourceData().hashCode());
        hashCode = prime * hashCode + ((getLocalVolumeResourceData() == null) ? 0 : getLocalVolumeResourceData().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataContainer clone() {
        try {
            return (ResourceDataContainer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ResourceDataContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
