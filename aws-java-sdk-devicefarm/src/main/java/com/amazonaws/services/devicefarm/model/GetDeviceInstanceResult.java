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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDeviceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about your device instance.
     * </p>
     */
    private DeviceInstance deviceInstance;

    /**
     * <p>
     * An object containing information about your device instance.
     * </p>
     * 
     * @param deviceInstance
     *        An object containing information about your device instance.
     */

    public void setDeviceInstance(DeviceInstance deviceInstance) {
        this.deviceInstance = deviceInstance;
    }

    /**
     * <p>
     * An object containing information about your device instance.
     * </p>
     * 
     * @return An object containing information about your device instance.
     */

    public DeviceInstance getDeviceInstance() {
        return this.deviceInstance;
    }

    /**
     * <p>
     * An object containing information about your device instance.
     * </p>
     * 
     * @param deviceInstance
     *        An object containing information about your device instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceInstanceResult withDeviceInstance(DeviceInstance deviceInstance) {
        setDeviceInstance(deviceInstance);
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
        if (getDeviceInstance() != null)
            sb.append("DeviceInstance: ").append(getDeviceInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceInstanceResult == false)
            return false;
        GetDeviceInstanceResult other = (GetDeviceInstanceResult) obj;
        if (other.getDeviceInstance() == null ^ this.getDeviceInstance() == null)
            return false;
        if (other.getDeviceInstance() != null && other.getDeviceInstance().equals(this.getDeviceInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceInstance() == null) ? 0 : getDeviceInstance().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceInstanceResult clone() {
        try {
            return (GetDeviceInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
