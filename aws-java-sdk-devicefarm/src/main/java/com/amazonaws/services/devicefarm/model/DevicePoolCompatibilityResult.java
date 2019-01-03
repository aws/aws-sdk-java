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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a device pool compatibility result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DevicePoolCompatibilityResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevicePoolCompatibilityResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device (phone or tablet) that you wish to return information about.
     * </p>
     */
    private Device device;
    /**
     * <p>
     * Whether the result was compatible with the device pool.
     * </p>
     */
    private Boolean compatible;
    /**
     * <p>
     * Information about the compatibility.
     * </p>
     */
    private java.util.List<IncompatibilityMessage> incompatibilityMessages;

    /**
     * <p>
     * The device (phone or tablet) that you wish to return information about.
     * </p>
     * 
     * @param device
     *        The device (phone or tablet) that you wish to return information about.
     */

    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * <p>
     * The device (phone or tablet) that you wish to return information about.
     * </p>
     * 
     * @return The device (phone or tablet) that you wish to return information about.
     */

    public Device getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device (phone or tablet) that you wish to return information about.
     * </p>
     * 
     * @param device
     *        The device (phone or tablet) that you wish to return information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePoolCompatibilityResult withDevice(Device device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * Whether the result was compatible with the device pool.
     * </p>
     * 
     * @param compatible
     *        Whether the result was compatible with the device pool.
     */

    public void setCompatible(Boolean compatible) {
        this.compatible = compatible;
    }

    /**
     * <p>
     * Whether the result was compatible with the device pool.
     * </p>
     * 
     * @return Whether the result was compatible with the device pool.
     */

    public Boolean getCompatible() {
        return this.compatible;
    }

    /**
     * <p>
     * Whether the result was compatible with the device pool.
     * </p>
     * 
     * @param compatible
     *        Whether the result was compatible with the device pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePoolCompatibilityResult withCompatible(Boolean compatible) {
        setCompatible(compatible);
        return this;
    }

    /**
     * <p>
     * Whether the result was compatible with the device pool.
     * </p>
     * 
     * @return Whether the result was compatible with the device pool.
     */

    public Boolean isCompatible() {
        return this.compatible;
    }

    /**
     * <p>
     * Information about the compatibility.
     * </p>
     * 
     * @return Information about the compatibility.
     */

    public java.util.List<IncompatibilityMessage> getIncompatibilityMessages() {
        return incompatibilityMessages;
    }

    /**
     * <p>
     * Information about the compatibility.
     * </p>
     * 
     * @param incompatibilityMessages
     *        Information about the compatibility.
     */

    public void setIncompatibilityMessages(java.util.Collection<IncompatibilityMessage> incompatibilityMessages) {
        if (incompatibilityMessages == null) {
            this.incompatibilityMessages = null;
            return;
        }

        this.incompatibilityMessages = new java.util.ArrayList<IncompatibilityMessage>(incompatibilityMessages);
    }

    /**
     * <p>
     * Information about the compatibility.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncompatibilityMessages(java.util.Collection)} or
     * {@link #withIncompatibilityMessages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param incompatibilityMessages
     *        Information about the compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePoolCompatibilityResult withIncompatibilityMessages(IncompatibilityMessage... incompatibilityMessages) {
        if (this.incompatibilityMessages == null) {
            setIncompatibilityMessages(new java.util.ArrayList<IncompatibilityMessage>(incompatibilityMessages.length));
        }
        for (IncompatibilityMessage ele : incompatibilityMessages) {
            this.incompatibilityMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the compatibility.
     * </p>
     * 
     * @param incompatibilityMessages
     *        Information about the compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePoolCompatibilityResult withIncompatibilityMessages(java.util.Collection<IncompatibilityMessage> incompatibilityMessages) {
        setIncompatibilityMessages(incompatibilityMessages);
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
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getCompatible() != null)
            sb.append("Compatible: ").append(getCompatible()).append(",");
        if (getIncompatibilityMessages() != null)
            sb.append("IncompatibilityMessages: ").append(getIncompatibilityMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevicePoolCompatibilityResult == false)
            return false;
        DevicePoolCompatibilityResult other = (DevicePoolCompatibilityResult) obj;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getCompatible() == null ^ this.getCompatible() == null)
            return false;
        if (other.getCompatible() != null && other.getCompatible().equals(this.getCompatible()) == false)
            return false;
        if (other.getIncompatibilityMessages() == null ^ this.getIncompatibilityMessages() == null)
            return false;
        if (other.getIncompatibilityMessages() != null && other.getIncompatibilityMessages().equals(this.getIncompatibilityMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getCompatible() == null) ? 0 : getCompatible().hashCode());
        hashCode = prime * hashCode + ((getIncompatibilityMessages() == null) ? 0 : getIncompatibilityMessages().hashCode());
        return hashCode;
    }

    @Override
    public DevicePoolCompatibilityResult clone() {
        try {
            return (DevicePoolCompatibilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DevicePoolCompatibilityResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
