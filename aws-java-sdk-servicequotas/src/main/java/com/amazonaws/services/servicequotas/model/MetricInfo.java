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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the CloudWatch metric that reflects quota usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/MetricInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The metric dimension. This is a name/value pair that is part of the identity of a metric.
     * </p>
     */
    private java.util.Map<String, String> metricDimensions;
    /**
     * <p>
     * The metric statistic that we recommend you use when determining quota usage.
     * </p>
     */
    private String metricStatisticRecommendation;

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the metric.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @return The namespace of the metric.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric dimension. This is a name/value pair that is part of the identity of a metric.
     * </p>
     * 
     * @return The metric dimension. This is a name/value pair that is part of the identity of a metric.
     */

    public java.util.Map<String, String> getMetricDimensions() {
        return metricDimensions;
    }

    /**
     * <p>
     * The metric dimension. This is a name/value pair that is part of the identity of a metric.
     * </p>
     * 
     * @param metricDimensions
     *        The metric dimension. This is a name/value pair that is part of the identity of a metric.
     */

    public void setMetricDimensions(java.util.Map<String, String> metricDimensions) {
        this.metricDimensions = metricDimensions;
    }

    /**
     * <p>
     * The metric dimension. This is a name/value pair that is part of the identity of a metric.
     * </p>
     * 
     * @param metricDimensions
     *        The metric dimension. This is a name/value pair that is part of the identity of a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricDimensions(java.util.Map<String, String> metricDimensions) {
        setMetricDimensions(metricDimensions);
        return this;
    }

    /**
     * Add a single MetricDimensions entry
     *
     * @see MetricInfo#withMetricDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo addMetricDimensionsEntry(String key, String value) {
        if (null == this.metricDimensions) {
            this.metricDimensions = new java.util.HashMap<String, String>();
        }
        if (this.metricDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metricDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MetricDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo clearMetricDimensionsEntries() {
        this.metricDimensions = null;
        return this;
    }

    /**
     * <p>
     * The metric statistic that we recommend you use when determining quota usage.
     * </p>
     * 
     * @param metricStatisticRecommendation
     *        The metric statistic that we recommend you use when determining quota usage.
     */

    public void setMetricStatisticRecommendation(String metricStatisticRecommendation) {
        this.metricStatisticRecommendation = metricStatisticRecommendation;
    }

    /**
     * <p>
     * The metric statistic that we recommend you use when determining quota usage.
     * </p>
     * 
     * @return The metric statistic that we recommend you use when determining quota usage.
     */

    public String getMetricStatisticRecommendation() {
        return this.metricStatisticRecommendation;
    }

    /**
     * <p>
     * The metric statistic that we recommend you use when determining quota usage.
     * </p>
     * 
     * @param metricStatisticRecommendation
     *        The metric statistic that we recommend you use when determining quota usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricStatisticRecommendation(String metricStatisticRecommendation) {
        setMetricStatisticRecommendation(metricStatisticRecommendation);
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
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricDimensions() != null)
            sb.append("MetricDimensions: ").append(getMetricDimensions()).append(",");
        if (getMetricStatisticRecommendation() != null)
            sb.append("MetricStatisticRecommendation: ").append(getMetricStatisticRecommendation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricInfo == false)
            return false;
        MetricInfo other = (MetricInfo) obj;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricDimensions() == null ^ this.getMetricDimensions() == null)
            return false;
        if (other.getMetricDimensions() != null && other.getMetricDimensions().equals(this.getMetricDimensions()) == false)
            return false;
        if (other.getMetricStatisticRecommendation() == null ^ this.getMetricStatisticRecommendation() == null)
            return false;
        if (other.getMetricStatisticRecommendation() != null
                && other.getMetricStatisticRecommendation().equals(this.getMetricStatisticRecommendation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricDimensions() == null) ? 0 : getMetricDimensions().hashCode());
        hashCode = prime * hashCode + ((getMetricStatisticRecommendation() == null) ? 0 : getMetricStatisticRecommendation().hashCode());
        return hashCode;
    }

    @Override
    public MetricInfo clone() {
        try {
            return (MetricInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.MetricInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
