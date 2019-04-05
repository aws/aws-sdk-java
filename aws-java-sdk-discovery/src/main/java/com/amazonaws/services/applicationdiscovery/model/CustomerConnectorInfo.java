/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Inventory data for installed discovery connectors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerConnectorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of active discovery connectors.
     * </p>
     */
    private Integer activeConnectors;
    /**
     * <p>
     * Number of healthy discovery connectors.
     * </p>
     */
    private Integer healthyConnectors;
    /**
     * <p>
     * Number of blacklisted discovery connectors.
     * </p>
     */
    private Integer blackListedConnectors;
    /**
     * <p>
     * Number of discovery connectors with status SHUTDOWN,
     * </p>
     */
    private Integer shutdownConnectors;
    /**
     * <p>
     * Number of unhealthy discovery connectors.
     * </p>
     */
    private Integer unhealthyConnectors;
    /**
     * <p>
     * Total number of discovery connectors.
     * </p>
     */
    private Integer totalConnectors;
    /**
     * <p>
     * Number of unknown discovery connectors.
     * </p>
     */
    private Integer unknownConnectors;

    /**
     * <p>
     * Number of active discovery connectors.
     * </p>
     * 
     * @param activeConnectors
     *        Number of active discovery connectors.
     */

    public void setActiveConnectors(Integer activeConnectors) {
        this.activeConnectors = activeConnectors;
    }

    /**
     * <p>
     * Number of active discovery connectors.
     * </p>
     * 
     * @return Number of active discovery connectors.
     */

    public Integer getActiveConnectors() {
        return this.activeConnectors;
    }

    /**
     * <p>
     * Number of active discovery connectors.
     * </p>
     * 
     * @param activeConnectors
     *        Number of active discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withActiveConnectors(Integer activeConnectors) {
        setActiveConnectors(activeConnectors);
        return this;
    }

    /**
     * <p>
     * Number of healthy discovery connectors.
     * </p>
     * 
     * @param healthyConnectors
     *        Number of healthy discovery connectors.
     */

    public void setHealthyConnectors(Integer healthyConnectors) {
        this.healthyConnectors = healthyConnectors;
    }

    /**
     * <p>
     * Number of healthy discovery connectors.
     * </p>
     * 
     * @return Number of healthy discovery connectors.
     */

    public Integer getHealthyConnectors() {
        return this.healthyConnectors;
    }

    /**
     * <p>
     * Number of healthy discovery connectors.
     * </p>
     * 
     * @param healthyConnectors
     *        Number of healthy discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withHealthyConnectors(Integer healthyConnectors) {
        setHealthyConnectors(healthyConnectors);
        return this;
    }

    /**
     * <p>
     * Number of blacklisted discovery connectors.
     * </p>
     * 
     * @param blackListedConnectors
     *        Number of blacklisted discovery connectors.
     */

    public void setBlackListedConnectors(Integer blackListedConnectors) {
        this.blackListedConnectors = blackListedConnectors;
    }

    /**
     * <p>
     * Number of blacklisted discovery connectors.
     * </p>
     * 
     * @return Number of blacklisted discovery connectors.
     */

    public Integer getBlackListedConnectors() {
        return this.blackListedConnectors;
    }

    /**
     * <p>
     * Number of blacklisted discovery connectors.
     * </p>
     * 
     * @param blackListedConnectors
     *        Number of blacklisted discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withBlackListedConnectors(Integer blackListedConnectors) {
        setBlackListedConnectors(blackListedConnectors);
        return this;
    }

    /**
     * <p>
     * Number of discovery connectors with status SHUTDOWN,
     * </p>
     * 
     * @param shutdownConnectors
     *        Number of discovery connectors with status SHUTDOWN,
     */

    public void setShutdownConnectors(Integer shutdownConnectors) {
        this.shutdownConnectors = shutdownConnectors;
    }

    /**
     * <p>
     * Number of discovery connectors with status SHUTDOWN,
     * </p>
     * 
     * @return Number of discovery connectors with status SHUTDOWN,
     */

    public Integer getShutdownConnectors() {
        return this.shutdownConnectors;
    }

    /**
     * <p>
     * Number of discovery connectors with status SHUTDOWN,
     * </p>
     * 
     * @param shutdownConnectors
     *        Number of discovery connectors with status SHUTDOWN,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withShutdownConnectors(Integer shutdownConnectors) {
        setShutdownConnectors(shutdownConnectors);
        return this;
    }

    /**
     * <p>
     * Number of unhealthy discovery connectors.
     * </p>
     * 
     * @param unhealthyConnectors
     *        Number of unhealthy discovery connectors.
     */

    public void setUnhealthyConnectors(Integer unhealthyConnectors) {
        this.unhealthyConnectors = unhealthyConnectors;
    }

    /**
     * <p>
     * Number of unhealthy discovery connectors.
     * </p>
     * 
     * @return Number of unhealthy discovery connectors.
     */

    public Integer getUnhealthyConnectors() {
        return this.unhealthyConnectors;
    }

    /**
     * <p>
     * Number of unhealthy discovery connectors.
     * </p>
     * 
     * @param unhealthyConnectors
     *        Number of unhealthy discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withUnhealthyConnectors(Integer unhealthyConnectors) {
        setUnhealthyConnectors(unhealthyConnectors);
        return this;
    }

    /**
     * <p>
     * Total number of discovery connectors.
     * </p>
     * 
     * @param totalConnectors
     *        Total number of discovery connectors.
     */

    public void setTotalConnectors(Integer totalConnectors) {
        this.totalConnectors = totalConnectors;
    }

    /**
     * <p>
     * Total number of discovery connectors.
     * </p>
     * 
     * @return Total number of discovery connectors.
     */

    public Integer getTotalConnectors() {
        return this.totalConnectors;
    }

    /**
     * <p>
     * Total number of discovery connectors.
     * </p>
     * 
     * @param totalConnectors
     *        Total number of discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withTotalConnectors(Integer totalConnectors) {
        setTotalConnectors(totalConnectors);
        return this;
    }

    /**
     * <p>
     * Number of unknown discovery connectors.
     * </p>
     * 
     * @param unknownConnectors
     *        Number of unknown discovery connectors.
     */

    public void setUnknownConnectors(Integer unknownConnectors) {
        this.unknownConnectors = unknownConnectors;
    }

    /**
     * <p>
     * Number of unknown discovery connectors.
     * </p>
     * 
     * @return Number of unknown discovery connectors.
     */

    public Integer getUnknownConnectors() {
        return this.unknownConnectors;
    }

    /**
     * <p>
     * Number of unknown discovery connectors.
     * </p>
     * 
     * @param unknownConnectors
     *        Number of unknown discovery connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerConnectorInfo withUnknownConnectors(Integer unknownConnectors) {
        setUnknownConnectors(unknownConnectors);
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
        if (getActiveConnectors() != null)
            sb.append("ActiveConnectors: ").append(getActiveConnectors()).append(",");
        if (getHealthyConnectors() != null)
            sb.append("HealthyConnectors: ").append(getHealthyConnectors()).append(",");
        if (getBlackListedConnectors() != null)
            sb.append("BlackListedConnectors: ").append(getBlackListedConnectors()).append(",");
        if (getShutdownConnectors() != null)
            sb.append("ShutdownConnectors: ").append(getShutdownConnectors()).append(",");
        if (getUnhealthyConnectors() != null)
            sb.append("UnhealthyConnectors: ").append(getUnhealthyConnectors()).append(",");
        if (getTotalConnectors() != null)
            sb.append("TotalConnectors: ").append(getTotalConnectors()).append(",");
        if (getUnknownConnectors() != null)
            sb.append("UnknownConnectors: ").append(getUnknownConnectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerConnectorInfo == false)
            return false;
        CustomerConnectorInfo other = (CustomerConnectorInfo) obj;
        if (other.getActiveConnectors() == null ^ this.getActiveConnectors() == null)
            return false;
        if (other.getActiveConnectors() != null && other.getActiveConnectors().equals(this.getActiveConnectors()) == false)
            return false;
        if (other.getHealthyConnectors() == null ^ this.getHealthyConnectors() == null)
            return false;
        if (other.getHealthyConnectors() != null && other.getHealthyConnectors().equals(this.getHealthyConnectors()) == false)
            return false;
        if (other.getBlackListedConnectors() == null ^ this.getBlackListedConnectors() == null)
            return false;
        if (other.getBlackListedConnectors() != null && other.getBlackListedConnectors().equals(this.getBlackListedConnectors()) == false)
            return false;
        if (other.getShutdownConnectors() == null ^ this.getShutdownConnectors() == null)
            return false;
        if (other.getShutdownConnectors() != null && other.getShutdownConnectors().equals(this.getShutdownConnectors()) == false)
            return false;
        if (other.getUnhealthyConnectors() == null ^ this.getUnhealthyConnectors() == null)
            return false;
        if (other.getUnhealthyConnectors() != null && other.getUnhealthyConnectors().equals(this.getUnhealthyConnectors()) == false)
            return false;
        if (other.getTotalConnectors() == null ^ this.getTotalConnectors() == null)
            return false;
        if (other.getTotalConnectors() != null && other.getTotalConnectors().equals(this.getTotalConnectors()) == false)
            return false;
        if (other.getUnknownConnectors() == null ^ this.getUnknownConnectors() == null)
            return false;
        if (other.getUnknownConnectors() != null && other.getUnknownConnectors().equals(this.getUnknownConnectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveConnectors() == null) ? 0 : getActiveConnectors().hashCode());
        hashCode = prime * hashCode + ((getHealthyConnectors() == null) ? 0 : getHealthyConnectors().hashCode());
        hashCode = prime * hashCode + ((getBlackListedConnectors() == null) ? 0 : getBlackListedConnectors().hashCode());
        hashCode = prime * hashCode + ((getShutdownConnectors() == null) ? 0 : getShutdownConnectors().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyConnectors() == null) ? 0 : getUnhealthyConnectors().hashCode());
        hashCode = prime * hashCode + ((getTotalConnectors() == null) ? 0 : getTotalConnectors().hashCode());
        hashCode = prime * hashCode + ((getUnknownConnectors() == null) ? 0 : getUnknownConnectors().hashCode());
        return hashCode;
    }

    @Override
    public CustomerConnectorInfo clone() {
        try {
            return (CustomerConnectorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.CustomerConnectorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
