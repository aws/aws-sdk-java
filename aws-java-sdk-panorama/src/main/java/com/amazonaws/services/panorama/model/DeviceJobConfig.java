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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A job's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeviceJobConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     * </p>
     */
    private OTAJobConfig oTAJobConfig;

    /**
     * <p>
     * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     * </p>
     * 
     * @param oTAJobConfig
     *        A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     */

    public void setOTAJobConfig(OTAJobConfig oTAJobConfig) {
        this.oTAJobConfig = oTAJobConfig;
    }

    /**
     * <p>
     * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     * </p>
     * 
     * @return A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     */

    public OTAJobConfig getOTAJobConfig() {
        return this.oTAJobConfig;
    }

    /**
     * <p>
     * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     * </p>
     * 
     * @param oTAJobConfig
     *        A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceJobConfig withOTAJobConfig(OTAJobConfig oTAJobConfig) {
        setOTAJobConfig(oTAJobConfig);
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
        if (getOTAJobConfig() != null)
            sb.append("OTAJobConfig: ").append(getOTAJobConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceJobConfig == false)
            return false;
        DeviceJobConfig other = (DeviceJobConfig) obj;
        if (other.getOTAJobConfig() == null ^ this.getOTAJobConfig() == null)
            return false;
        if (other.getOTAJobConfig() != null && other.getOTAJobConfig().equals(this.getOTAJobConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOTAJobConfig() == null) ? 0 : getOTAJobConfig().hashCode());
        return hashCode;
    }

    @Override
    public DeviceJobConfig clone() {
        try {
            return (DeviceJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.DeviceJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
