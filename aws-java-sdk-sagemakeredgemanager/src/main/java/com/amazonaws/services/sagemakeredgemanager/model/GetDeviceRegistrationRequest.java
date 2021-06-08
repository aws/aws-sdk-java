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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeviceRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceRegistrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the device you want to get the registration status from.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     */
    private String deviceFleetName;

    /**
     * <p>
     * The unique name of the device you want to get the registration status from.
     * </p>
     * 
     * @param deviceName
     *        The unique name of the device you want to get the registration status from.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The unique name of the device you want to get the registration status from.
     * </p>
     * 
     * @return The unique name of the device you want to get the registration status from.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The unique name of the device you want to get the registration status from.
     * </p>
     * 
     * @param deviceName
     *        The unique name of the device you want to get the registration status from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceRegistrationRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @return The name of the fleet that the device belongs to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceRegistrationRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceRegistrationRequest == false)
            return false;
        GetDeviceRegistrationRequest other = (GetDeviceRegistrationRequest) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceRegistrationRequest clone() {
        return (GetDeviceRegistrationRequest) super.clone();
    }

}
