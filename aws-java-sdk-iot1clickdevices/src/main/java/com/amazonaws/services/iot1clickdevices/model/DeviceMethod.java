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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DeviceMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * The name of the method applicable to the deviceType.
     * </p>
     */
    private String methodName;

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @param deviceType
     *        The type of the device, such as "button".
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @return The type of the device, such as "button".
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The type of the device, such as "button".
     * </p>
     * 
     * @param deviceType
     *        The type of the device, such as "button".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceMethod withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * The name of the method applicable to the deviceType.
     * </p>
     * 
     * @param methodName
     *        The name of the method applicable to the deviceType.
     */

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * <p>
     * The name of the method applicable to the deviceType.
     * </p>
     * 
     * @return The name of the method applicable to the deviceType.
     */

    public String getMethodName() {
        return this.methodName;
    }

    /**
     * <p>
     * The name of the method applicable to the deviceType.
     * </p>
     * 
     * @param methodName
     *        The name of the method applicable to the deviceType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceMethod withMethodName(String methodName) {
        setMethodName(methodName);
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
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getMethodName() != null)
            sb.append("MethodName: ").append(getMethodName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceMethod == false)
            return false;
        DeviceMethod other = (DeviceMethod) obj;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getMethodName() == null ^ this.getMethodName() == null)
            return false;
        if (other.getMethodName() != null && other.getMethodName().equals(this.getMethodName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        return hashCode;
    }

    @Override
    public DeviceMethod clone() {
        try {
            return (DeviceMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickdevices.model.transform.DeviceMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
