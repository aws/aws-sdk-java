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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerAgentlessCollectorInfo implements Serializable, Cloneable, StructuredPojo {

    private Integer activeAgentlessCollectors;

    private Integer healthyAgentlessCollectors;

    private Integer denyListedAgentlessCollectors;

    private Integer shutdownAgentlessCollectors;

    private Integer unhealthyAgentlessCollectors;

    private Integer totalAgentlessCollectors;

    private Integer unknownAgentlessCollectors;

    /**
     * @param activeAgentlessCollectors
     */

    public void setActiveAgentlessCollectors(Integer activeAgentlessCollectors) {
        this.activeAgentlessCollectors = activeAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getActiveAgentlessCollectors() {
        return this.activeAgentlessCollectors;
    }

    /**
     * @param activeAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withActiveAgentlessCollectors(Integer activeAgentlessCollectors) {
        setActiveAgentlessCollectors(activeAgentlessCollectors);
        return this;
    }

    /**
     * @param healthyAgentlessCollectors
     */

    public void setHealthyAgentlessCollectors(Integer healthyAgentlessCollectors) {
        this.healthyAgentlessCollectors = healthyAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getHealthyAgentlessCollectors() {
        return this.healthyAgentlessCollectors;
    }

    /**
     * @param healthyAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withHealthyAgentlessCollectors(Integer healthyAgentlessCollectors) {
        setHealthyAgentlessCollectors(healthyAgentlessCollectors);
        return this;
    }

    /**
     * @param denyListedAgentlessCollectors
     */

    public void setDenyListedAgentlessCollectors(Integer denyListedAgentlessCollectors) {
        this.denyListedAgentlessCollectors = denyListedAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getDenyListedAgentlessCollectors() {
        return this.denyListedAgentlessCollectors;
    }

    /**
     * @param denyListedAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withDenyListedAgentlessCollectors(Integer denyListedAgentlessCollectors) {
        setDenyListedAgentlessCollectors(denyListedAgentlessCollectors);
        return this;
    }

    /**
     * @param shutdownAgentlessCollectors
     */

    public void setShutdownAgentlessCollectors(Integer shutdownAgentlessCollectors) {
        this.shutdownAgentlessCollectors = shutdownAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getShutdownAgentlessCollectors() {
        return this.shutdownAgentlessCollectors;
    }

    /**
     * @param shutdownAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withShutdownAgentlessCollectors(Integer shutdownAgentlessCollectors) {
        setShutdownAgentlessCollectors(shutdownAgentlessCollectors);
        return this;
    }

    /**
     * @param unhealthyAgentlessCollectors
     */

    public void setUnhealthyAgentlessCollectors(Integer unhealthyAgentlessCollectors) {
        this.unhealthyAgentlessCollectors = unhealthyAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getUnhealthyAgentlessCollectors() {
        return this.unhealthyAgentlessCollectors;
    }

    /**
     * @param unhealthyAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withUnhealthyAgentlessCollectors(Integer unhealthyAgentlessCollectors) {
        setUnhealthyAgentlessCollectors(unhealthyAgentlessCollectors);
        return this;
    }

    /**
     * @param totalAgentlessCollectors
     */

    public void setTotalAgentlessCollectors(Integer totalAgentlessCollectors) {
        this.totalAgentlessCollectors = totalAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getTotalAgentlessCollectors() {
        return this.totalAgentlessCollectors;
    }

    /**
     * @param totalAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withTotalAgentlessCollectors(Integer totalAgentlessCollectors) {
        setTotalAgentlessCollectors(totalAgentlessCollectors);
        return this;
    }

    /**
     * @param unknownAgentlessCollectors
     */

    public void setUnknownAgentlessCollectors(Integer unknownAgentlessCollectors) {
        this.unknownAgentlessCollectors = unknownAgentlessCollectors;
    }

    /**
     * @return
     */

    public Integer getUnknownAgentlessCollectors() {
        return this.unknownAgentlessCollectors;
    }

    /**
     * @param unknownAgentlessCollectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentlessCollectorInfo withUnknownAgentlessCollectors(Integer unknownAgentlessCollectors) {
        setUnknownAgentlessCollectors(unknownAgentlessCollectors);
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
        if (getActiveAgentlessCollectors() != null)
            sb.append("ActiveAgentlessCollectors: ").append(getActiveAgentlessCollectors()).append(",");
        if (getHealthyAgentlessCollectors() != null)
            sb.append("HealthyAgentlessCollectors: ").append(getHealthyAgentlessCollectors()).append(",");
        if (getDenyListedAgentlessCollectors() != null)
            sb.append("DenyListedAgentlessCollectors: ").append(getDenyListedAgentlessCollectors()).append(",");
        if (getShutdownAgentlessCollectors() != null)
            sb.append("ShutdownAgentlessCollectors: ").append(getShutdownAgentlessCollectors()).append(",");
        if (getUnhealthyAgentlessCollectors() != null)
            sb.append("UnhealthyAgentlessCollectors: ").append(getUnhealthyAgentlessCollectors()).append(",");
        if (getTotalAgentlessCollectors() != null)
            sb.append("TotalAgentlessCollectors: ").append(getTotalAgentlessCollectors()).append(",");
        if (getUnknownAgentlessCollectors() != null)
            sb.append("UnknownAgentlessCollectors: ").append(getUnknownAgentlessCollectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerAgentlessCollectorInfo == false)
            return false;
        CustomerAgentlessCollectorInfo other = (CustomerAgentlessCollectorInfo) obj;
        if (other.getActiveAgentlessCollectors() == null ^ this.getActiveAgentlessCollectors() == null)
            return false;
        if (other.getActiveAgentlessCollectors() != null && other.getActiveAgentlessCollectors().equals(this.getActiveAgentlessCollectors()) == false)
            return false;
        if (other.getHealthyAgentlessCollectors() == null ^ this.getHealthyAgentlessCollectors() == null)
            return false;
        if (other.getHealthyAgentlessCollectors() != null && other.getHealthyAgentlessCollectors().equals(this.getHealthyAgentlessCollectors()) == false)
            return false;
        if (other.getDenyListedAgentlessCollectors() == null ^ this.getDenyListedAgentlessCollectors() == null)
            return false;
        if (other.getDenyListedAgentlessCollectors() != null
                && other.getDenyListedAgentlessCollectors().equals(this.getDenyListedAgentlessCollectors()) == false)
            return false;
        if (other.getShutdownAgentlessCollectors() == null ^ this.getShutdownAgentlessCollectors() == null)
            return false;
        if (other.getShutdownAgentlessCollectors() != null && other.getShutdownAgentlessCollectors().equals(this.getShutdownAgentlessCollectors()) == false)
            return false;
        if (other.getUnhealthyAgentlessCollectors() == null ^ this.getUnhealthyAgentlessCollectors() == null)
            return false;
        if (other.getUnhealthyAgentlessCollectors() != null && other.getUnhealthyAgentlessCollectors().equals(this.getUnhealthyAgentlessCollectors()) == false)
            return false;
        if (other.getTotalAgentlessCollectors() == null ^ this.getTotalAgentlessCollectors() == null)
            return false;
        if (other.getTotalAgentlessCollectors() != null && other.getTotalAgentlessCollectors().equals(this.getTotalAgentlessCollectors()) == false)
            return false;
        if (other.getUnknownAgentlessCollectors() == null ^ this.getUnknownAgentlessCollectors() == null)
            return false;
        if (other.getUnknownAgentlessCollectors() != null && other.getUnknownAgentlessCollectors().equals(this.getUnknownAgentlessCollectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveAgentlessCollectors() == null) ? 0 : getActiveAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getHealthyAgentlessCollectors() == null) ? 0 : getHealthyAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getDenyListedAgentlessCollectors() == null) ? 0 : getDenyListedAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getShutdownAgentlessCollectors() == null) ? 0 : getShutdownAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyAgentlessCollectors() == null) ? 0 : getUnhealthyAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getTotalAgentlessCollectors() == null) ? 0 : getTotalAgentlessCollectors().hashCode());
        hashCode = prime * hashCode + ((getUnknownAgentlessCollectors() == null) ? 0 : getUnknownAgentlessCollectors().hashCode());
        return hashCode;
    }

    @Override
    public CustomerAgentlessCollectorInfo clone() {
        try {
            return (CustomerAgentlessCollectorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.CustomerAgentlessCollectorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
