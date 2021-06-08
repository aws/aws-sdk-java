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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines how AWS Network Firewall performs logging for a <a>Firewall</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/LoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule
     * groups.
     * </p>
     */
    private java.util.List<LogDestinationConfig> logDestinationConfigs;

    /**
     * <p>
     * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule
     * groups.
     * </p>
     * 
     * @return Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for
     *         stateful rule groups.
     */

    public java.util.List<LogDestinationConfig> getLogDestinationConfigs() {
        return logDestinationConfigs;
    }

    /**
     * <p>
     * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule
     * groups.
     * </p>
     * 
     * @param logDestinationConfigs
     *        Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful
     *        rule groups.
     */

    public void setLogDestinationConfigs(java.util.Collection<LogDestinationConfig> logDestinationConfigs) {
        if (logDestinationConfigs == null) {
            this.logDestinationConfigs = null;
            return;
        }

        this.logDestinationConfigs = new java.util.ArrayList<LogDestinationConfig>(logDestinationConfigs);
    }

    /**
     * <p>
     * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule
     * groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogDestinationConfigs(java.util.Collection)} or
     * {@link #withLogDestinationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logDestinationConfigs
     *        Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful
     *        rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLogDestinationConfigs(LogDestinationConfig... logDestinationConfigs) {
        if (this.logDestinationConfigs == null) {
            setLogDestinationConfigs(new java.util.ArrayList<LogDestinationConfig>(logDestinationConfigs.length));
        }
        for (LogDestinationConfig ele : logDestinationConfigs) {
            this.logDestinationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule
     * groups.
     * </p>
     * 
     * @param logDestinationConfigs
     *        Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful
     *        rule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLogDestinationConfigs(java.util.Collection<LogDestinationConfig> logDestinationConfigs) {
        setLogDestinationConfigs(logDestinationConfigs);
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
        if (getLogDestinationConfigs() != null)
            sb.append("LogDestinationConfigs: ").append(getLogDestinationConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;
        if (other.getLogDestinationConfigs() == null ^ this.getLogDestinationConfigs() == null)
            return false;
        if (other.getLogDestinationConfigs() != null && other.getLogDestinationConfigs().equals(this.getLogDestinationConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDestinationConfigs() == null) ? 0 : getLogDestinationConfigs().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfiguration clone() {
        try {
            return (LoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
