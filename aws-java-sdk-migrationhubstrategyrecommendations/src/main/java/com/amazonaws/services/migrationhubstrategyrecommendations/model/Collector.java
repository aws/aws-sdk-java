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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Process data collector that runs in the environment that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/Collector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Collector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the health of a collector.
     * </p>
     */
    private String collectorHealth;
    /**
     * <p>
     * The ID of the collector.
     * </p>
     */
    private String collectorId;
    /**
     * <p>
     * Current version of the collector that is running in the environment that you specify.
     * </p>
     */
    private String collectorVersion;
    /**
     * <p>
     * Summary of the collector configuration.
     * </p>
     */
    private ConfigurationSummary configurationSummary;
    /**
     * <p>
     * Hostname of the server that is hosting the collector.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * IP address of the server that is hosting the collector.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Time when the collector last pinged the service.
     * </p>
     */
    private String lastActivityTimeStamp;
    /**
     * <p>
     * Time when the collector registered with the service.
     * </p>
     */
    private String registeredTimeStamp;

    /**
     * <p>
     * Indicates the health of a collector.
     * </p>
     * 
     * @param collectorHealth
     *        Indicates the health of a collector.
     * @see CollectorHealth
     */

    public void setCollectorHealth(String collectorHealth) {
        this.collectorHealth = collectorHealth;
    }

    /**
     * <p>
     * Indicates the health of a collector.
     * </p>
     * 
     * @return Indicates the health of a collector.
     * @see CollectorHealth
     */

    public String getCollectorHealth() {
        return this.collectorHealth;
    }

    /**
     * <p>
     * Indicates the health of a collector.
     * </p>
     * 
     * @param collectorHealth
     *        Indicates the health of a collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectorHealth
     */

    public Collector withCollectorHealth(String collectorHealth) {
        setCollectorHealth(collectorHealth);
        return this;
    }

    /**
     * <p>
     * Indicates the health of a collector.
     * </p>
     * 
     * @param collectorHealth
     *        Indicates the health of a collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectorHealth
     */

    public Collector withCollectorHealth(CollectorHealth collectorHealth) {
        this.collectorHealth = collectorHealth.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the collector.
     * </p>
     * 
     * @param collectorId
     *        The ID of the collector.
     */

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId;
    }

    /**
     * <p>
     * The ID of the collector.
     * </p>
     * 
     * @return The ID of the collector.
     */

    public String getCollectorId() {
        return this.collectorId;
    }

    /**
     * <p>
     * The ID of the collector.
     * </p>
     * 
     * @param collectorId
     *        The ID of the collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withCollectorId(String collectorId) {
        setCollectorId(collectorId);
        return this;
    }

    /**
     * <p>
     * Current version of the collector that is running in the environment that you specify.
     * </p>
     * 
     * @param collectorVersion
     *        Current version of the collector that is running in the environment that you specify.
     */

    public void setCollectorVersion(String collectorVersion) {
        this.collectorVersion = collectorVersion;
    }

    /**
     * <p>
     * Current version of the collector that is running in the environment that you specify.
     * </p>
     * 
     * @return Current version of the collector that is running in the environment that you specify.
     */

    public String getCollectorVersion() {
        return this.collectorVersion;
    }

    /**
     * <p>
     * Current version of the collector that is running in the environment that you specify.
     * </p>
     * 
     * @param collectorVersion
     *        Current version of the collector that is running in the environment that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withCollectorVersion(String collectorVersion) {
        setCollectorVersion(collectorVersion);
        return this;
    }

    /**
     * <p>
     * Summary of the collector configuration.
     * </p>
     * 
     * @param configurationSummary
     *        Summary of the collector configuration.
     */

    public void setConfigurationSummary(ConfigurationSummary configurationSummary) {
        this.configurationSummary = configurationSummary;
    }

    /**
     * <p>
     * Summary of the collector configuration.
     * </p>
     * 
     * @return Summary of the collector configuration.
     */

    public ConfigurationSummary getConfigurationSummary() {
        return this.configurationSummary;
    }

    /**
     * <p>
     * Summary of the collector configuration.
     * </p>
     * 
     * @param configurationSummary
     *        Summary of the collector configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withConfigurationSummary(ConfigurationSummary configurationSummary) {
        setConfigurationSummary(configurationSummary);
        return this;
    }

    /**
     * <p>
     * Hostname of the server that is hosting the collector.
     * </p>
     * 
     * @param hostName
     *        Hostname of the server that is hosting the collector.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * Hostname of the server that is hosting the collector.
     * </p>
     * 
     * @return Hostname of the server that is hosting the collector.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * Hostname of the server that is hosting the collector.
     * </p>
     * 
     * @param hostName
     *        Hostname of the server that is hosting the collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * IP address of the server that is hosting the collector.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the server that is hosting the collector.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the server that is hosting the collector.
     * </p>
     * 
     * @return IP address of the server that is hosting the collector.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the server that is hosting the collector.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the server that is hosting the collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Time when the collector last pinged the service.
     * </p>
     * 
     * @param lastActivityTimeStamp
     *        Time when the collector last pinged the service.
     */

    public void setLastActivityTimeStamp(String lastActivityTimeStamp) {
        this.lastActivityTimeStamp = lastActivityTimeStamp;
    }

    /**
     * <p>
     * Time when the collector last pinged the service.
     * </p>
     * 
     * @return Time when the collector last pinged the service.
     */

    public String getLastActivityTimeStamp() {
        return this.lastActivityTimeStamp;
    }

    /**
     * <p>
     * Time when the collector last pinged the service.
     * </p>
     * 
     * @param lastActivityTimeStamp
     *        Time when the collector last pinged the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withLastActivityTimeStamp(String lastActivityTimeStamp) {
        setLastActivityTimeStamp(lastActivityTimeStamp);
        return this;
    }

    /**
     * <p>
     * Time when the collector registered with the service.
     * </p>
     * 
     * @param registeredTimeStamp
     *        Time when the collector registered with the service.
     */

    public void setRegisteredTimeStamp(String registeredTimeStamp) {
        this.registeredTimeStamp = registeredTimeStamp;
    }

    /**
     * <p>
     * Time when the collector registered with the service.
     * </p>
     * 
     * @return Time when the collector registered with the service.
     */

    public String getRegisteredTimeStamp() {
        return this.registeredTimeStamp;
    }

    /**
     * <p>
     * Time when the collector registered with the service.
     * </p>
     * 
     * @param registeredTimeStamp
     *        Time when the collector registered with the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Collector withRegisteredTimeStamp(String registeredTimeStamp) {
        setRegisteredTimeStamp(registeredTimeStamp);
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
        if (getCollectorHealth() != null)
            sb.append("CollectorHealth: ").append(getCollectorHealth()).append(",");
        if (getCollectorId() != null)
            sb.append("CollectorId: ").append(getCollectorId()).append(",");
        if (getCollectorVersion() != null)
            sb.append("CollectorVersion: ").append(getCollectorVersion()).append(",");
        if (getConfigurationSummary() != null)
            sb.append("ConfigurationSummary: ").append(getConfigurationSummary()).append(",");
        if (getHostName() != null)
            sb.append("HostName: ").append(getHostName()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getLastActivityTimeStamp() != null)
            sb.append("LastActivityTimeStamp: ").append(getLastActivityTimeStamp()).append(",");
        if (getRegisteredTimeStamp() != null)
            sb.append("RegisteredTimeStamp: ").append(getRegisteredTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Collector == false)
            return false;
        Collector other = (Collector) obj;
        if (other.getCollectorHealth() == null ^ this.getCollectorHealth() == null)
            return false;
        if (other.getCollectorHealth() != null && other.getCollectorHealth().equals(this.getCollectorHealth()) == false)
            return false;
        if (other.getCollectorId() == null ^ this.getCollectorId() == null)
            return false;
        if (other.getCollectorId() != null && other.getCollectorId().equals(this.getCollectorId()) == false)
            return false;
        if (other.getCollectorVersion() == null ^ this.getCollectorVersion() == null)
            return false;
        if (other.getCollectorVersion() != null && other.getCollectorVersion().equals(this.getCollectorVersion()) == false)
            return false;
        if (other.getConfigurationSummary() == null ^ this.getConfigurationSummary() == null)
            return false;
        if (other.getConfigurationSummary() != null && other.getConfigurationSummary().equals(this.getConfigurationSummary()) == false)
            return false;
        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getLastActivityTimeStamp() == null ^ this.getLastActivityTimeStamp() == null)
            return false;
        if (other.getLastActivityTimeStamp() != null && other.getLastActivityTimeStamp().equals(this.getLastActivityTimeStamp()) == false)
            return false;
        if (other.getRegisteredTimeStamp() == null ^ this.getRegisteredTimeStamp() == null)
            return false;
        if (other.getRegisteredTimeStamp() != null && other.getRegisteredTimeStamp().equals(this.getRegisteredTimeStamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectorHealth() == null) ? 0 : getCollectorHealth().hashCode());
        hashCode = prime * hashCode + ((getCollectorId() == null) ? 0 : getCollectorId().hashCode());
        hashCode = prime * hashCode + ((getCollectorVersion() == null) ? 0 : getCollectorVersion().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSummary() == null) ? 0 : getConfigurationSummary().hashCode());
        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getLastActivityTimeStamp() == null) ? 0 : getLastActivityTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getRegisteredTimeStamp() == null) ? 0 : getRegisteredTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public Collector clone() {
        try {
            return (Collector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.CollectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
