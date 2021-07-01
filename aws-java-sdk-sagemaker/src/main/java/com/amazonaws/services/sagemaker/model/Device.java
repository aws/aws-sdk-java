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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information of a particular device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Description of the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Amazon Web Services Internet of Things (IoT) object name.
     * </p>
     */
    private String iotThingName;

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @return The name of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Description of the device.
     * </p>
     * 
     * @param description
     *        Description of the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the device.
     * </p>
     * 
     * @return Description of the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the device.
     * </p>
     * 
     * @param description
     *        Description of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services Internet of Things (IoT) object name.
     * </p>
     * 
     * @param iotThingName
     *        Amazon Web Services Internet of Things (IoT) object name.
     */

    public void setIotThingName(String iotThingName) {
        this.iotThingName = iotThingName;
    }

    /**
     * <p>
     * Amazon Web Services Internet of Things (IoT) object name.
     * </p>
     * 
     * @return Amazon Web Services Internet of Things (IoT) object name.
     */

    public String getIotThingName() {
        return this.iotThingName;
    }

    /**
     * <p>
     * Amazon Web Services Internet of Things (IoT) object name.
     * </p>
     * 
     * @param iotThingName
     *        Amazon Web Services Internet of Things (IoT) object name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withIotThingName(String iotThingName) {
        setIotThingName(iotThingName);
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIotThingName() != null)
            sb.append("IotThingName: ").append(getIotThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIotThingName() == null ^ this.getIotThingName() == null)
            return false;
        if (other.getIotThingName() != null && other.getIotThingName().equals(this.getIotThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIotThingName() == null) ? 0 : getIotThingName().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
