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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration specification to be used to override existing configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ConfigurationOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configurations for the application running by the job run.
     * </p>
     */
    private java.util.List<Configuration> applicationConfiguration;
    /**
     * <p>
     * The configurations for monitoring.
     * </p>
     */
    private MonitoringConfiguration monitoringConfiguration;

    /**
     * <p>
     * The configurations for the application running by the job run.
     * </p>
     * 
     * @return The configurations for the application running by the job run.
     */

    public java.util.List<Configuration> getApplicationConfiguration() {
        return applicationConfiguration;
    }

    /**
     * <p>
     * The configurations for the application running by the job run.
     * </p>
     * 
     * @param applicationConfiguration
     *        The configurations for the application running by the job run.
     */

    public void setApplicationConfiguration(java.util.Collection<Configuration> applicationConfiguration) {
        if (applicationConfiguration == null) {
            this.applicationConfiguration = null;
            return;
        }

        this.applicationConfiguration = new java.util.ArrayList<Configuration>(applicationConfiguration);
    }

    /**
     * <p>
     * The configurations for the application running by the job run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationConfiguration(java.util.Collection)} or
     * {@link #withApplicationConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationConfiguration
     *        The configurations for the application running by the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOverrides withApplicationConfiguration(Configuration... applicationConfiguration) {
        if (this.applicationConfiguration == null) {
            setApplicationConfiguration(new java.util.ArrayList<Configuration>(applicationConfiguration.length));
        }
        for (Configuration ele : applicationConfiguration) {
            this.applicationConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurations for the application running by the job run.
     * </p>
     * 
     * @param applicationConfiguration
     *        The configurations for the application running by the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOverrides withApplicationConfiguration(java.util.Collection<Configuration> applicationConfiguration) {
        setApplicationConfiguration(applicationConfiguration);
        return this;
    }

    /**
     * <p>
     * The configurations for monitoring.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The configurations for monitoring.
     */

    public void setMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    /**
     * <p>
     * The configurations for monitoring.
     * </p>
     * 
     * @return The configurations for monitoring.
     */

    public MonitoringConfiguration getMonitoringConfiguration() {
        return this.monitoringConfiguration;
    }

    /**
     * <p>
     * The configurations for monitoring.
     * </p>
     * 
     * @param monitoringConfiguration
     *        The configurations for monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationOverrides withMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        setMonitoringConfiguration(monitoringConfiguration);
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
        if (getApplicationConfiguration() != null)
            sb.append("ApplicationConfiguration: ").append(getApplicationConfiguration()).append(",");
        if (getMonitoringConfiguration() != null)
            sb.append("MonitoringConfiguration: ").append(getMonitoringConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationOverrides == false)
            return false;
        ConfigurationOverrides other = (ConfigurationOverrides) obj;
        if (other.getApplicationConfiguration() == null ^ this.getApplicationConfiguration() == null)
            return false;
        if (other.getApplicationConfiguration() != null && other.getApplicationConfiguration().equals(this.getApplicationConfiguration()) == false)
            return false;
        if (other.getMonitoringConfiguration() == null ^ this.getMonitoringConfiguration() == null)
            return false;
        if (other.getMonitoringConfiguration() != null && other.getMonitoringConfiguration().equals(this.getMonitoringConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationConfiguration() == null) ? 0 : getApplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMonitoringConfiguration() == null) ? 0 : getMonitoringConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationOverrides clone() {
        try {
            return (ConfigurationOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.ConfigurationOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
