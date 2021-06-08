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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RegisterDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * A list of devices to register with SageMaker Edge Manager.
     * </p>
     */
    private java.util.List<Device> devices;
    /**
     * <p>
     * The tags associated with devices.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDevicesRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * A list of devices to register with SageMaker Edge Manager.
     * </p>
     * 
     * @return A list of devices to register with SageMaker Edge Manager.
     */

    public java.util.List<Device> getDevices() {
        return devices;
    }

    /**
     * <p>
     * A list of devices to register with SageMaker Edge Manager.
     * </p>
     * 
     * @param devices
     *        A list of devices to register with SageMaker Edge Manager.
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
     * A list of devices to register with SageMaker Edge Manager.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        A list of devices to register with SageMaker Edge Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDevicesRequest withDevices(Device... devices) {
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
     * A list of devices to register with SageMaker Edge Manager.
     * </p>
     * 
     * @param devices
     *        A list of devices to register with SageMaker Edge Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDevicesRequest withDevices(java.util.Collection<Device> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * The tags associated with devices.
     * </p>
     * 
     * @return The tags associated with devices.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with devices.
     * </p>
     * 
     * @param tags
     *        The tags associated with devices.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDevicesRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with devices.
     * </p>
     * 
     * @param tags
     *        The tags associated with devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDevicesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDevicesRequest == false)
            return false;
        RegisterDevicesRequest other = (RegisterDevicesRequest) obj;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RegisterDevicesRequest clone() {
        return (RegisterDevicesRequest) super.clone();
    }

}
