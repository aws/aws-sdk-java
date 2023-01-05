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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure defines a metric that is being used to evaluate the variations during a launch or experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/MetricDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     * </p>
     */
    private String entityIdKey;
    /**
     * <p>
     * The EventBridge event pattern that defines how the metric is recorded.
     * </p>
     * <p>
     * For more information about EventBridge event patterns, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge event
     * patterns</a>.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The label for the units that the metric is measuring.
     * </p>
     */
    private String unitLabel;
    /**
     * <p>
     * The value that is tracked to produce the metric.
     * </p>
     */
    private String valueKey;

    /**
     * <p>
     * The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     * </p>
     * 
     * @param entityIdKey
     *        The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     */

    public void setEntityIdKey(String entityIdKey) {
        this.entityIdKey = entityIdKey;
    }

    /**
     * <p>
     * The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     * </p>
     * 
     * @return The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     */

    public String getEntityIdKey() {
        return this.entityIdKey;
    }

    /**
     * <p>
     * The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     * </p>
     * 
     * @param entityIdKey
     *        The entity, such as a user or session, that does an action that causes a metric value to be recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withEntityIdKey(String entityIdKey) {
        setEntityIdKey(entityIdKey);
        return this;
    }

    /**
     * <p>
     * The EventBridge event pattern that defines how the metric is recorded.
     * </p>
     * <p>
     * For more information about EventBridge event patterns, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge event
     * patterns</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param eventPattern
     *        The EventBridge event pattern that defines how the metric is recorded.</p>
     *        <p>
     *        For more information about EventBridge event patterns, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge
     *        event patterns</a>.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The EventBridge event pattern that defines how the metric is recorded.
     * </p>
     * <p>
     * For more information about EventBridge event patterns, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge event
     * patterns</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The EventBridge event pattern that defines how the metric is recorded.</p>
     *         <p>
     *         For more information about EventBridge event patterns, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge
     *         event patterns</a>.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The EventBridge event pattern that defines how the metric is recorded.
     * </p>
     * <p>
     * For more information about EventBridge event patterns, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge event
     * patterns</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param eventPattern
     *        The EventBridge event pattern that defines how the metric is recorded.</p>
     *        <p>
     *        For more information about EventBridge event patterns, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html">Amazon EventBridge
     *        event patterns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The label for the units that the metric is measuring.
     * </p>
     * 
     * @param unitLabel
     *        The label for the units that the metric is measuring.
     */

    public void setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
    }

    /**
     * <p>
     * The label for the units that the metric is measuring.
     * </p>
     * 
     * @return The label for the units that the metric is measuring.
     */

    public String getUnitLabel() {
        return this.unitLabel;
    }

    /**
     * <p>
     * The label for the units that the metric is measuring.
     * </p>
     * 
     * @param unitLabel
     *        The label for the units that the metric is measuring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withUnitLabel(String unitLabel) {
        setUnitLabel(unitLabel);
        return this;
    }

    /**
     * <p>
     * The value that is tracked to produce the metric.
     * </p>
     * 
     * @param valueKey
     *        The value that is tracked to produce the metric.
     */

    public void setValueKey(String valueKey) {
        this.valueKey = valueKey;
    }

    /**
     * <p>
     * The value that is tracked to produce the metric.
     * </p>
     * 
     * @return The value that is tracked to produce the metric.
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * <p>
     * The value that is tracked to produce the metric.
     * </p>
     * 
     * @param valueKey
     *        The value that is tracked to produce the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withValueKey(String valueKey) {
        setValueKey(valueKey);
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
        if (getEntityIdKey() != null)
            sb.append("EntityIdKey: ").append(getEntityIdKey()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUnitLabel() != null)
            sb.append("UnitLabel: ").append(getUnitLabel()).append(",");
        if (getValueKey() != null)
            sb.append("ValueKey: ").append(getValueKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDefinition == false)
            return false;
        MetricDefinition other = (MetricDefinition) obj;
        if (other.getEntityIdKey() == null ^ this.getEntityIdKey() == null)
            return false;
        if (other.getEntityIdKey() != null && other.getEntityIdKey().equals(this.getEntityIdKey()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUnitLabel() == null ^ this.getUnitLabel() == null)
            return false;
        if (other.getUnitLabel() != null && other.getUnitLabel().equals(this.getUnitLabel()) == false)
            return false;
        if (other.getValueKey() == null ^ this.getValueKey() == null)
            return false;
        if (other.getValueKey() != null && other.getValueKey().equals(this.getValueKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityIdKey() == null) ? 0 : getEntityIdKey().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUnitLabel() == null) ? 0 : getUnitLabel().hashCode());
        hashCode = prime * hashCode + ((getValueKey() == null) ? 0 : getValueKey().hashCode());
        return hashCode;
    }

    @Override
    public MetricDefinition clone() {
        try {
            return (MetricDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.MetricDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
