/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates how to transform ingested log events to metric data in a CloudWatch metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/MetricTransformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricTransformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     * similar. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     * >Namespaces</a>.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     * </p>
     */
    private String metricValue;
    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     * </p>
     */
    private Double defaultValue;
    /**
     * <p>
     * The fields to use as dimensions for the metric. One metric filter can include as many as three dimensions.
     * </p>
     * <important>
     * <p>
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not
     * specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as dimensions. Each
     * different value found for a dimension is treated as a separate metric and accrues charges as a separate custom
     * metric.
     * </p>
     * <p>
     * To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     * name/value pairs for the dimensions that you have specified within a certain amount of time.
     * </p>
     * <p>
     * You can also set up a billing alarm to alert you if your charges are higher than expected. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html">
     * Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     * </p>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> dimensions;
    /**
     * <p>
     * The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @return The name of the CloudWatch metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     * similar. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     * >Namespaces</a>.
     * </p>
     * 
     * @param metricNamespace
     *        A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     *        similar. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     *        >Namespaces</a>.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     * similar. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     * >Namespaces</a>.
     * </p>
     * 
     * @return A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that
     *         are similar. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     *         >Namespaces</a>.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     * similar. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     * >Namespaces</a>.
     * </p>
     * 
     * @param metricNamespace
     *        A custom namespace to contain your metric in CloudWatch. Use namespaces to group together metrics that are
     *        similar. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace"
     *        >Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     * </p>
     * 
     * @param metricValue
     *        The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     */

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     * </p>
     * 
     * @return The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     */

    public String getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     * </p>
     * 
     * @param metricValue
     *        The value to publish to the CloudWatch metric when a filter pattern matches a log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricValue(String metricValue) {
        setMetricValue(metricValue);
        return this;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     * </p>
     * 
     * @param defaultValue
     *        (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     */

    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     * </p>
     * 
     * @return (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     */

    public Double getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     * </p>
     * 
     * @param defaultValue
     *        (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withDefaultValue(Double defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The fields to use as dimensions for the metric. One metric filter can include as many as three dimensions.
     * </p>
     * <important>
     * <p>
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not
     * specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as dimensions. Each
     * different value found for a dimension is treated as a separate metric and accrues charges as a separate custom
     * metric.
     * </p>
     * <p>
     * To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     * name/value pairs for the dimensions that you have specified within a certain amount of time.
     * </p>
     * <p>
     * You can also set up a billing alarm to alert you if your charges are higher than expected. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html">
     * Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     * </p>
     * </important>
     * 
     * @return The fields to use as dimensions for the metric. One metric filter can include as many as three
     *         dimensions.</p> <important>
     *         <p>
     *         Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do
     *         not specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as
     *         dimensions. Each different value found for a dimension is treated as a separate metric and accrues
     *         charges as a separate custom metric.
     *         </p>
     *         <p>
     *         To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     *         name/value pairs for the dimensions that you have specified within a certain amount of time.
     *         </p>
     *         <p>
     *         You can also set up a billing alarm to alert you if your charges are higher than expected. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html"
     *         > Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     *         </p>
     */

    public java.util.Map<String, String> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The fields to use as dimensions for the metric. One metric filter can include as many as three dimensions.
     * </p>
     * <important>
     * <p>
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not
     * specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as dimensions. Each
     * different value found for a dimension is treated as a separate metric and accrues charges as a separate custom
     * metric.
     * </p>
     * <p>
     * To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     * name/value pairs for the dimensions that you have specified within a certain amount of time.
     * </p>
     * <p>
     * You can also set up a billing alarm to alert you if your charges are higher than expected. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html">
     * Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     * </p>
     * </important>
     * 
     * @param dimensions
     *        The fields to use as dimensions for the metric. One metric filter can include as many as three
     *        dimensions.</p> <important>
     *        <p>
     *        Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do
     *        not specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as
     *        dimensions. Each different value found for a dimension is treated as a separate metric and accrues charges
     *        as a separate custom metric.
     *        </p>
     *        <p>
     *        To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     *        name/value pairs for the dimensions that you have specified within a certain amount of time.
     *        </p>
     *        <p>
     *        You can also set up a billing alarm to alert you if your charges are higher than expected. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html"
     *        > Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     *        </p>
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(dimensions);
    }

    /**
     * <p>
     * The fields to use as dimensions for the metric. One metric filter can include as many as three dimensions.
     * </p>
     * <important>
     * <p>
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not
     * specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as dimensions. Each
     * different value found for a dimension is treated as a separate metric and accrues charges as a separate custom
     * metric.
     * </p>
     * <p>
     * To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     * name/value pairs for the dimensions that you have specified within a certain amount of time.
     * </p>
     * <p>
     * You can also set up a billing alarm to alert you if your charges are higher than expected. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html">
     * Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     * </p>
     * </important>
     * 
     * @param dimensions
     *        The fields to use as dimensions for the metric. One metric filter can include as many as three
     *        dimensions.</p> <important>
     *        <p>
     *        Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do
     *        not specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as
     *        dimensions. Each different value found for a dimension is treated as a separate metric and accrues charges
     *        as a separate custom metric.
     *        </p>
     *        <p>
     *        To help prevent accidental high charges, Amazon disables a metric filter if it generates 1000 different
     *        name/value pairs for the dimensions that you have specified within a certain amount of time.
     *        </p>
     *        <p>
     *        You can also set up a billing alarm to alert you if your charges are higher than expected. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html"
     *        > Creating a Billing Alarm to Monitor Your Estimated AWS Charges</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Add a single Dimensions entry
     *
     * @see MetricTransformation#withDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * </p>
     * 
     * @param unit
     *        The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * </p>
     * 
     * @return The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * </p>
     * 
     * @param unit
     *        The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricTransformation withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * </p>
     * 
     * @param unit
     *        The unit to assign to the metric. If you omit this, the unit is set as <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricTransformation withUnit(StandardUnit unit) {
        this.unit = unit.toString();
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace()).append(",");
        if (getMetricValue() != null)
            sb.append("MetricValue: ").append(getMetricValue()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricTransformation == false)
            return false;
        MetricTransformation other = (MetricTransformation) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public MetricTransformation clone() {
        try {
            return (MetricTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.MetricTransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
