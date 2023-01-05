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

/**
 * <p>
 * The inventory data for installed Migration Evaluator collectors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerMeCollectorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of active Migration Evaluator collectors.
     * </p>
     */
    private Integer activeMeCollectors;
    /**
     * <p>
     * The number of healthy Migration Evaluator collectors.
     * </p>
     */
    private Integer healthyMeCollectors;
    /**
     * <p>
     * The number of deny-listed Migration Evaluator collectors.
     * </p>
     */
    private Integer denyListedMeCollectors;
    /**
     * <p>
     * The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     * </p>
     */
    private Integer shutdownMeCollectors;
    /**
     * <p>
     * The number of unhealthy Migration Evaluator collectors.
     * </p>
     */
    private Integer unhealthyMeCollectors;
    /**
     * <p>
     * The total number of Migration Evaluator collectors.
     * </p>
     */
    private Integer totalMeCollectors;
    /**
     * <p>
     * The number of unknown Migration Evaluator collectors.
     * </p>
     */
    private Integer unknownMeCollectors;

    /**
     * <p>
     * The number of active Migration Evaluator collectors.
     * </p>
     * 
     * @param activeMeCollectors
     *        The number of active Migration Evaluator collectors.
     */

    public void setActiveMeCollectors(Integer activeMeCollectors) {
        this.activeMeCollectors = activeMeCollectors;
    }

    /**
     * <p>
     * The number of active Migration Evaluator collectors.
     * </p>
     * 
     * @return The number of active Migration Evaluator collectors.
     */

    public Integer getActiveMeCollectors() {
        return this.activeMeCollectors;
    }

    /**
     * <p>
     * The number of active Migration Evaluator collectors.
     * </p>
     * 
     * @param activeMeCollectors
     *        The number of active Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withActiveMeCollectors(Integer activeMeCollectors) {
        setActiveMeCollectors(activeMeCollectors);
        return this;
    }

    /**
     * <p>
     * The number of healthy Migration Evaluator collectors.
     * </p>
     * 
     * @param healthyMeCollectors
     *        The number of healthy Migration Evaluator collectors.
     */

    public void setHealthyMeCollectors(Integer healthyMeCollectors) {
        this.healthyMeCollectors = healthyMeCollectors;
    }

    /**
     * <p>
     * The number of healthy Migration Evaluator collectors.
     * </p>
     * 
     * @return The number of healthy Migration Evaluator collectors.
     */

    public Integer getHealthyMeCollectors() {
        return this.healthyMeCollectors;
    }

    /**
     * <p>
     * The number of healthy Migration Evaluator collectors.
     * </p>
     * 
     * @param healthyMeCollectors
     *        The number of healthy Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withHealthyMeCollectors(Integer healthyMeCollectors) {
        setHealthyMeCollectors(healthyMeCollectors);
        return this;
    }

    /**
     * <p>
     * The number of deny-listed Migration Evaluator collectors.
     * </p>
     * 
     * @param denyListedMeCollectors
     *        The number of deny-listed Migration Evaluator collectors.
     */

    public void setDenyListedMeCollectors(Integer denyListedMeCollectors) {
        this.denyListedMeCollectors = denyListedMeCollectors;
    }

    /**
     * <p>
     * The number of deny-listed Migration Evaluator collectors.
     * </p>
     * 
     * @return The number of deny-listed Migration Evaluator collectors.
     */

    public Integer getDenyListedMeCollectors() {
        return this.denyListedMeCollectors;
    }

    /**
     * <p>
     * The number of deny-listed Migration Evaluator collectors.
     * </p>
     * 
     * @param denyListedMeCollectors
     *        The number of deny-listed Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withDenyListedMeCollectors(Integer denyListedMeCollectors) {
        setDenyListedMeCollectors(denyListedMeCollectors);
        return this;
    }

    /**
     * <p>
     * The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     * </p>
     * 
     * @param shutdownMeCollectors
     *        The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     */

    public void setShutdownMeCollectors(Integer shutdownMeCollectors) {
        this.shutdownMeCollectors = shutdownMeCollectors;
    }

    /**
     * <p>
     * The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     * </p>
     * 
     * @return The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     */

    public Integer getShutdownMeCollectors() {
        return this.shutdownMeCollectors;
    }

    /**
     * <p>
     * The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     * </p>
     * 
     * @param shutdownMeCollectors
     *        The number of Migration Evaluator collectors with <code>SHUTDOWN</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withShutdownMeCollectors(Integer shutdownMeCollectors) {
        setShutdownMeCollectors(shutdownMeCollectors);
        return this;
    }

    /**
     * <p>
     * The number of unhealthy Migration Evaluator collectors.
     * </p>
     * 
     * @param unhealthyMeCollectors
     *        The number of unhealthy Migration Evaluator collectors.
     */

    public void setUnhealthyMeCollectors(Integer unhealthyMeCollectors) {
        this.unhealthyMeCollectors = unhealthyMeCollectors;
    }

    /**
     * <p>
     * The number of unhealthy Migration Evaluator collectors.
     * </p>
     * 
     * @return The number of unhealthy Migration Evaluator collectors.
     */

    public Integer getUnhealthyMeCollectors() {
        return this.unhealthyMeCollectors;
    }

    /**
     * <p>
     * The number of unhealthy Migration Evaluator collectors.
     * </p>
     * 
     * @param unhealthyMeCollectors
     *        The number of unhealthy Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withUnhealthyMeCollectors(Integer unhealthyMeCollectors) {
        setUnhealthyMeCollectors(unhealthyMeCollectors);
        return this;
    }

    /**
     * <p>
     * The total number of Migration Evaluator collectors.
     * </p>
     * 
     * @param totalMeCollectors
     *        The total number of Migration Evaluator collectors.
     */

    public void setTotalMeCollectors(Integer totalMeCollectors) {
        this.totalMeCollectors = totalMeCollectors;
    }

    /**
     * <p>
     * The total number of Migration Evaluator collectors.
     * </p>
     * 
     * @return The total number of Migration Evaluator collectors.
     */

    public Integer getTotalMeCollectors() {
        return this.totalMeCollectors;
    }

    /**
     * <p>
     * The total number of Migration Evaluator collectors.
     * </p>
     * 
     * @param totalMeCollectors
     *        The total number of Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withTotalMeCollectors(Integer totalMeCollectors) {
        setTotalMeCollectors(totalMeCollectors);
        return this;
    }

    /**
     * <p>
     * The number of unknown Migration Evaluator collectors.
     * </p>
     * 
     * @param unknownMeCollectors
     *        The number of unknown Migration Evaluator collectors.
     */

    public void setUnknownMeCollectors(Integer unknownMeCollectors) {
        this.unknownMeCollectors = unknownMeCollectors;
    }

    /**
     * <p>
     * The number of unknown Migration Evaluator collectors.
     * </p>
     * 
     * @return The number of unknown Migration Evaluator collectors.
     */

    public Integer getUnknownMeCollectors() {
        return this.unknownMeCollectors;
    }

    /**
     * <p>
     * The number of unknown Migration Evaluator collectors.
     * </p>
     * 
     * @param unknownMeCollectors
     *        The number of unknown Migration Evaluator collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerMeCollectorInfo withUnknownMeCollectors(Integer unknownMeCollectors) {
        setUnknownMeCollectors(unknownMeCollectors);
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
        if (getActiveMeCollectors() != null)
            sb.append("ActiveMeCollectors: ").append(getActiveMeCollectors()).append(",");
        if (getHealthyMeCollectors() != null)
            sb.append("HealthyMeCollectors: ").append(getHealthyMeCollectors()).append(",");
        if (getDenyListedMeCollectors() != null)
            sb.append("DenyListedMeCollectors: ").append(getDenyListedMeCollectors()).append(",");
        if (getShutdownMeCollectors() != null)
            sb.append("ShutdownMeCollectors: ").append(getShutdownMeCollectors()).append(",");
        if (getUnhealthyMeCollectors() != null)
            sb.append("UnhealthyMeCollectors: ").append(getUnhealthyMeCollectors()).append(",");
        if (getTotalMeCollectors() != null)
            sb.append("TotalMeCollectors: ").append(getTotalMeCollectors()).append(",");
        if (getUnknownMeCollectors() != null)
            sb.append("UnknownMeCollectors: ").append(getUnknownMeCollectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerMeCollectorInfo == false)
            return false;
        CustomerMeCollectorInfo other = (CustomerMeCollectorInfo) obj;
        if (other.getActiveMeCollectors() == null ^ this.getActiveMeCollectors() == null)
            return false;
        if (other.getActiveMeCollectors() != null && other.getActiveMeCollectors().equals(this.getActiveMeCollectors()) == false)
            return false;
        if (other.getHealthyMeCollectors() == null ^ this.getHealthyMeCollectors() == null)
            return false;
        if (other.getHealthyMeCollectors() != null && other.getHealthyMeCollectors().equals(this.getHealthyMeCollectors()) == false)
            return false;
        if (other.getDenyListedMeCollectors() == null ^ this.getDenyListedMeCollectors() == null)
            return false;
        if (other.getDenyListedMeCollectors() != null && other.getDenyListedMeCollectors().equals(this.getDenyListedMeCollectors()) == false)
            return false;
        if (other.getShutdownMeCollectors() == null ^ this.getShutdownMeCollectors() == null)
            return false;
        if (other.getShutdownMeCollectors() != null && other.getShutdownMeCollectors().equals(this.getShutdownMeCollectors()) == false)
            return false;
        if (other.getUnhealthyMeCollectors() == null ^ this.getUnhealthyMeCollectors() == null)
            return false;
        if (other.getUnhealthyMeCollectors() != null && other.getUnhealthyMeCollectors().equals(this.getUnhealthyMeCollectors()) == false)
            return false;
        if (other.getTotalMeCollectors() == null ^ this.getTotalMeCollectors() == null)
            return false;
        if (other.getTotalMeCollectors() != null && other.getTotalMeCollectors().equals(this.getTotalMeCollectors()) == false)
            return false;
        if (other.getUnknownMeCollectors() == null ^ this.getUnknownMeCollectors() == null)
            return false;
        if (other.getUnknownMeCollectors() != null && other.getUnknownMeCollectors().equals(this.getUnknownMeCollectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveMeCollectors() == null) ? 0 : getActiveMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getHealthyMeCollectors() == null) ? 0 : getHealthyMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getDenyListedMeCollectors() == null) ? 0 : getDenyListedMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getShutdownMeCollectors() == null) ? 0 : getShutdownMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyMeCollectors() == null) ? 0 : getUnhealthyMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getTotalMeCollectors() == null) ? 0 : getTotalMeCollectors().hashCode());
        hashCode = prime * hashCode + ((getUnknownMeCollectors() == null) ? 0 : getUnknownMeCollectors().hashCode());
        return hashCode;
    }

    @Override
    public CustomerMeCollectorInfo clone() {
        try {
            return (CustomerMeCollectorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.CustomerMeCollectorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
