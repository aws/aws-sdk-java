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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the Migration Hub Orchestrator plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/PluginSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PluginSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the plugin.
     * </p>
     */
    private String pluginId;
    /**
     * <p>
     * The name of the host.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The status of the plugin.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The IP address at which the plugin is located.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The version of the plugin.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The time at which the plugin was registered.
     * </p>
     */
    private String registeredTime;

    /**
     * <p>
     * The ID of the plugin.
     * </p>
     * 
     * @param pluginId
     *        The ID of the plugin.
     */

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * <p>
     * The ID of the plugin.
     * </p>
     * 
     * @return The ID of the plugin.
     */

    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * <p>
     * The ID of the plugin.
     * </p>
     * 
     * @param pluginId
     *        The ID of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginSummary withPluginId(String pluginId) {
        setPluginId(pluginId);
        return this;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param hostname
     *        The name of the host.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @return The name of the host.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param hostname
     *        The name of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginSummary withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param status
     *        The status of the plugin.
     * @see PluginHealth
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @return The status of the plugin.
     * @see PluginHealth
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param status
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginHealth
     */

    public PluginSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param status
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginHealth
     */

    public PluginSummary withStatus(PluginHealth status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The IP address at which the plugin is located.
     * </p>
     * 
     * @param ipAddress
     *        The IP address at which the plugin is located.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address at which the plugin is located.
     * </p>
     * 
     * @return The IP address at which the plugin is located.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address at which the plugin is located.
     * </p>
     * 
     * @param ipAddress
     *        The IP address at which the plugin is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginSummary withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @param version
     *        The version of the plugin.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @return The version of the plugin.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @param version
     *        The version of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time at which the plugin was registered.
     * </p>
     * 
     * @param registeredTime
     *        The time at which the plugin was registered.
     */

    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
    }

    /**
     * <p>
     * The time at which the plugin was registered.
     * </p>
     * 
     * @return The time at which the plugin was registered.
     */

    public String getRegisteredTime() {
        return this.registeredTime;
    }

    /**
     * <p>
     * The time at which the plugin was registered.
     * </p>
     * 
     * @param registeredTime
     *        The time at which the plugin was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginSummary withRegisteredTime(String registeredTime) {
        setRegisteredTime(registeredTime);
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
        if (getPluginId() != null)
            sb.append("PluginId: ").append(getPluginId()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getRegisteredTime() != null)
            sb.append("RegisteredTime: ").append(getRegisteredTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PluginSummary == false)
            return false;
        PluginSummary other = (PluginSummary) obj;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRegisteredTime() == null ^ this.getRegisteredTime() == null)
            return false;
        if (other.getRegisteredTime() != null && other.getRegisteredTime().equals(this.getRegisteredTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRegisteredTime() == null) ? 0 : getRegisteredTime().hashCode());
        return hashCode;
    }

    @Override
    public PluginSummary clone() {
        try {
            return (PluginSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.PluginSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
