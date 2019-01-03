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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Device Defender security profile behavior violation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViolationEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     */
    private String violationId;
    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The behavior which was violated.
     * </p>
     */
    private Behavior behavior;
    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     */
    private MetricValue metricValue;
    /**
     * <p>
     * The type of violation event.
     * </p>
     */
    private String violationEventType;
    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     */
    private java.util.Date violationEventTime;

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * 
     * @param violationId
     *        The ID of the violation event.
     */

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * 
     * @return The ID of the violation event.
     */

    public String getViolationId() {
        return this.violationId;
    }

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * 
     * @param violationId
     *        The ID of the violation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withViolationId(String violationId) {
        setViolationId(violationId);
        return this;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * 
     * @param thingName
     *        The name of the thing responsible for the violation event.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * 
     * @return The name of the thing responsible for the violation event.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * 
     * @param thingName
     *        The name of the thing responsible for the violation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile whose behavior was violated.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * 
     * @return The name of the security profile whose behavior was violated.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile whose behavior was violated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     * 
     * @param behavior
     *        The behavior which was violated.
     */

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     * 
     * @return The behavior which was violated.
     */

    public Behavior getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     * 
     * @param behavior
     *        The behavior which was violated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withBehavior(Behavior behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     * 
     * @param metricValue
     *        The value of the metric (the measurement).
     */

    public void setMetricValue(MetricValue metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     * 
     * @return The value of the metric (the measurement).
     */

    public MetricValue getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     * 
     * @param metricValue
     *        The value of the metric (the measurement).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withMetricValue(MetricValue metricValue) {
        setMetricValue(metricValue);
        return this;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * 
     * @param violationEventType
     *        The type of violation event.
     * @see ViolationEventType
     */

    public void setViolationEventType(String violationEventType) {
        this.violationEventType = violationEventType;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * 
     * @return The type of violation event.
     * @see ViolationEventType
     */

    public String getViolationEventType() {
        return this.violationEventType;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * 
     * @param violationEventType
     *        The type of violation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViolationEventType
     */

    public ViolationEvent withViolationEventType(String violationEventType) {
        setViolationEventType(violationEventType);
        return this;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * 
     * @param violationEventType
     *        The type of violation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViolationEventType
     */

    public ViolationEvent withViolationEventType(ViolationEventType violationEventType) {
        this.violationEventType = violationEventType.toString();
        return this;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     * 
     * @param violationEventTime
     *        The time the violation event occurred.
     */

    public void setViolationEventTime(java.util.Date violationEventTime) {
        this.violationEventTime = violationEventTime;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     * 
     * @return The time the violation event occurred.
     */

    public java.util.Date getViolationEventTime() {
        return this.violationEventTime;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     * 
     * @param violationEventTime
     *        The time the violation event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEvent withViolationEventTime(java.util.Date violationEventTime) {
        setViolationEventTime(violationEventTime);
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
        if (getViolationId() != null)
            sb.append("ViolationId: ").append(getViolationId()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior()).append(",");
        if (getMetricValue() != null)
            sb.append("MetricValue: ").append(getMetricValue()).append(",");
        if (getViolationEventType() != null)
            sb.append("ViolationEventType: ").append(getViolationEventType()).append(",");
        if (getViolationEventTime() != null)
            sb.append("ViolationEventTime: ").append(getViolationEventTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViolationEvent == false)
            return false;
        ViolationEvent other = (ViolationEvent) obj;
        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getViolationEventType() == null ^ this.getViolationEventType() == null)
            return false;
        if (other.getViolationEventType() != null && other.getViolationEventType().equals(this.getViolationEventType()) == false)
            return false;
        if (other.getViolationEventTime() == null ^ this.getViolationEventTime() == null)
            return false;
        if (other.getViolationEventTime() != null && other.getViolationEventTime().equals(this.getViolationEventTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode + ((getViolationEventType() == null) ? 0 : getViolationEventType().hashCode());
        hashCode = prime * hashCode + ((getViolationEventTime() == null) ? 0 : getViolationEventTime().hashCode());
        return hashCode;
    }

    @Override
    public ViolationEvent clone() {
        try {
            return (ViolationEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ViolationEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
