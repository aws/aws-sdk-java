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
 * Runtime configuration for a thing.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/RuntimeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Configuration for telemetry service. */
    private TelemetryConfiguration telemetryConfiguration;

    /**
     * Configuration for telemetry service.
     * 
     * @param telemetryConfiguration
     *        Configuration for telemetry service.
     */

    public void setTelemetryConfiguration(TelemetryConfiguration telemetryConfiguration) {
        this.telemetryConfiguration = telemetryConfiguration;
    }

    /**
     * Configuration for telemetry service.
     * 
     * @return Configuration for telemetry service.
     */

    public TelemetryConfiguration getTelemetryConfiguration() {
        return this.telemetryConfiguration;
    }

    /**
     * Configuration for telemetry service.
     * 
     * @param telemetryConfiguration
     *        Configuration for telemetry service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withTelemetryConfiguration(TelemetryConfiguration telemetryConfiguration) {
        setTelemetryConfiguration(telemetryConfiguration);
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
        if (getTelemetryConfiguration() != null)
            sb.append("TelemetryConfiguration: ").append(getTelemetryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeConfiguration == false)
            return false;
        RuntimeConfiguration other = (RuntimeConfiguration) obj;
        if (other.getTelemetryConfiguration() == null ^ this.getTelemetryConfiguration() == null)
            return false;
        if (other.getTelemetryConfiguration() != null && other.getTelemetryConfiguration().equals(this.getTelemetryConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelemetryConfiguration() == null) ? 0 : getTelemetryConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeConfiguration clone() {
        try {
            return (RuntimeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.RuntimeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
