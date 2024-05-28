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
 * Internet Monitor creates a health event for an overall performance or availability issue, across an application's
 * geographies.
 * </p>
 * <p>
 * Defines the percentages, for overall performance scores and availability scores for an application, that are the
 * thresholds for when Amazon CloudWatch Internet Monitor creates a health event. You can override the defaults to set a
 * custom threshold for overall performance or availability scores, or both.
 * </p>
 * <p>
 * You can also set thresholds for local health scores,, where Internet Monitor creates a health event when scores cross
 * a threshold for one or more city-networks, in addition to creating an event when an overall score crosses a
 * threshold.
 * </p>
 * <p>
 * If you don't set a health event threshold, the default value is 95%.
 * </p>
 * <p>
 * For local thresholds, you also set a minimum percentage of overall traffic that is impacted by an issue before
 * Internet Monitor creates an event. In addition, you can disable local thresholds, for performance scores,
 * availability scores, or both.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview"
 * > Change health event thresholds</a> in the Internet Monitor section of the <i>CloudWatch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/HealthEventsConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthEventsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     */
    private Double availabilityScoreThreshold;
    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     */
    private Double performanceScoreThreshold;
    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local availability issue.
     * </p>
     */
    private LocalHealthEventsConfig availabilityLocalHealthEventsConfig;
    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local performance issue.
     * </p>
     */
    private LocalHealthEventsConfig performanceLocalHealthEventsConfig;

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @param availabilityScoreThreshold
     *        The health event threshold percentage set for availability scores.
     */

    public void setAvailabilityScoreThreshold(Double availabilityScoreThreshold) {
        this.availabilityScoreThreshold = availabilityScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @return The health event threshold percentage set for availability scores.
     */

    public Double getAvailabilityScoreThreshold() {
        return this.availabilityScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @param availabilityScoreThreshold
     *        The health event threshold percentage set for availability scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withAvailabilityScoreThreshold(Double availabilityScoreThreshold) {
        setAvailabilityScoreThreshold(availabilityScoreThreshold);
        return this;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @param performanceScoreThreshold
     *        The health event threshold percentage set for performance scores.
     */

    public void setPerformanceScoreThreshold(Double performanceScoreThreshold) {
        this.performanceScoreThreshold = performanceScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @return The health event threshold percentage set for performance scores.
     */

    public Double getPerformanceScoreThreshold() {
        return this.performanceScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @param performanceScoreThreshold
     *        The health event threshold percentage set for performance scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withPerformanceScoreThreshold(Double performanceScoreThreshold) {
        setPerformanceScoreThreshold(performanceScoreThreshold);
        return this;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local availability issue.
     * </p>
     * 
     * @param availabilityLocalHealthEventsConfig
     *        The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *        health event for a local availability issue.
     */

    public void setAvailabilityLocalHealthEventsConfig(LocalHealthEventsConfig availabilityLocalHealthEventsConfig) {
        this.availabilityLocalHealthEventsConfig = availabilityLocalHealthEventsConfig;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local availability issue.
     * </p>
     * 
     * @return The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *         health event for a local availability issue.
     */

    public LocalHealthEventsConfig getAvailabilityLocalHealthEventsConfig() {
        return this.availabilityLocalHealthEventsConfig;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local availability issue.
     * </p>
     * 
     * @param availabilityLocalHealthEventsConfig
     *        The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *        health event for a local availability issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withAvailabilityLocalHealthEventsConfig(LocalHealthEventsConfig availabilityLocalHealthEventsConfig) {
        setAvailabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig);
        return this;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local performance issue.
     * </p>
     * 
     * @param performanceLocalHealthEventsConfig
     *        The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *        health event for a local performance issue.
     */

    public void setPerformanceLocalHealthEventsConfig(LocalHealthEventsConfig performanceLocalHealthEventsConfig) {
        this.performanceLocalHealthEventsConfig = performanceLocalHealthEventsConfig;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local performance issue.
     * </p>
     * 
     * @return The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *         health event for a local performance issue.
     */

    public LocalHealthEventsConfig getPerformanceLocalHealthEventsConfig() {
        return this.performanceLocalHealthEventsConfig;
    }

    /**
     * <p>
     * The configuration that determines the threshold and other conditions for when Internet Monitor creates a health
     * event for a local performance issue.
     * </p>
     * 
     * @param performanceLocalHealthEventsConfig
     *        The configuration that determines the threshold and other conditions for when Internet Monitor creates a
     *        health event for a local performance issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withPerformanceLocalHealthEventsConfig(LocalHealthEventsConfig performanceLocalHealthEventsConfig) {
        setPerformanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig);
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
        if (getAvailabilityScoreThreshold() != null)
            sb.append("AvailabilityScoreThreshold: ").append(getAvailabilityScoreThreshold()).append(",");
        if (getPerformanceScoreThreshold() != null)
            sb.append("PerformanceScoreThreshold: ").append(getPerformanceScoreThreshold()).append(",");
        if (getAvailabilityLocalHealthEventsConfig() != null)
            sb.append("AvailabilityLocalHealthEventsConfig: ").append(getAvailabilityLocalHealthEventsConfig()).append(",");
        if (getPerformanceLocalHealthEventsConfig() != null)
            sb.append("PerformanceLocalHealthEventsConfig: ").append(getPerformanceLocalHealthEventsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthEventsConfig == false)
            return false;
        HealthEventsConfig other = (HealthEventsConfig) obj;
        if (other.getAvailabilityScoreThreshold() == null ^ this.getAvailabilityScoreThreshold() == null)
            return false;
        if (other.getAvailabilityScoreThreshold() != null && other.getAvailabilityScoreThreshold().equals(this.getAvailabilityScoreThreshold()) == false)
            return false;
        if (other.getPerformanceScoreThreshold() == null ^ this.getPerformanceScoreThreshold() == null)
            return false;
        if (other.getPerformanceScoreThreshold() != null && other.getPerformanceScoreThreshold().equals(this.getPerformanceScoreThreshold()) == false)
            return false;
        if (other.getAvailabilityLocalHealthEventsConfig() == null ^ this.getAvailabilityLocalHealthEventsConfig() == null)
            return false;
        if (other.getAvailabilityLocalHealthEventsConfig() != null
                && other.getAvailabilityLocalHealthEventsConfig().equals(this.getAvailabilityLocalHealthEventsConfig()) == false)
            return false;
        if (other.getPerformanceLocalHealthEventsConfig() == null ^ this.getPerformanceLocalHealthEventsConfig() == null)
            return false;
        if (other.getPerformanceLocalHealthEventsConfig() != null
                && other.getPerformanceLocalHealthEventsConfig().equals(this.getPerformanceLocalHealthEventsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityScoreThreshold() == null) ? 0 : getAvailabilityScoreThreshold().hashCode());
        hashCode = prime * hashCode + ((getPerformanceScoreThreshold() == null) ? 0 : getPerformanceScoreThreshold().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityLocalHealthEventsConfig() == null) ? 0 : getAvailabilityLocalHealthEventsConfig().hashCode());
        hashCode = prime * hashCode + ((getPerformanceLocalHealthEventsConfig() == null) ? 0 : getPerformanceLocalHealthEventsConfig().hashCode());
        return hashCode;
    }

    @Override
    public HealthEventsConfig clone() {
        try {
            return (HealthEventsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.HealthEventsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
