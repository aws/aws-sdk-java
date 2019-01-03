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
 * Inventory data for installed discovery agents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerAgentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of active discovery agents.
     * </p>
     */
    private Integer activeAgents;
    /**
     * <p>
     * Number of healthy discovery agents
     * </p>
     */
    private Integer healthyAgents;
    /**
     * <p>
     * Number of blacklisted discovery agents.
     * </p>
     */
    private Integer blackListedAgents;
    /**
     * <p>
     * Number of discovery agents with status SHUTDOWN.
     * </p>
     */
    private Integer shutdownAgents;
    /**
     * <p>
     * Number of unhealthy discovery agents.
     * </p>
     */
    private Integer unhealthyAgents;
    /**
     * <p>
     * Total number of discovery agents.
     * </p>
     */
    private Integer totalAgents;
    /**
     * <p>
     * Number of unknown discovery agents.
     * </p>
     */
    private Integer unknownAgents;

    /**
     * <p>
     * Number of active discovery agents.
     * </p>
     * 
     * @param activeAgents
     *        Number of active discovery agents.
     */

    public void setActiveAgents(Integer activeAgents) {
        this.activeAgents = activeAgents;
    }

    /**
     * <p>
     * Number of active discovery agents.
     * </p>
     * 
     * @return Number of active discovery agents.
     */

    public Integer getActiveAgents() {
        return this.activeAgents;
    }

    /**
     * <p>
     * Number of active discovery agents.
     * </p>
     * 
     * @param activeAgents
     *        Number of active discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withActiveAgents(Integer activeAgents) {
        setActiveAgents(activeAgents);
        return this;
    }

    /**
     * <p>
     * Number of healthy discovery agents
     * </p>
     * 
     * @param healthyAgents
     *        Number of healthy discovery agents
     */

    public void setHealthyAgents(Integer healthyAgents) {
        this.healthyAgents = healthyAgents;
    }

    /**
     * <p>
     * Number of healthy discovery agents
     * </p>
     * 
     * @return Number of healthy discovery agents
     */

    public Integer getHealthyAgents() {
        return this.healthyAgents;
    }

    /**
     * <p>
     * Number of healthy discovery agents
     * </p>
     * 
     * @param healthyAgents
     *        Number of healthy discovery agents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withHealthyAgents(Integer healthyAgents) {
        setHealthyAgents(healthyAgents);
        return this;
    }

    /**
     * <p>
     * Number of blacklisted discovery agents.
     * </p>
     * 
     * @param blackListedAgents
     *        Number of blacklisted discovery agents.
     */

    public void setBlackListedAgents(Integer blackListedAgents) {
        this.blackListedAgents = blackListedAgents;
    }

    /**
     * <p>
     * Number of blacklisted discovery agents.
     * </p>
     * 
     * @return Number of blacklisted discovery agents.
     */

    public Integer getBlackListedAgents() {
        return this.blackListedAgents;
    }

    /**
     * <p>
     * Number of blacklisted discovery agents.
     * </p>
     * 
     * @param blackListedAgents
     *        Number of blacklisted discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withBlackListedAgents(Integer blackListedAgents) {
        setBlackListedAgents(blackListedAgents);
        return this;
    }

    /**
     * <p>
     * Number of discovery agents with status SHUTDOWN.
     * </p>
     * 
     * @param shutdownAgents
     *        Number of discovery agents with status SHUTDOWN.
     */

    public void setShutdownAgents(Integer shutdownAgents) {
        this.shutdownAgents = shutdownAgents;
    }

    /**
     * <p>
     * Number of discovery agents with status SHUTDOWN.
     * </p>
     * 
     * @return Number of discovery agents with status SHUTDOWN.
     */

    public Integer getShutdownAgents() {
        return this.shutdownAgents;
    }

    /**
     * <p>
     * Number of discovery agents with status SHUTDOWN.
     * </p>
     * 
     * @param shutdownAgents
     *        Number of discovery agents with status SHUTDOWN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withShutdownAgents(Integer shutdownAgents) {
        setShutdownAgents(shutdownAgents);
        return this;
    }

    /**
     * <p>
     * Number of unhealthy discovery agents.
     * </p>
     * 
     * @param unhealthyAgents
     *        Number of unhealthy discovery agents.
     */

    public void setUnhealthyAgents(Integer unhealthyAgents) {
        this.unhealthyAgents = unhealthyAgents;
    }

    /**
     * <p>
     * Number of unhealthy discovery agents.
     * </p>
     * 
     * @return Number of unhealthy discovery agents.
     */

    public Integer getUnhealthyAgents() {
        return this.unhealthyAgents;
    }

    /**
     * <p>
     * Number of unhealthy discovery agents.
     * </p>
     * 
     * @param unhealthyAgents
     *        Number of unhealthy discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withUnhealthyAgents(Integer unhealthyAgents) {
        setUnhealthyAgents(unhealthyAgents);
        return this;
    }

    /**
     * <p>
     * Total number of discovery agents.
     * </p>
     * 
     * @param totalAgents
     *        Total number of discovery agents.
     */

    public void setTotalAgents(Integer totalAgents) {
        this.totalAgents = totalAgents;
    }

    /**
     * <p>
     * Total number of discovery agents.
     * </p>
     * 
     * @return Total number of discovery agents.
     */

    public Integer getTotalAgents() {
        return this.totalAgents;
    }

    /**
     * <p>
     * Total number of discovery agents.
     * </p>
     * 
     * @param totalAgents
     *        Total number of discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withTotalAgents(Integer totalAgents) {
        setTotalAgents(totalAgents);
        return this;
    }

    /**
     * <p>
     * Number of unknown discovery agents.
     * </p>
     * 
     * @param unknownAgents
     *        Number of unknown discovery agents.
     */

    public void setUnknownAgents(Integer unknownAgents) {
        this.unknownAgents = unknownAgents;
    }

    /**
     * <p>
     * Number of unknown discovery agents.
     * </p>
     * 
     * @return Number of unknown discovery agents.
     */

    public Integer getUnknownAgents() {
        return this.unknownAgents;
    }

    /**
     * <p>
     * Number of unknown discovery agents.
     * </p>
     * 
     * @param unknownAgents
     *        Number of unknown discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerAgentInfo withUnknownAgents(Integer unknownAgents) {
        setUnknownAgents(unknownAgents);
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
        if (getActiveAgents() != null)
            sb.append("ActiveAgents: ").append(getActiveAgents()).append(",");
        if (getHealthyAgents() != null)
            sb.append("HealthyAgents: ").append(getHealthyAgents()).append(",");
        if (getBlackListedAgents() != null)
            sb.append("BlackListedAgents: ").append(getBlackListedAgents()).append(",");
        if (getShutdownAgents() != null)
            sb.append("ShutdownAgents: ").append(getShutdownAgents()).append(",");
        if (getUnhealthyAgents() != null)
            sb.append("UnhealthyAgents: ").append(getUnhealthyAgents()).append(",");
        if (getTotalAgents() != null)
            sb.append("TotalAgents: ").append(getTotalAgents()).append(",");
        if (getUnknownAgents() != null)
            sb.append("UnknownAgents: ").append(getUnknownAgents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerAgentInfo == false)
            return false;
        CustomerAgentInfo other = (CustomerAgentInfo) obj;
        if (other.getActiveAgents() == null ^ this.getActiveAgents() == null)
            return false;
        if (other.getActiveAgents() != null && other.getActiveAgents().equals(this.getActiveAgents()) == false)
            return false;
        if (other.getHealthyAgents() == null ^ this.getHealthyAgents() == null)
            return false;
        if (other.getHealthyAgents() != null && other.getHealthyAgents().equals(this.getHealthyAgents()) == false)
            return false;
        if (other.getBlackListedAgents() == null ^ this.getBlackListedAgents() == null)
            return false;
        if (other.getBlackListedAgents() != null && other.getBlackListedAgents().equals(this.getBlackListedAgents()) == false)
            return false;
        if (other.getShutdownAgents() == null ^ this.getShutdownAgents() == null)
            return false;
        if (other.getShutdownAgents() != null && other.getShutdownAgents().equals(this.getShutdownAgents()) == false)
            return false;
        if (other.getUnhealthyAgents() == null ^ this.getUnhealthyAgents() == null)
            return false;
        if (other.getUnhealthyAgents() != null && other.getUnhealthyAgents().equals(this.getUnhealthyAgents()) == false)
            return false;
        if (other.getTotalAgents() == null ^ this.getTotalAgents() == null)
            return false;
        if (other.getTotalAgents() != null && other.getTotalAgents().equals(this.getTotalAgents()) == false)
            return false;
        if (other.getUnknownAgents() == null ^ this.getUnknownAgents() == null)
            return false;
        if (other.getUnknownAgents() != null && other.getUnknownAgents().equals(this.getUnknownAgents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveAgents() == null) ? 0 : getActiveAgents().hashCode());
        hashCode = prime * hashCode + ((getHealthyAgents() == null) ? 0 : getHealthyAgents().hashCode());
        hashCode = prime * hashCode + ((getBlackListedAgents() == null) ? 0 : getBlackListedAgents().hashCode());
        hashCode = prime * hashCode + ((getShutdownAgents() == null) ? 0 : getShutdownAgents().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyAgents() == null) ? 0 : getUnhealthyAgents().hashCode());
        hashCode = prime * hashCode + ((getTotalAgents() == null) ? 0 : getTotalAgents().hashCode());
        hashCode = prime * hashCode + ((getUnknownAgents() == null) ? 0 : getUnknownAgents().hashCode());
        return hashCode;
    }

    @Override
    public CustomerAgentInfo clone() {
        try {
            return (CustomerAgentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.CustomerAgentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
