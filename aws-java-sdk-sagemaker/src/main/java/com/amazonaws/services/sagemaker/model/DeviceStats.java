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
 * Status of devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeviceStats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of devices connected with a heartbeat.
     * </p>
     */
    private Long connectedDeviceCount;
    /**
     * <p>
     * The number of registered devices.
     * </p>
     */
    private Long registeredDeviceCount;

    /**
     * <p>
     * The number of devices connected with a heartbeat.
     * </p>
     * 
     * @param connectedDeviceCount
     *        The number of devices connected with a heartbeat.
     */

    public void setConnectedDeviceCount(Long connectedDeviceCount) {
        this.connectedDeviceCount = connectedDeviceCount;
    }

    /**
     * <p>
     * The number of devices connected with a heartbeat.
     * </p>
     * 
     * @return The number of devices connected with a heartbeat.
     */

    public Long getConnectedDeviceCount() {
        return this.connectedDeviceCount;
    }

    /**
     * <p>
     * The number of devices connected with a heartbeat.
     * </p>
     * 
     * @param connectedDeviceCount
     *        The number of devices connected with a heartbeat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceStats withConnectedDeviceCount(Long connectedDeviceCount) {
        setConnectedDeviceCount(connectedDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of registered devices.
     * </p>
     * 
     * @param registeredDeviceCount
     *        The number of registered devices.
     */

    public void setRegisteredDeviceCount(Long registeredDeviceCount) {
        this.registeredDeviceCount = registeredDeviceCount;
    }

    /**
     * <p>
     * The number of registered devices.
     * </p>
     * 
     * @return The number of registered devices.
     */

    public Long getRegisteredDeviceCount() {
        return this.registeredDeviceCount;
    }

    /**
     * <p>
     * The number of registered devices.
     * </p>
     * 
     * @param registeredDeviceCount
     *        The number of registered devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceStats withRegisteredDeviceCount(Long registeredDeviceCount) {
        setRegisteredDeviceCount(registeredDeviceCount);
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
        if (getConnectedDeviceCount() != null)
            sb.append("ConnectedDeviceCount: ").append(getConnectedDeviceCount()).append(",");
        if (getRegisteredDeviceCount() != null)
            sb.append("RegisteredDeviceCount: ").append(getRegisteredDeviceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceStats == false)
            return false;
        DeviceStats other = (DeviceStats) obj;
        if (other.getConnectedDeviceCount() == null ^ this.getConnectedDeviceCount() == null)
            return false;
        if (other.getConnectedDeviceCount() != null && other.getConnectedDeviceCount().equals(this.getConnectedDeviceCount()) == false)
            return false;
        if (other.getRegisteredDeviceCount() == null ^ this.getRegisteredDeviceCount() == null)
            return false;
        if (other.getRegisteredDeviceCount() != null && other.getRegisteredDeviceCount().equals(this.getRegisteredDeviceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectedDeviceCount() == null) ? 0 : getConnectedDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getRegisteredDeviceCount() == null) ? 0 : getRegisteredDeviceCount().hashCode());
        return hashCode;
    }

    @Override
    public DeviceStats clone() {
        try {
            return (DeviceStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeviceStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
