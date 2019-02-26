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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/DescribeDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Device details.
     * </p>
     */
    private DeviceDescription deviceDescription;

    /**
     * <p>
     * Device details.
     * </p>
     * 
     * @param deviceDescription
     *        Device details.
     */

    public void setDeviceDescription(DeviceDescription deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    /**
     * <p>
     * Device details.
     * </p>
     * 
     * @return Device details.
     */

    public DeviceDescription getDeviceDescription() {
        return this.deviceDescription;
    }

    /**
     * <p>
     * Device details.
     * </p>
     * 
     * @param deviceDescription
     *        Device details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceDescription(DeviceDescription deviceDescription) {
        setDeviceDescription(deviceDescription);
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
        if (getDeviceDescription() != null)
            sb.append("DeviceDescription: ").append(getDeviceDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;
        if (other.getDeviceDescription() == null ^ this.getDeviceDescription() == null)
            return false;
        if (other.getDeviceDescription() != null && other.getDeviceDescription().equals(this.getDeviceDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceDescription() == null) ? 0 : getDeviceDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceResult clone() {
        try {
            return (DescribeDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
