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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Configuration settings for running telemetry.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/TelemetryConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TelemetryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Synchronization status of the device reported configuration with the desired configuration. */
    private String configurationSyncStatus;
    /** Configure telemetry to be on or off. */
    private String telemetry;

    /**
     * Synchronization status of the device reported configuration with the desired configuration.
     * 
     * @param configurationSyncStatus
     *        Synchronization status of the device reported configuration with the desired configuration.
     * @see ConfigurationSyncStatus
     */

    public void setConfigurationSyncStatus(String configurationSyncStatus) {
        this.configurationSyncStatus = configurationSyncStatus;
    }

    /**
     * Synchronization status of the device reported configuration with the desired configuration.
     * 
     * @return Synchronization status of the device reported configuration with the desired configuration.
     * @see ConfigurationSyncStatus
     */

    public String getConfigurationSyncStatus() {
        return this.configurationSyncStatus;
    }

    /**
     * Synchronization status of the device reported configuration with the desired configuration.
     * 
     * @param configurationSyncStatus
     *        Synchronization status of the device reported configuration with the desired configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSyncStatus
     */

    public TelemetryConfiguration withConfigurationSyncStatus(String configurationSyncStatus) {
        setConfigurationSyncStatus(configurationSyncStatus);
        return this;
    }

    /**
     * Synchronization status of the device reported configuration with the desired configuration.
     * 
     * @param configurationSyncStatus
     *        Synchronization status of the device reported configuration with the desired configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSyncStatus
     */

    public TelemetryConfiguration withConfigurationSyncStatus(ConfigurationSyncStatus configurationSyncStatus) {
        this.configurationSyncStatus = configurationSyncStatus.toString();
        return this;
    }

    /**
     * Configure telemetry to be on or off.
     * 
     * @param telemetry
     *        Configure telemetry to be on or off.
     * @see Telemetry
     */

    public void setTelemetry(String telemetry) {
        this.telemetry = telemetry;
    }

    /**
     * Configure telemetry to be on or off.
     * 
     * @return Configure telemetry to be on or off.
     * @see Telemetry
     */

    public String getTelemetry() {
        return this.telemetry;
    }

    /**
     * Configure telemetry to be on or off.
     * 
     * @param telemetry
     *        Configure telemetry to be on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Telemetry
     */

    public TelemetryConfiguration withTelemetry(String telemetry) {
        setTelemetry(telemetry);
        return this;
    }

    /**
     * Configure telemetry to be on or off.
     * 
     * @param telemetry
     *        Configure telemetry to be on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Telemetry
     */

    public TelemetryConfiguration withTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry.toString();
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
        if (getConfigurationSyncStatus() != null)
            sb.append("ConfigurationSyncStatus: ").append(getConfigurationSyncStatus()).append(",");
        if (getTelemetry() != null)
            sb.append("Telemetry: ").append(getTelemetry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelemetryConfiguration == false)
            return false;
        TelemetryConfiguration other = (TelemetryConfiguration) obj;
        if (other.getConfigurationSyncStatus() == null ^ this.getConfigurationSyncStatus() == null)
            return false;
        if (other.getConfigurationSyncStatus() != null && other.getConfigurationSyncStatus().equals(this.getConfigurationSyncStatus()) == false)
            return false;
        if (other.getTelemetry() == null ^ this.getTelemetry() == null)
            return false;
        if (other.getTelemetry() != null && other.getTelemetry().equals(this.getTelemetry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSyncStatus() == null) ? 0 : getConfigurationSyncStatus().hashCode());
        hashCode = prime * hashCode + ((getTelemetry() == null) ? 0 : getTelemetry().hashCode());
        return hashCode;
    }

    @Override
    public TelemetryConfiguration clone() {
        try {
            return (TelemetryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.TelemetryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
