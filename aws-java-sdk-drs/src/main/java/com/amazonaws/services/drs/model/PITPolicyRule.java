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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule in the Point in Time (PIT) policy representing when to take snapshots and how long to retain them for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/PITPolicyRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PITPolicyRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether this rule is enabled or not.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * How often, in the chosen units, a snapshot should be taken.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The duration to retain a snapshot for, in the chosen units.
     * </p>
     */
    private Integer retentionDuration;
    /**
     * <p>
     * The ID of the rule.
     * </p>
     */
    private Long ruleID;
    /**
     * <p>
     * The units used to measure the interval and retentionDuration.
     * </p>
     */
    private String units;

    /**
     * <p>
     * Whether this rule is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether this rule is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether this rule is enabled or not.
     * </p>
     * 
     * @return Whether this rule is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether this rule is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether this rule is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PITPolicyRule withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether this rule is enabled or not.
     * </p>
     * 
     * @return Whether this rule is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * How often, in the chosen units, a snapshot should be taken.
     * </p>
     * 
     * @param interval
     *        How often, in the chosen units, a snapshot should be taken.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * How often, in the chosen units, a snapshot should be taken.
     * </p>
     * 
     * @return How often, in the chosen units, a snapshot should be taken.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * How often, in the chosen units, a snapshot should be taken.
     * </p>
     * 
     * @param interval
     *        How often, in the chosen units, a snapshot should be taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PITPolicyRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The duration to retain a snapshot for, in the chosen units.
     * </p>
     * 
     * @param retentionDuration
     *        The duration to retain a snapshot for, in the chosen units.
     */

    public void setRetentionDuration(Integer retentionDuration) {
        this.retentionDuration = retentionDuration;
    }

    /**
     * <p>
     * The duration to retain a snapshot for, in the chosen units.
     * </p>
     * 
     * @return The duration to retain a snapshot for, in the chosen units.
     */

    public Integer getRetentionDuration() {
        return this.retentionDuration;
    }

    /**
     * <p>
     * The duration to retain a snapshot for, in the chosen units.
     * </p>
     * 
     * @param retentionDuration
     *        The duration to retain a snapshot for, in the chosen units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PITPolicyRule withRetentionDuration(Integer retentionDuration) {
        setRetentionDuration(retentionDuration);
        return this;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param ruleID
     *        The ID of the rule.
     */

    public void setRuleID(Long ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @return The ID of the rule.
     */

    public Long getRuleID() {
        return this.ruleID;
    }

    /**
     * <p>
     * The ID of the rule.
     * </p>
     * 
     * @param ruleID
     *        The ID of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PITPolicyRule withRuleID(Long ruleID) {
        setRuleID(ruleID);
        return this;
    }

    /**
     * <p>
     * The units used to measure the interval and retentionDuration.
     * </p>
     * 
     * @param units
     *        The units used to measure the interval and retentionDuration.
     * @see PITPolicyRuleUnits
     */

    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * <p>
     * The units used to measure the interval and retentionDuration.
     * </p>
     * 
     * @return The units used to measure the interval and retentionDuration.
     * @see PITPolicyRuleUnits
     */

    public String getUnits() {
        return this.units;
    }

    /**
     * <p>
     * The units used to measure the interval and retentionDuration.
     * </p>
     * 
     * @param units
     *        The units used to measure the interval and retentionDuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PITPolicyRuleUnits
     */

    public PITPolicyRule withUnits(String units) {
        setUnits(units);
        return this;
    }

    /**
     * <p>
     * The units used to measure the interval and retentionDuration.
     * </p>
     * 
     * @param units
     *        The units used to measure the interval and retentionDuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PITPolicyRuleUnits
     */

    public PITPolicyRule withUnits(PITPolicyRuleUnits units) {
        this.units = units.toString();
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getRetentionDuration() != null)
            sb.append("RetentionDuration: ").append(getRetentionDuration()).append(",");
        if (getRuleID() != null)
            sb.append("RuleID: ").append(getRuleID()).append(",");
        if (getUnits() != null)
            sb.append("Units: ").append(getUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PITPolicyRule == false)
            return false;
        PITPolicyRule other = (PITPolicyRule) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getRetentionDuration() == null ^ this.getRetentionDuration() == null)
            return false;
        if (other.getRetentionDuration() != null && other.getRetentionDuration().equals(this.getRetentionDuration()) == false)
            return false;
        if (other.getRuleID() == null ^ this.getRuleID() == null)
            return false;
        if (other.getRuleID() != null && other.getRuleID().equals(this.getRuleID()) == false)
            return false;
        if (other.getUnits() == null ^ this.getUnits() == null)
            return false;
        if (other.getUnits() != null && other.getUnits().equals(this.getUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getRetentionDuration() == null) ? 0 : getRetentionDuration().hashCode());
        hashCode = prime * hashCode + ((getRuleID() == null) ? 0 : getRuleID().hashCode());
        hashCode = prime * hashCode + ((getUnits() == null) ? 0 : getUnits().hashCode());
        return hashCode;
    }

    @Override
    public PITPolicyRule clone() {
        try {
            return (PITPolicyRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.PITPolicyRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
