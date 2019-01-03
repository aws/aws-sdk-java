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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/InvokeDeviceMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeDeviceMethodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The device method to invoke.
     * </p>
     */
    private DeviceMethod deviceMethod;
    /**
     * <p>
     * A JSON encoded string containing the device method request parameters.
     * </p>
     */
    private String deviceMethodParameters;

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @return The unique identifier of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeDeviceMethodRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The device method to invoke.
     * </p>
     * 
     * @param deviceMethod
     *        The device method to invoke.
     */

    public void setDeviceMethod(DeviceMethod deviceMethod) {
        this.deviceMethod = deviceMethod;
    }

    /**
     * <p>
     * The device method to invoke.
     * </p>
     * 
     * @return The device method to invoke.
     */

    public DeviceMethod getDeviceMethod() {
        return this.deviceMethod;
    }

    /**
     * <p>
     * The device method to invoke.
     * </p>
     * 
     * @param deviceMethod
     *        The device method to invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeDeviceMethodRequest withDeviceMethod(DeviceMethod deviceMethod) {
        setDeviceMethod(deviceMethod);
        return this;
    }

    /**
     * <p>
     * A JSON encoded string containing the device method request parameters.
     * </p>
     * 
     * @param deviceMethodParameters
     *        A JSON encoded string containing the device method request parameters.
     */

    public void setDeviceMethodParameters(String deviceMethodParameters) {
        this.deviceMethodParameters = deviceMethodParameters;
    }

    /**
     * <p>
     * A JSON encoded string containing the device method request parameters.
     * </p>
     * 
     * @return A JSON encoded string containing the device method request parameters.
     */

    public String getDeviceMethodParameters() {
        return this.deviceMethodParameters;
    }

    /**
     * <p>
     * A JSON encoded string containing the device method request parameters.
     * </p>
     * 
     * @param deviceMethodParameters
     *        A JSON encoded string containing the device method request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeDeviceMethodRequest withDeviceMethodParameters(String deviceMethodParameters) {
        setDeviceMethodParameters(deviceMethodParameters);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDeviceMethod() != null)
            sb.append("DeviceMethod: ").append(getDeviceMethod()).append(",");
        if (getDeviceMethodParameters() != null)
            sb.append("DeviceMethodParameters: ").append(getDeviceMethodParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeDeviceMethodRequest == false)
            return false;
        InvokeDeviceMethodRequest other = (InvokeDeviceMethodRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceMethod() == null ^ this.getDeviceMethod() == null)
            return false;
        if (other.getDeviceMethod() != null && other.getDeviceMethod().equals(this.getDeviceMethod()) == false)
            return false;
        if (other.getDeviceMethodParameters() == null ^ this.getDeviceMethodParameters() == null)
            return false;
        if (other.getDeviceMethodParameters() != null && other.getDeviceMethodParameters().equals(this.getDeviceMethodParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceMethod() == null) ? 0 : getDeviceMethod().hashCode());
        hashCode = prime * hashCode + ((getDeviceMethodParameters() == null) ? 0 : getDeviceMethodParameters().hashCode());
        return hashCode;
    }

    @Override
    public InvokeDeviceMethodRequest clone() {
        return (InvokeDeviceMethodRequest) super.clone();
    }

}
