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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for <code>SnowconeDeviceConfiguration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DeviceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone job.
     * </p>
     */
    private SnowconeDeviceConfiguration snowconeDeviceConfiguration;

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone job.
     * </p>
     * 
     * @param snowconeDeviceConfiguration
     *        Returns information about the device configuration for an AWS Snowcone job.
     */

    public void setSnowconeDeviceConfiguration(SnowconeDeviceConfiguration snowconeDeviceConfiguration) {
        this.snowconeDeviceConfiguration = snowconeDeviceConfiguration;
    }

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone job.
     * </p>
     * 
     * @return Returns information about the device configuration for an AWS Snowcone job.
     */

    public SnowconeDeviceConfiguration getSnowconeDeviceConfiguration() {
        return this.snowconeDeviceConfiguration;
    }

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone job.
     * </p>
     * 
     * @param snowconeDeviceConfiguration
     *        Returns information about the device configuration for an AWS Snowcone job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceConfiguration withSnowconeDeviceConfiguration(SnowconeDeviceConfiguration snowconeDeviceConfiguration) {
        setSnowconeDeviceConfiguration(snowconeDeviceConfiguration);
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
        if (getSnowconeDeviceConfiguration() != null)
            sb.append("SnowconeDeviceConfiguration: ").append(getSnowconeDeviceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceConfiguration == false)
            return false;
        DeviceConfiguration other = (DeviceConfiguration) obj;
        if (other.getSnowconeDeviceConfiguration() == null ^ this.getSnowconeDeviceConfiguration() == null)
            return false;
        if (other.getSnowconeDeviceConfiguration() != null && other.getSnowconeDeviceConfiguration().equals(this.getSnowconeDeviceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnowconeDeviceConfiguration() == null) ? 0 : getSnowconeDeviceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DeviceConfiguration clone() {
        try {
            return (DeviceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.DeviceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
