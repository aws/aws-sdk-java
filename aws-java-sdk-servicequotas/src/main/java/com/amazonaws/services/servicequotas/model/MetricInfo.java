/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that uses CloudWatch metrics to gather data about the service quota.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/MetricInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the
     * namespace when you create a metric.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     * characteristics that describe it, and you can think of dimensions as categories for those characteristics. These
     * dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
     * </p>
     */
    private java.util.Map<String, String> metricDimensions;
    /**
     * <p>
     * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use
     * when comparing usage in the CloudWatch Metric against your Service Quota.
     * </p>
     */
    private String metricStatisticRecommendation;

    /**
     * <p>
     * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the
     * namespace when you create a metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name
     *        for the namespace when you create a metric.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the
     * namespace when you create a metric.
     * </p>
     * 
     * @return The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name
     *         for the namespace when you create a metric.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name for the
     * namespace when you create a metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the metric. The namespace is a container for CloudWatch metrics. You can specify a name
     *        for the namespace when you create a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     * </p>
     * 
     * @return The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that measures usage of a service quota. This is a required field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInfo withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     * characteristics that describe it, and you can think of dimensions as categories for those characteristics. These
     * dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
     * </p>
     * 
     * @return A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     *         characteristics that describe it, and you can think of dimensions as categories for those
     *         characteristics. These dimensions are part of the CloudWatch Metric Identity that measures usage against
     *         a particular service quota.
     */

    public java.util.Map<String, String> getMetricDimensions() {
        return metricDimensions;
    }

    /**
     * <p>
     * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     * characteristics that describe it, and you can think of dimensions as categories for those characteristics. These
     * dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
     * </p>
     * 
     * @param metricDimensions
     *        A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     *        characteristics that describe it, and you can think of dimensions as categories for those characteristics.
     *        These dimensions are part of the CloudWatch Metric Identity that measures usage against a particular
     *        service quota.
     */

    public void setMetricDimensions(java.util.Map<String, String> metricDimensions) {
        this.metricDimensions = metricDimensions;
    }

    /**
     * <p>
     * A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     * characteristics that describe it, and you can think of dimensions as categories for those characteristics. These
     * dimensions are part of the CloudWatch Metric Identity that measures usage against a particular service quota.
     * </p>
     * 
     * @param metricDimensions
     *        A dimension is a name/value pair that is part of the identity of a metric. Every metric has specific
     *        characteristics that describe it, and you can think of dimensions as categories for those characteristics.
     *        These dimensions are part of the CloudWatch Metric Identity that measures usage against a particular
     *        service quota.
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
     * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use
     * when comparing usage in the CloudWatch Metric against your Service Quota.
     * </p>
     * 
     * @param metricStatisticRecommendation
     *        Statistics are metric data aggregations over specified periods of time. This is the recommended statistic
     *        to use when comparing usage in the CloudWatch Metric against your Service Quota.
     */

    public void setMetricStatisticRecommendation(String metricStatisticRecommendation) {
        this.metricStatisticRecommendation = metricStatisticRecommendation;
    }

    /**
     * <p>
     * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use
     * when comparing usage in the CloudWatch Metric against your Service Quota.
     * </p>
     * 
     * @return Statistics are metric data aggregations over specified periods of time. This is the recommended statistic
     *         to use when comparing usage in the CloudWatch Metric against your Service Quota.
     */

    public String getMetricStatisticRecommendation() {
        return this.metricStatisticRecommendation;
    }

    /**
     * <p>
     * Statistics are metric data aggregations over specified periods of time. This is the recommended statistic to use
     * when comparing usage in the CloudWatch Metric against your Service Quota.
     * </p>
     * 
     * @param metricStatisticRecommendation
     *        Statistics are metric data aggregations over specified periods of time. This is the recommended statistic
     *        to use when comparing usage in the CloudWatch Metric against your Service Quota.
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
