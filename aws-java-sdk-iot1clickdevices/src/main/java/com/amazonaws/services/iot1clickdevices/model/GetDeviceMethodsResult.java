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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/GetDeviceMethods" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceMethodsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of available device APIs.
     * </p>
     */
    private java.util.List<DeviceMethod> deviceMethods;

    /**
     * <p>
     * List of available device APIs.
     * </p>
     * 
     * @return List of available device APIs.
     */

    public java.util.List<DeviceMethod> getDeviceMethods() {
        return deviceMethods;
    }

    /**
     * <p>
     * List of available device APIs.
     * </p>
     * 
     * @param deviceMethods
     *        List of available device APIs.
     */

    public void setDeviceMethods(java.util.Collection<DeviceMethod> deviceMethods) {
        if (deviceMethods == null) {
            this.deviceMethods = null;
            return;
        }

        this.deviceMethods = new java.util.ArrayList<DeviceMethod>(deviceMethods);
    }

    /**
     * <p>
     * List of available device APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceMethods(java.util.Collection)} or {@link #withDeviceMethods(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deviceMethods
     *        List of available device APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceMethodsResult withDeviceMethods(DeviceMethod... deviceMethods) {
        if (this.deviceMethods == null) {
            setDeviceMethods(new java.util.ArrayList<DeviceMethod>(deviceMethods.length));
        }
        for (DeviceMethod ele : deviceMethods) {
            this.deviceMethods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of available device APIs.
     * </p>
     * 
     * @param deviceMethods
     *        List of available device APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceMethodsResult withDeviceMethods(java.util.Collection<DeviceMethod> deviceMethods) {
        setDeviceMethods(deviceMethods);
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
        if (getDeviceMethods() != null)
            sb.append("DeviceMethods: ").append(getDeviceMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceMethodsResult == false)
            return false;
        GetDeviceMethodsResult other = (GetDeviceMethodsResult) obj;
        if (other.getDeviceMethods() == null ^ this.getDeviceMethods() == null)
            return false;
        if (other.getDeviceMethods() != null && other.getDeviceMethods().equals(this.getDeviceMethods()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceMethods() == null) ? 0 : getDeviceMethods().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceMethodsResult clone() {
        try {
            return (GetDeviceMethodsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
