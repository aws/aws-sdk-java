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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UpdateDeviceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @return A description for the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceMetadataRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceMetadataRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceMetadataRequest == false)
            return false;
        UpdateDeviceMetadataRequest other = (UpdateDeviceMetadataRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceMetadataRequest clone() {
        return (UpdateDeviceMetadataRequest) super.clone();
    }

}
