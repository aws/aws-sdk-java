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
 * Information about an active Device Defender security profile behavior violation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     */
    private String violationId;
    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     */
    private Behavior behavior;
    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent violation.
     * </p>
     */
    private MetricValue lastViolationValue;
    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     */
    private java.util.Date lastViolationTime;
    /**
     * <p>
     * The time the violation started.
     * </p>
     */
    private java.util.Date violationStartTime;

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * 
     * @param violationId
     *        The ID of the active violation.
     */

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * 
     * @return The ID of the active violation.
     */

    public String getViolationId() {
        return this.violationId;
    }

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * 
     * @param violationId
     *        The ID of the active violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withViolationId(String violationId) {
        setViolationId(violationId);
        return this;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * 
     * @param thingName
     *        The name of the thing responsible for the active violation.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * 
     * @return The name of the thing responsible for the active violation.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * 
     * @param thingName
     *        The name of the thing responsible for the active violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * 
     * @param securityProfileName
     *        The security profile whose behavior is in violation.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * 
     * @return The security profile whose behavior is in violation.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * 
     * @param securityProfileName
     *        The security profile whose behavior is in violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     * 
     * @param behavior
     *        The behavior which is being violated.
     */

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     * 
     * @return The behavior which is being violated.
     */

    public Behavior getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     * 
     * @param behavior
     *        The behavior which is being violated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withBehavior(Behavior behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent violation.
     * </p>
     * 
     * @param lastViolationValue
     *        The value of the metric (the measurement) which caused the most recent violation.
     */

    public void setLastViolationValue(MetricValue lastViolationValue) {
        this.lastViolationValue = lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent violation.
     * </p>
     * 
     * @return The value of the metric (the measurement) which caused the most recent violation.
     */

    public MetricValue getLastViolationValue() {
        return this.lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent violation.
     * </p>
     * 
     * @param lastViolationValue
     *        The value of the metric (the measurement) which caused the most recent violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withLastViolationValue(MetricValue lastViolationValue) {
        setLastViolationValue(lastViolationValue);
        return this;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     * 
     * @param lastViolationTime
     *        The time the most recent violation occurred.
     */

    public void setLastViolationTime(java.util.Date lastViolationTime) {
        this.lastViolationTime = lastViolationTime;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     * 
     * @return The time the most recent violation occurred.
     */

    public java.util.Date getLastViolationTime() {
        return this.lastViolationTime;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     * 
     * @param lastViolationTime
     *        The time the most recent violation occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withLastViolationTime(java.util.Date lastViolationTime) {
        setLastViolationTime(lastViolationTime);
        return this;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     * 
     * @param violationStartTime
     *        The time the violation started.
     */

    public void setViolationStartTime(java.util.Date violationStartTime) {
        this.violationStartTime = violationStartTime;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     * 
     * @return The time the violation started.
     */

    public java.util.Date getViolationStartTime() {
        return this.violationStartTime;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     * 
     * @param violationStartTime
     *        The time the violation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveViolation withViolationStartTime(java.util.Date violationStartTime) {
        setViolationStartTime(violationStartTime);
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
        if (getLastViolationValue() != null)
            sb.append("LastViolationValue: ").append(getLastViolationValue()).append(",");
        if (getLastViolationTime() != null)
            sb.append("LastViolationTime: ").append(getLastViolationTime()).append(",");
        if (getViolationStartTime() != null)
            sb.append("ViolationStartTime: ").append(getViolationStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveViolation == false)
            return false;
        ActiveViolation other = (ActiveViolation) obj;
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
        if (other.getLastViolationValue() == null ^ this.getLastViolationValue() == null)
            return false;
        if (other.getLastViolationValue() != null && other.getLastViolationValue().equals(this.getLastViolationValue()) == false)
            return false;
        if (other.getLastViolationTime() == null ^ this.getLastViolationTime() == null)
            return false;
        if (other.getLastViolationTime() != null && other.getLastViolationTime().equals(this.getLastViolationTime()) == false)
            return false;
        if (other.getViolationStartTime() == null ^ this.getViolationStartTime() == null)
            return false;
        if (other.getViolationStartTime() != null && other.getViolationStartTime().equals(this.getViolationStartTime()) == false)
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
        hashCode = prime * hashCode + ((getLastViolationValue() == null) ? 0 : getLastViolationValue().hashCode());
        hashCode = prime * hashCode + ((getLastViolationTime() == null) ? 0 : getLastViolationTime().hashCode());
        hashCode = prime * hashCode + ((getViolationStartTime() == null) ? 0 : getViolationStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ActiveViolation clone() {
        try {
            return (ActiveViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ActiveViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
