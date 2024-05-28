/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type with the configuration information that determines the threshold and other conditions for when
 * Internet Monitor creates a health event for a local performance or availability issue, when scores cross a threshold
 * for one or more city-networks.
 * </p>
 * <p>
 * Defines the percentages, for performance scores or availability scores, that are the local thresholds for when Amazon
 * CloudWatch Internet Monitor creates a health event. Also defines whether a local threshold is enabled or disabled,
 * and the minimum percentage of overall traffic that must be impacted by an issue before Internet Monitor creates an
 * event when a threshold is crossed for a local health score.
 * </p>
 * <p>
 * If you don't set a local health event threshold, the default value is 60%.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
 * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/LocalHealthEventsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalHealthEventsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of whether Internet Monitor creates a health event based on a threshold percentage set for a local
     * health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The health event threshold percentage set for a local health score.
     * </p>
     */
    private Double healthScoreThreshold;
    /**
     * <p>
     * The minimum percentage of overall traffic for an application that must be impacted by an issue before Internet
     * Monitor creates an event when a threshold is crossed for a local health score.
     * </p>
     * <p>
     * If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     * </p>
     */
    private Double minTrafficImpact;

    /**
     * <p>
     * The status of whether Internet Monitor creates a health event based on a threshold percentage set for a local
     * health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of whether Internet Monitor creates a health event based on a threshold percentage set for a
     *        local health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * @see LocalHealthEventsConfigStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of whether Internet Monitor creates a health event based on a threshold percentage set for a local
     * health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @return The status of whether Internet Monitor creates a health event based on a threshold percentage set for a
     *         local health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * @see LocalHealthEventsConfigStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of whether Internet Monitor creates a health event based on a threshold percentage set for a local
     * health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of whether Internet Monitor creates a health event based on a threshold percentage set for a
     *        local health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalHealthEventsConfigStatus
     */

    public LocalHealthEventsConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of whether Internet Monitor creates a health event based on a threshold percentage set for a local
     * health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of whether Internet Monitor creates a health event based on a threshold percentage set for a
     *        local health score. The status can be <code>ENABLED</code> or <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalHealthEventsConfigStatus
     */

    public LocalHealthEventsConfig withStatus(LocalHealthEventsConfigStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The health event threshold percentage set for a local health score.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The health event threshold percentage set for a local health score.
     */

    public void setHealthScoreThreshold(Double healthScoreThreshold) {
        this.healthScoreThreshold = healthScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for a local health score.
     * </p>
     * 
     * @return The health event threshold percentage set for a local health score.
     */

    public Double getHealthScoreThreshold() {
        return this.healthScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for a local health score.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The health event threshold percentage set for a local health score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalHealthEventsConfig withHealthScoreThreshold(Double healthScoreThreshold) {
        setHealthScoreThreshold(healthScoreThreshold);
        return this;
    }

    /**
     * <p>
     * The minimum percentage of overall traffic for an application that must be impacted by an issue before Internet
     * Monitor creates an event when a threshold is crossed for a local health score.
     * </p>
     * <p>
     * If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     * </p>
     * 
     * @param minTrafficImpact
     *        The minimum percentage of overall traffic for an application that must be impacted by an issue before
     *        Internet Monitor creates an event when a threshold is crossed for a local health score.</p>
     *        <p>
     *        If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     */

    public void setMinTrafficImpact(Double minTrafficImpact) {
        this.minTrafficImpact = minTrafficImpact;
    }

    /**
     * <p>
     * The minimum percentage of overall traffic for an application that must be impacted by an issue before Internet
     * Monitor creates an event when a threshold is crossed for a local health score.
     * </p>
     * <p>
     * If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     * </p>
     * 
     * @return The minimum percentage of overall traffic for an application that must be impacted by an issue before
     *         Internet Monitor creates an event when a threshold is crossed for a local health score.</p>
     *         <p>
     *         If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     */

    public Double getMinTrafficImpact() {
        return this.minTrafficImpact;
    }

    /**
     * <p>
     * The minimum percentage of overall traffic for an application that must be impacted by an issue before Internet
     * Monitor creates an event when a threshold is crossed for a local health score.
     * </p>
     * <p>
     * If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     * </p>
     * 
     * @param minTrafficImpact
     *        The minimum percentage of overall traffic for an application that must be impacted by an issue before
     *        Internet Monitor creates an event when a threshold is crossed for a local health score.</p>
     *        <p>
     *        If you don't set a minimum traffic impact threshold, the default value is 0.1%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalHealthEventsConfig withMinTrafficImpact(Double minTrafficImpact) {
        setMinTrafficImpact(minTrafficImpact);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getHealthScoreThreshold() != null)
            sb.append("HealthScoreThreshold: ").append(getHealthScoreThreshold()).append(",");
        if (getMinTrafficImpact() != null)
            sb.append("MinTrafficImpact: ").append(getMinTrafficImpact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalHealthEventsConfig == false)
            return false;
        LocalHealthEventsConfig other = (LocalHealthEventsConfig) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getHealthScoreThreshold() == null ^ this.getHealthScoreThreshold() == null)
            return false;
        if (other.getHealthScoreThreshold() != null && other.getHealthScoreThreshold().equals(this.getHealthScoreThreshold()) == false)
            return false;
        if (other.getMinTrafficImpact() == null ^ this.getMinTrafficImpact() == null)
            return false;
        if (other.getMinTrafficImpact() != null && other.getMinTrafficImpact().equals(this.getMinTrafficImpact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getHealthScoreThreshold() == null) ? 0 : getHealthScoreThreshold().hashCode());
        hashCode = prime * hashCode + ((getMinTrafficImpact() == null) ? 0 : getMinTrafficImpact().hashCode());
        return hashCode;
    }

    @Override
    public LocalHealthEventsConfig clone() {
        try {
            return (LocalHealthEventsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.LocalHealthEventsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
