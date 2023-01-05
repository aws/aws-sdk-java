/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/ListDevices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of device structures that contain information about the device.
     * </p>
     */
    private java.util.List<DeviceSummary> devices;
    /**
     * <p>
     * A pagination token to continue to the next page of devices.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of device structures that contain information about the device.
     * </p>
     * 
     * @return A list of device structures that contain information about the device.
     */

    public java.util.List<DeviceSummary> getDevices() {
        return devices;
    }

    /**
     * <p>
     * A list of device structures that contain information about the device.
     * </p>
     * 
     * @param devices
     *        A list of device structures that contain information about the device.
     */

    public void setDevices(java.util.Collection<DeviceSummary> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceSummary>(devices);
    }

    /**
     * <p>
     * A list of device structures that contain information about the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        A list of device structures that contain information about the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesResult withDevices(DeviceSummary... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<DeviceSummary>(devices.length));
        }
        for (DeviceSummary ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of device structures that contain information about the device.
     * </p>
     * 
     * @param devices
     *        A list of device structures that contain information about the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesResult withDevices(java.util.Collection<DeviceSummary> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of devices.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of devices.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of devices.
     * </p>
     * 
     * @return A pagination token to continue to the next page of devices.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to continue to the next page of devices.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to continue to the next page of devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesResult == false)
            return false;
        ListDevicesResult other = (ListDevicesResult) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesResult clone() {
        try {
            return (ListDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
