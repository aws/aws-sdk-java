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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/GetDevicesInPlacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevicesInPlacementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing the devices (zero or more) within the placement.
     * </p>
     */
    private java.util.Map<String, String> devices;

    /**
     * <p>
     * An object containing the devices (zero or more) within the placement.
     * </p>
     * 
     * @return An object containing the devices (zero or more) within the placement.
     */

    public java.util.Map<String, String> getDevices() {
        return devices;
    }

    /**
     * <p>
     * An object containing the devices (zero or more) within the placement.
     * </p>
     * 
     * @param devices
     *        An object containing the devices (zero or more) within the placement.
     */

    public void setDevices(java.util.Map<String, String> devices) {
        this.devices = devices;
    }

    /**
     * <p>
     * An object containing the devices (zero or more) within the placement.
     * </p>
     * 
     * @param devices
     *        An object containing the devices (zero or more) within the placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicesInPlacementResult withDevices(java.util.Map<String, String> devices) {
        setDevices(devices);
        return this;
    }

    public GetDevicesInPlacementResult addDevicesEntry(String key, String value) {
        if (null == this.devices) {
            this.devices = new java.util.HashMap<String, String>();
        }
        if (this.devices.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.devices.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Devices.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicesInPlacementResult clearDevicesEntries() {
        this.devices = null;
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

        if (obj instanceof GetDevicesInPlacementResult == false)
            return false;
        GetDevicesInPlacementResult other = (GetDevicesInPlacementResult) obj;
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
    public GetDevicesInPlacementResult clone() {
        try {
            return (GetDevicesInPlacementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
