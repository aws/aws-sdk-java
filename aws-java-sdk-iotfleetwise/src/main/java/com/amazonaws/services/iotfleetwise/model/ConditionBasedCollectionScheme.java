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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ConditionBasedCollectionScheme"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionBasedCollectionScheme implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logical expression used to recognize what data to collect. For example,
     * <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The minimum duration of time between two triggering events to collect data, in milliseconds.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     */
    private Long minimumTriggerIntervalMs;
    /**
     * <p>
     * Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>), or
     * specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users
     * aren't interested on triggering when the airbag is already exploded; they only care about the change from not
     * deployed =&gt; deployed.
     * </p>
     */
    private String triggerMode;
    /**
     * <p>
     * Specifies the version of the conditional expression language.
     * </p>
     */
    private Integer conditionLanguageVersion;

    /**
     * <p>
     * The logical expression used to recognize what data to collect. For example,
     * <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     * </p>
     * 
     * @param expression
     *        The logical expression used to recognize what data to collect. For example,
     *        <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The logical expression used to recognize what data to collect. For example,
     * <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     * </p>
     * 
     * @return The logical expression used to recognize what data to collect. For example,
     *         <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The logical expression used to recognize what data to collect. For example,
     * <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     * </p>
     * 
     * @param expression
     *        The logical expression used to recognize what data to collect. For example,
     *        <code>$variable.Vehicle.OutsideAirTemperature &gt;= 105.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionBasedCollectionScheme withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The minimum duration of time between two triggering events to collect data, in milliseconds.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @param minimumTriggerIntervalMs
     *        The minimum duration of time between two triggering events to collect data, in milliseconds.</p> <note>
     *        <p>
     *        If a signal changes often, you might want to collect data at a slower rate.
     *        </p>
     */

    public void setMinimumTriggerIntervalMs(Long minimumTriggerIntervalMs) {
        this.minimumTriggerIntervalMs = minimumTriggerIntervalMs;
    }

    /**
     * <p>
     * The minimum duration of time between two triggering events to collect data, in milliseconds.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @return The minimum duration of time between two triggering events to collect data, in milliseconds.</p> <note>
     *         <p>
     *         If a signal changes often, you might want to collect data at a slower rate.
     *         </p>
     */

    public Long getMinimumTriggerIntervalMs() {
        return this.minimumTriggerIntervalMs;
    }

    /**
     * <p>
     * The minimum duration of time between two triggering events to collect data, in milliseconds.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @param minimumTriggerIntervalMs
     *        The minimum duration of time between two triggering events to collect data, in milliseconds.</p> <note>
     *        <p>
     *        If a signal changes often, you might want to collect data at a slower rate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionBasedCollectionScheme withMinimumTriggerIntervalMs(Long minimumTriggerIntervalMs) {
        setMinimumTriggerIntervalMs(minimumTriggerIntervalMs);
        return this;
    }

    /**
     * <p>
     * Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>), or
     * specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users
     * aren't interested on triggering when the airbag is already exploded; they only care about the change from not
     * deployed =&gt; deployed.
     * </p>
     * 
     * @param triggerMode
     *        Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>
     *        ), or specify only when the condition first evaluates to false. For example, triggering on
     *        "AirbagDeployed"; Users aren't interested on triggering when the airbag is already exploded; they only
     *        care about the change from not deployed =&gt; deployed.
     * @see TriggerMode
     */

    public void setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
    }

    /**
     * <p>
     * Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>), or
     * specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users
     * aren't interested on triggering when the airbag is already exploded; they only care about the change from not
     * deployed =&gt; deployed.
     * </p>
     * 
     * @return Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (
     *         <code>RISING_EDGE</code>), or specify only when the condition first evaluates to false. For example,
     *         triggering on "AirbagDeployed"; Users aren't interested on triggering when the airbag is already
     *         exploded; they only care about the change from not deployed =&gt; deployed.
     * @see TriggerMode
     */

    public String getTriggerMode() {
        return this.triggerMode;
    }

    /**
     * <p>
     * Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>), or
     * specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users
     * aren't interested on triggering when the airbag is already exploded; they only care about the change from not
     * deployed =&gt; deployed.
     * </p>
     * 
     * @param triggerMode
     *        Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>
     *        ), or specify only when the condition first evaluates to false. For example, triggering on
     *        "AirbagDeployed"; Users aren't interested on triggering when the airbag is already exploded; they only
     *        care about the change from not deployed =&gt; deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerMode
     */

    public ConditionBasedCollectionScheme withTriggerMode(String triggerMode) {
        setTriggerMode(triggerMode);
        return this;
    }

    /**
     * <p>
     * Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>), or
     * specify only when the condition first evaluates to false. For example, triggering on "AirbagDeployed"; Users
     * aren't interested on triggering when the airbag is already exploded; they only care about the change from not
     * deployed =&gt; deployed.
     * </p>
     * 
     * @param triggerMode
     *        Whether to collect data for all triggering events (<code>ALWAYS</code>). Specify (<code>RISING_EDGE</code>
     *        ), or specify only when the condition first evaluates to false. For example, triggering on
     *        "AirbagDeployed"; Users aren't interested on triggering when the airbag is already exploded; they only
     *        care about the change from not deployed =&gt; deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerMode
     */

    public ConditionBasedCollectionScheme withTriggerMode(TriggerMode triggerMode) {
        this.triggerMode = triggerMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the version of the conditional expression language.
     * </p>
     * 
     * @param conditionLanguageVersion
     *        Specifies the version of the conditional expression language.
     */

    public void setConditionLanguageVersion(Integer conditionLanguageVersion) {
        this.conditionLanguageVersion = conditionLanguageVersion;
    }

    /**
     * <p>
     * Specifies the version of the conditional expression language.
     * </p>
     * 
     * @return Specifies the version of the conditional expression language.
     */

    public Integer getConditionLanguageVersion() {
        return this.conditionLanguageVersion;
    }

    /**
     * <p>
     * Specifies the version of the conditional expression language.
     * </p>
     * 
     * @param conditionLanguageVersion
     *        Specifies the version of the conditional expression language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionBasedCollectionScheme withConditionLanguageVersion(Integer conditionLanguageVersion) {
        setConditionLanguageVersion(conditionLanguageVersion);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getMinimumTriggerIntervalMs() != null)
            sb.append("MinimumTriggerIntervalMs: ").append(getMinimumTriggerIntervalMs()).append(",");
        if (getTriggerMode() != null)
            sb.append("TriggerMode: ").append(getTriggerMode()).append(",");
        if (getConditionLanguageVersion() != null)
            sb.append("ConditionLanguageVersion: ").append(getConditionLanguageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionBasedCollectionScheme == false)
            return false;
        ConditionBasedCollectionScheme other = (ConditionBasedCollectionScheme) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getMinimumTriggerIntervalMs() == null ^ this.getMinimumTriggerIntervalMs() == null)
            return false;
        if (other.getMinimumTriggerIntervalMs() != null && other.getMinimumTriggerIntervalMs().equals(this.getMinimumTriggerIntervalMs()) == false)
            return false;
        if (other.getTriggerMode() == null ^ this.getTriggerMode() == null)
            return false;
        if (other.getTriggerMode() != null && other.getTriggerMode().equals(this.getTriggerMode()) == false)
            return false;
        if (other.getConditionLanguageVersion() == null ^ this.getConditionLanguageVersion() == null)
            return false;
        if (other.getConditionLanguageVersion() != null && other.getConditionLanguageVersion().equals(this.getConditionLanguageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getMinimumTriggerIntervalMs() == null) ? 0 : getMinimumTriggerIntervalMs().hashCode());
        hashCode = prime * hashCode + ((getTriggerMode() == null) ? 0 : getTriggerMode().hashCode());
        hashCode = prime * hashCode + ((getConditionLanguageVersion() == null) ? 0 : getConditionLanguageVersion().hashCode());
        return hashCode;
    }

    @Override
    public ConditionBasedCollectionScheme clone() {
        try {
            return (ConditionBasedCollectionScheme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.ConditionBasedCollectionSchemeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
