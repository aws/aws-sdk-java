/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure contains a metric namespace and optionally, a list of metric names, to either include in a metric
 * stream or exclude from a metric stream.
 * </p>
 * <p>
 * A metric stream's filters can include up to 1000 total names. This limit applies to the sum of namespace names and
 * metric names in the filters. For example, this could include 10 metric namespace filters with 99 metrics each, or 20
 * namespace filters with 49 metrics specified in each filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricStreamFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric namespace for this filter.
     * </p>
     * <p>
     * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at least
     * one non-whitespace character.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The names of the metrics to either include or exclude from the metric stream.
     * </p>
     * <p>
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this
     * filter is specified as an exclude filter or an include filter.
     * </p>
     * <p>
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must
     * contain at least one non-whitespace character.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> metricNames;

    /**
     * <p>
     * The name of the metric namespace for this filter.
     * </p>
     * <p>
     * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at least
     * one non-whitespace character.
     * </p>
     * 
     * @param namespace
     *        The name of the metric namespace for this filter.</p>
     *        <p>
     *        The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at
     *        least one non-whitespace character.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name of the metric namespace for this filter.
     * </p>
     * <p>
     * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at least
     * one non-whitespace character.
     * </p>
     * 
     * @return The name of the metric namespace for this filter.</p>
     *         <p>
     *         The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain
     *         at least one non-whitespace character.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name of the metric namespace for this filter.
     * </p>
     * <p>
     * The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at least
     * one non-whitespace character.
     * </p>
     * 
     * @param namespace
     *        The name of the metric namespace for this filter.</p>
     *        <p>
     *        The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at
     *        least one non-whitespace character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamFilter withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The names of the metrics to either include or exclude from the metric stream.
     * </p>
     * <p>
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this
     * filter is specified as an exclude filter or an include filter.
     * </p>
     * <p>
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must
     * contain at least one non-whitespace character.
     * </p>
     * 
     * @return The names of the metrics to either include or exclude from the metric stream. </p>
     *         <p>
     *         If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether
     *         this filter is specified as an exclude filter or an include filter.
     *         </p>
     *         <p>
     *         Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric
     *         name must contain at least one non-whitespace character.
     */

    public java.util.List<String> getMetricNames() {
        if (metricNames == null) {
            metricNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metricNames;
    }

    /**
     * <p>
     * The names of the metrics to either include or exclude from the metric stream.
     * </p>
     * <p>
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this
     * filter is specified as an exclude filter or an include filter.
     * </p>
     * <p>
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must
     * contain at least one non-whitespace character.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics to either include or exclude from the metric stream. </p>
     *        <p>
     *        If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether
     *        this filter is specified as an exclude filter or an include filter.
     *        </p>
     *        <p>
     *        Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric
     *        name must contain at least one non-whitespace character.
     */

    public void setMetricNames(java.util.Collection<String> metricNames) {
        if (metricNames == null) {
            this.metricNames = null;
            return;
        }

        this.metricNames = new com.amazonaws.internal.SdkInternalList<String>(metricNames);
    }

    /**
     * <p>
     * The names of the metrics to either include or exclude from the metric stream.
     * </p>
     * <p>
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this
     * filter is specified as an exclude filter or an include filter.
     * </p>
     * <p>
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must
     * contain at least one non-whitespace character.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricNames(java.util.Collection)} or {@link #withMetricNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics to either include or exclude from the metric stream. </p>
     *        <p>
     *        If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether
     *        this filter is specified as an exclude filter or an include filter.
     *        </p>
     *        <p>
     *        Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric
     *        name must contain at least one non-whitespace character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamFilter withMetricNames(String... metricNames) {
        if (this.metricNames == null) {
            setMetricNames(new com.amazonaws.internal.SdkInternalList<String>(metricNames.length));
        }
        for (String ele : metricNames) {
            this.metricNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the metrics to either include or exclude from the metric stream.
     * </p>
     * <p>
     * If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this
     * filter is specified as an exclude filter or an include filter.
     * </p>
     * <p>
     * Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must
     * contain at least one non-whitespace character.
     * </p>
     * 
     * @param metricNames
     *        The names of the metrics to either include or exclude from the metric stream. </p>
     *        <p>
     *        If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether
     *        this filter is specified as an exclude filter or an include filter.
     *        </p>
     *        <p>
     *        Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric
     *        name must contain at least one non-whitespace character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamFilter withMetricNames(java.util.Collection<String> metricNames) {
        setMetricNames(metricNames);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricNames() != null)
            sb.append("MetricNames: ").append(getMetricNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricStreamFilter == false)
            return false;
        MetricStreamFilter other = (MetricStreamFilter) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricNames() == null ^ this.getMetricNames() == null)
            return false;
        if (other.getMetricNames() != null && other.getMetricNames().equals(this.getMetricNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricNames() == null) ? 0 : getMetricNames().hashCode());
        return hashCode;
    }

    @Override
    public MetricStreamFilter clone() {
        try {
            return (MetricStreamFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
