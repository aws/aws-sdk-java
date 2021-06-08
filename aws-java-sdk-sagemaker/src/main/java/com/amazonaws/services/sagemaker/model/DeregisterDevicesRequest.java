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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeregisterDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The unique IDs of the devices.
     * </p>
     */
    private java.util.List<String> deviceNames;

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the devices belong to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @return The name of the fleet the devices belong to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the devices belong to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the devices belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDevicesRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The unique IDs of the devices.
     * </p>
     * 
     * @return The unique IDs of the devices.
     */

    public java.util.List<String> getDeviceNames() {
        return deviceNames;
    }

    /**
     * <p>
     * The unique IDs of the devices.
     * </p>
     * 
     * @param deviceNames
     *        The unique IDs of the devices.
     */

    public void setDeviceNames(java.util.Collection<String> deviceNames) {
        if (deviceNames == null) {
            this.deviceNames = null;
            return;
        }

        this.deviceNames = new java.util.ArrayList<String>(deviceNames);
    }

    /**
     * <p>
     * The unique IDs of the devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceNames(java.util.Collection)} or {@link #withDeviceNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceNames
     *        The unique IDs of the devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDevicesRequest withDeviceNames(String... deviceNames) {
        if (this.deviceNames == null) {
            setDeviceNames(new java.util.ArrayList<String>(deviceNames.length));
        }
        for (String ele : deviceNames) {
            this.deviceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of the devices.
     * </p>
     * 
     * @param deviceNames
     *        The unique IDs of the devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDevicesRequest withDeviceNames(java.util.Collection<String> deviceNames) {
        setDeviceNames(deviceNames);
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
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getDeviceNames() != null)
            sb.append("DeviceNames: ").append(getDeviceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterDevicesRequest == false)
            return false;
        DeregisterDevicesRequest other = (DeregisterDevicesRequest) obj;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getDeviceNames() == null ^ this.getDeviceNames() == null)
            return false;
        if (other.getDeviceNames() != null && other.getDeviceNames().equals(this.getDeviceNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getDeviceNames() == null) ? 0 : getDeviceNames().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterDevicesRequest clone() {
        return (DeregisterDevicesRequest) super.clone();
    }

}
