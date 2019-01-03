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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates how to transform ingested log eventsto metric data in a CloudWatch metric.
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
     * The namespace of the CloudWatch metric.
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
     * The namespace of the CloudWatch metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the CloudWatch metric.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * 
     * @return The namespace of the CloudWatch metric.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the CloudWatch metric.
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
            sb.append("DefaultValue: ").append(getDefaultValue());
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
