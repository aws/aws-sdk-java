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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateThingRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThingRuntimeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Configuration for telemetry service. */
    private TelemetryConfigurationUpdate telemetryConfiguration;
    /** The thing name. */
    private String thingName;

    /**
     * Configuration for telemetry service.
     * 
     * @param telemetryConfiguration
     *        Configuration for telemetry service.
     */

    public void setTelemetryConfiguration(TelemetryConfigurationUpdate telemetryConfiguration) {
        this.telemetryConfiguration = telemetryConfiguration;
    }

    /**
     * Configuration for telemetry service.
     * 
     * @return Configuration for telemetry service.
     */

    public TelemetryConfigurationUpdate getTelemetryConfiguration() {
        return this.telemetryConfiguration;
    }

    /**
     * Configuration for telemetry service.
     * 
     * @param telemetryConfiguration
     *        Configuration for telemetry service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRuntimeConfigurationRequest withTelemetryConfiguration(TelemetryConfigurationUpdate telemetryConfiguration) {
        setTelemetryConfiguration(telemetryConfiguration);
        return this;
    }

    /**
     * The thing name.
     * 
     * @param thingName
     *        The thing name.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * The thing name.
     * 
     * @return The thing name.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * The thing name.
     * 
     * @param thingName
     *        The thing name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRuntimeConfigurationRequest withThingName(String thingName) {
        setThingName(thingName);
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
            sb.append("TelemetryConfiguration: ").append(getTelemetryConfiguration()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingRuntimeConfigurationRequest == false)
            return false;
        UpdateThingRuntimeConfigurationRequest other = (UpdateThingRuntimeConfigurationRequest) obj;
        if (other.getTelemetryConfiguration() == null ^ this.getTelemetryConfiguration() == null)
            return false;
        if (other.getTelemetryConfiguration() != null && other.getTelemetryConfiguration().equals(this.getTelemetryConfiguration()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelemetryConfiguration() == null) ? 0 : getTelemetryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThingRuntimeConfigurationRequest clone() {
        return (UpdateThingRuntimeConfigurationRequest) super.clone();
    }

}
