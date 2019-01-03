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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/UpdateDeviceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * If true, the device is enabled. If false, the device is disabled.
     * </p>
     */
    private Boolean enabled;

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

    public UpdateDeviceStateRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * If true, the device is enabled. If false, the device is disabled.
     * </p>
     * 
     * @param enabled
     *        If true, the device is enabled. If false, the device is disabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If true, the device is enabled. If false, the device is disabled.
     * </p>
     * 
     * @return If true, the device is enabled. If false, the device is disabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If true, the device is enabled. If false, the device is disabled.
     * </p>
     * 
     * @param enabled
     *        If true, the device is enabled. If false, the device is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceStateRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If true, the device is enabled. If false, the device is disabled.
     * </p>
     * 
     * @return If true, the device is enabled. If false, the device is disabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceStateRequest == false)
            return false;
        UpdateDeviceStateRequest other = (UpdateDeviceStateRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceStateRequest clone() {
        return (UpdateDeviceStateRequest) super.clone();
    }

}
