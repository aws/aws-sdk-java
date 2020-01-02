/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Linux-specific modifications that are applied to the container, such as details for device mappings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/LinuxParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     */
    private java.util.List<Device> devices;

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @return Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *         <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *         option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public java.util.List<Device> getDevices() {
        return devices;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     */

    public void setDevices(java.util.Collection<Device> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<Device>(devices);
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withDevices(Device... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<Device>(devices.length));
        }
        for (Device ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * 
     * @param devices
     *        Any host devices to expose to the container. This parameter maps to <code>Devices</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.23/#create-a-container">Create a container</a> section of the
     *        <a href="https://docs.docker.com/engine/api/v1.23/">Docker Remote API</a> and the <code>--device</code>
     *        option to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withDevices(java.util.Collection<Device> devices) {
        setDevices(devices);
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
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinuxParameters == false)
            return false;
        LinuxParameters other = (LinuxParameters) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        return hashCode;
    }

    @Override
    public LinuxParameters clone() {
        try {
            return (LinuxParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.LinuxParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
