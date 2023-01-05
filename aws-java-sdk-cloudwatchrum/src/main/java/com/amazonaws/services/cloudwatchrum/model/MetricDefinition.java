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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that displays the definition of one extended metric that RUM sends to CloudWatch or CloudWatch Evidently.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html"> Additional
 * metrics that you can send to CloudWatch and CloudWatch Evidently</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/MetricDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch The value of this field is used only if the metric destination is <code>CloudWatch</code>. If the
     * metric destination is <code>Evidently</code>, the value of <code>DimensionKeys</code> is ignored.
     * </p>
     */
    private java.util.Map<String, String> dimensionKeys;
    /**
     * <p>
     * The pattern that defines the metric. RUM checks events that happen in a user's session against the pattern, and
     * events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The ID of this metric definition.
     * </p>
     */
    private String metricDefinitionId;
    /**
     * <p>
     * The name of the metric that is defined in this structure.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit that this
     * metric is measured in.
     * </p>
     */
    private String unitLabel;
    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     */
    private String valueKey;

    /**
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch The value of this field is used only if the metric destination is <code>CloudWatch</code>. If the
     * metric destination is <code>Evidently</code>, the value of <code>DimensionKeys</code> is ignored.
     * </p>
     * 
     * @return This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *         metric in CloudWatch The value of this field is used only if the metric destination is
     *         <code>CloudWatch</code>. If the metric destination is <code>Evidently</code>, the value of
     *         <code>DimensionKeys</code> is ignored.
     */

    public java.util.Map<String, String> getDimensionKeys() {
        return dimensionKeys;
    }

    /**
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch The value of this field is used only if the metric destination is <code>CloudWatch</code>. If the
     * metric destination is <code>Evidently</code>, the value of <code>DimensionKeys</code> is ignored.
     * </p>
     * 
     * @param dimensionKeys
     *        This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *        metric in CloudWatch The value of this field is used only if the metric destination is
     *        <code>CloudWatch</code>. If the metric destination is <code>Evidently</code>, the value of
     *        <code>DimensionKeys</code> is ignored.
     */

    public void setDimensionKeys(java.util.Map<String, String> dimensionKeys) {
        this.dimensionKeys = dimensionKeys;
    }

    /**
     * <p>
     * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in
     * CloudWatch The value of this field is used only if the metric destination is <code>CloudWatch</code>. If the
     * metric destination is <code>Evidently</code>, the value of <code>DimensionKeys</code> is ignored.
     * </p>
     * 
     * @param dimensionKeys
     *        This field is a map of field paths to dimension names. It defines the dimensions to associate with this
     *        metric in CloudWatch The value of this field is used only if the metric destination is
     *        <code>CloudWatch</code>. If the metric destination is <code>Evidently</code>, the value of
     *        <code>DimensionKeys</code> is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withDimensionKeys(java.util.Map<String, String> dimensionKeys) {
        setDimensionKeys(dimensionKeys);
        return this;
    }

    /**
     * Add a single DimensionKeys entry
     *
     * @see MetricDefinition#withDimensionKeys
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition addDimensionKeysEntry(String key, String value) {
        if (null == this.dimensionKeys) {
            this.dimensionKeys = new java.util.HashMap<String, String>();
        }
        if (this.dimensionKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensionKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DimensionKeys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition clearDimensionKeysEntries() {
        this.dimensionKeys = null;
        return this;
    }

    /**
     * <p>
     * The pattern that defines the metric. RUM checks events that happen in a user's session against the pattern, and
     * events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @param eventPattern
     *        The pattern that defines the metric. RUM checks events that happen in a user's session against the
     *        pattern, and events that match the pattern are sent to the metric destination.</p>
     *        <p>
     *        If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     *        <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The pattern that defines the metric. RUM checks events that happen in a user's session against the pattern, and
     * events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @return The pattern that defines the metric. RUM checks events that happen in a user's session against the
     *         pattern, and events that match the pattern are sent to the metric destination.</p>
     *         <p>
     *         If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     *         <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The pattern that defines the metric. RUM checks events that happen in a user's session against the pattern, and
     * events that match the pattern are sent to the metric destination.
     * </p>
     * <p>
     * If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     * <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * </p>
     * 
     * @param eventPattern
     *        The pattern that defines the metric. RUM checks events that happen in a user's session against the
     *        pattern, and events that match the pattern are sent to the metric destination.</p>
     *        <p>
     *        If the metrics destination is <code>CloudWatch</code> and the event also matches a value in
     *        <code>DimensionKeys</code>, then the metric is published with the specified dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The ID of this metric definition.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of this metric definition.
     */

    public void setMetricDefinitionId(String metricDefinitionId) {
        this.metricDefinitionId = metricDefinitionId;
    }

    /**
     * <p>
     * The ID of this metric definition.
     * </p>
     * 
     * @return The ID of this metric definition.
     */

    public String getMetricDefinitionId() {
        return this.metricDefinitionId;
    }

    /**
     * <p>
     * The ID of this metric definition.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of this metric definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withMetricDefinitionId(String metricDefinitionId) {
        setMetricDefinitionId(metricDefinitionId);
        return this;
    }

    /**
     * <p>
     * The name of the metric that is defined in this structure.
     * </p>
     * 
     * @param name
     *        The name of the metric that is defined in this structure.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric that is defined in this structure.
     * </p>
     * 
     * @return The name of the metric that is defined in this structure.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric that is defined in this structure.
     * </p>
     * 
     * @param name
     *        The name of the metric that is defined in this structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit that this
     * metric is measured in.
     * </p>
     * 
     * @param unitLabel
     *        Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit
     *        that this metric is measured in.
     */

    public void setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
    }

    /**
     * <p>
     * Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit that this
     * metric is measured in.
     * </p>
     * 
     * @return Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit
     *         that this metric is measured in.
     */

    public String getUnitLabel() {
        return this.unitLabel;
    }

    /**
     * <p>
     * Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit that this
     * metric is measured in.
     * </p>
     * 
     * @param unitLabel
     *        Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit
     *        that this metric is measured in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDefinition withUnitLabel(String unitLabel) {
        setUnitLabel(unitLabel);
        return this;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * 
     * @param valueKey
     *        The field within the event object that the metric value is sourced from.
     */

    public void setValueKey(String valueKey) {
        this.valueKey = valueKey;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * 
     * @return The field within the event object that the metric value is sourced from.
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * <p>
     * The field within the event object that the metric value is sourced from.
     * </p>
     * 
     * @param valueKey
     *        The field within the event object that the metric value is sourced from.
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
        if (getDimensionKeys() != null)
            sb.append("DimensionKeys: ").append(getDimensionKeys()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getMetricDefinitionId() != null)
            sb.append("MetricDefinitionId: ").append(getMetricDefinitionId()).append(",");
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
        if (other.getDimensionKeys() == null ^ this.getDimensionKeys() == null)
            return false;
        if (other.getDimensionKeys() != null && other.getDimensionKeys().equals(this.getDimensionKeys()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getMetricDefinitionId() == null ^ this.getMetricDefinitionId() == null)
            return false;
        if (other.getMetricDefinitionId() != null && other.getMetricDefinitionId().equals(this.getMetricDefinitionId()) == false)
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

        hashCode = prime * hashCode + ((getDimensionKeys() == null) ? 0 : getDimensionKeys().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitionId() == null) ? 0 : getMetricDefinitionId().hashCode());
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
        com.amazonaws.services.cloudwatchrum.model.transform.MetricDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
