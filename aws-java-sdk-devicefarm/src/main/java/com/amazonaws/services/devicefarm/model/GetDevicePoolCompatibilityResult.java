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

/**
 * <p>
 * Represents the result of describe device pool compatibility request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePoolCompatibility"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevicePoolCompatibilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about compatible devices.
     * </p>
     */
    private java.util.List<DevicePoolCompatibilityResult> compatibleDevices;
    /**
     * <p>
     * Information about incompatible devices.
     * </p>
     */
    private java.util.List<DevicePoolCompatibilityResult> incompatibleDevices;

    /**
     * <p>
     * Information about compatible devices.
     * </p>
     * 
     * @return Information about compatible devices.
     */

    public java.util.List<DevicePoolCompatibilityResult> getCompatibleDevices() {
        return compatibleDevices;
    }

    /**
     * <p>
     * Information about compatible devices.
     * </p>
     * 
     * @param compatibleDevices
     *        Information about compatible devices.
     */

    public void setCompatibleDevices(java.util.Collection<DevicePoolCompatibilityResult> compatibleDevices) {
        if (compatibleDevices == null) {
            this.compatibleDevices = null;
            return;
        }

        this.compatibleDevices = new java.util.ArrayList<DevicePoolCompatibilityResult>(compatibleDevices);
    }

    /**
     * <p>
     * Information about compatible devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleDevices(java.util.Collection)} or {@link #withCompatibleDevices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param compatibleDevices
     *        Information about compatible devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePoolCompatibilityResult withCompatibleDevices(DevicePoolCompatibilityResult... compatibleDevices) {
        if (this.compatibleDevices == null) {
            setCompatibleDevices(new java.util.ArrayList<DevicePoolCompatibilityResult>(compatibleDevices.length));
        }
        for (DevicePoolCompatibilityResult ele : compatibleDevices) {
            this.compatibleDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about compatible devices.
     * </p>
     * 
     * @param compatibleDevices
     *        Information about compatible devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePoolCompatibilityResult withCompatibleDevices(java.util.Collection<DevicePoolCompatibilityResult> compatibleDevices) {
        setCompatibleDevices(compatibleDevices);
        return this;
    }

    /**
     * <p>
     * Information about incompatible devices.
     * </p>
     * 
     * @return Information about incompatible devices.
     */

    public java.util.List<DevicePoolCompatibilityResult> getIncompatibleDevices() {
        return incompatibleDevices;
    }

    /**
     * <p>
     * Information about incompatible devices.
     * </p>
     * 
     * @param incompatibleDevices
     *        Information about incompatible devices.
     */

    public void setIncompatibleDevices(java.util.Collection<DevicePoolCompatibilityResult> incompatibleDevices) {
        if (incompatibleDevices == null) {
            this.incompatibleDevices = null;
            return;
        }

        this.incompatibleDevices = new java.util.ArrayList<DevicePoolCompatibilityResult>(incompatibleDevices);
    }

    /**
     * <p>
     * Information about incompatible devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncompatibleDevices(java.util.Collection)} or {@link #withIncompatibleDevices(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param incompatibleDevices
     *        Information about incompatible devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePoolCompatibilityResult withIncompatibleDevices(DevicePoolCompatibilityResult... incompatibleDevices) {
        if (this.incompatibleDevices == null) {
            setIncompatibleDevices(new java.util.ArrayList<DevicePoolCompatibilityResult>(incompatibleDevices.length));
        }
        for (DevicePoolCompatibilityResult ele : incompatibleDevices) {
            this.incompatibleDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about incompatible devices.
     * </p>
     * 
     * @param incompatibleDevices
     *        Information about incompatible devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePoolCompatibilityResult withIncompatibleDevices(java.util.Collection<DevicePoolCompatibilityResult> incompatibleDevices) {
        setIncompatibleDevices(incompatibleDevices);
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
        if (getCompatibleDevices() != null)
            sb.append("CompatibleDevices: ").append(getCompatibleDevices()).append(",");
        if (getIncompatibleDevices() != null)
            sb.append("IncompatibleDevices: ").append(getIncompatibleDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePoolCompatibilityResult == false)
            return false;
        GetDevicePoolCompatibilityResult other = (GetDevicePoolCompatibilityResult) obj;
        if (other.getCompatibleDevices() == null ^ this.getCompatibleDevices() == null)
            return false;
        if (other.getCompatibleDevices() != null && other.getCompatibleDevices().equals(this.getCompatibleDevices()) == false)
            return false;
        if (other.getIncompatibleDevices() == null ^ this.getIncompatibleDevices() == null)
            return false;
        if (other.getIncompatibleDevices() != null && other.getIncompatibleDevices().equals(this.getIncompatibleDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleDevices() == null) ? 0 : getCompatibleDevices().hashCode());
        hashCode = prime * hashCode + ((getIncompatibleDevices() == null) ? 0 : getIncompatibleDevices().hashCode());
        return hashCode;
    }

    @Override
    public GetDevicePoolCompatibilityResult clone() {
        try {
            return (GetDevicePoolCompatibilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
