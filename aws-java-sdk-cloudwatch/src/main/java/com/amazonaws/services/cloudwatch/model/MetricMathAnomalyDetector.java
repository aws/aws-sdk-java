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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Indicates the CloudWatch math expression that provides the time series the anomaly detector uses as input. The
 * designated math expression must return a single time series.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricMathAnomalyDetector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricMathAnomalyDetector implements Serializable, Cloneable {

    /**
     * <p>
     * An array of metric data query structures that enables you to create an anomaly detector based on the result of a
     * metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs a math expression.
     * One item in <code>MetricDataQueries</code> is the expression that provides the time series that the anomaly
     * detector uses as input. Designate the expression by setting <code>ReturnData</code> to <code>true</code> for this
     * object in the array. For all other expressions and metrics, set <code>ReturnData</code> to <code>false</code>.
     * The designated expression must return a single time series.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDataQuery> metricDataQueries;

    /**
     * <p>
     * An array of metric data query structures that enables you to create an anomaly detector based on the result of a
     * metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs a math expression.
     * One item in <code>MetricDataQueries</code> is the expression that provides the time series that the anomaly
     * detector uses as input. Designate the expression by setting <code>ReturnData</code> to <code>true</code> for this
     * object in the array. For all other expressions and metrics, set <code>ReturnData</code> to <code>false</code>.
     * The designated expression must return a single time series.
     * </p>
     * 
     * @return An array of metric data query structures that enables you to create an anomaly detector based on the
     *         result of a metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs
     *         a math expression. One item in <code>MetricDataQueries</code> is the expression that provides the time
     *         series that the anomaly detector uses as input. Designate the expression by setting
     *         <code>ReturnData</code> to <code>true</code> for this object in the array. For all other expressions and
     *         metrics, set <code>ReturnData</code> to <code>false</code>. The designated expression must return a
     *         single time series.
     */

    public java.util.List<MetricDataQuery> getMetricDataQueries() {
        if (metricDataQueries == null) {
            metricDataQueries = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>();
        }
        return metricDataQueries;
    }

    /**
     * <p>
     * An array of metric data query structures that enables you to create an anomaly detector based on the result of a
     * metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs a math expression.
     * One item in <code>MetricDataQueries</code> is the expression that provides the time series that the anomaly
     * detector uses as input. Designate the expression by setting <code>ReturnData</code> to <code>true</code> for this
     * object in the array. For all other expressions and metrics, set <code>ReturnData</code> to <code>false</code>.
     * The designated expression must return a single time series.
     * </p>
     * 
     * @param metricDataQueries
     *        An array of metric data query structures that enables you to create an anomaly detector based on the
     *        result of a metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs
     *        a math expression. One item in <code>MetricDataQueries</code> is the expression that provides the time
     *        series that the anomaly detector uses as input. Designate the expression by setting
     *        <code>ReturnData</code> to <code>true</code> for this object in the array. For all other expressions and
     *        metrics, set <code>ReturnData</code> to <code>false</code>. The designated expression must return a single
     *        time series.
     */

    public void setMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        if (metricDataQueries == null) {
            this.metricDataQueries = null;
            return;
        }

        this.metricDataQueries = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metricDataQueries);
    }

    /**
     * <p>
     * An array of metric data query structures that enables you to create an anomaly detector based on the result of a
     * metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs a math expression.
     * One item in <code>MetricDataQueries</code> is the expression that provides the time series that the anomaly
     * detector uses as input. Designate the expression by setting <code>ReturnData</code> to <code>true</code> for this
     * object in the array. For all other expressions and metrics, set <code>ReturnData</code> to <code>false</code>.
     * The designated expression must return a single time series.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataQueries(java.util.Collection)} or {@link #withMetricDataQueries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDataQueries
     *        An array of metric data query structures that enables you to create an anomaly detector based on the
     *        result of a metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs
     *        a math expression. One item in <code>MetricDataQueries</code> is the expression that provides the time
     *        series that the anomaly detector uses as input. Designate the expression by setting
     *        <code>ReturnData</code> to <code>true</code> for this object in the array. For all other expressions and
     *        metrics, set <code>ReturnData</code> to <code>false</code>. The designated expression must return a single
     *        time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricMathAnomalyDetector withMetricDataQueries(MetricDataQuery... metricDataQueries) {
        if (this.metricDataQueries == null) {
            setMetricDataQueries(new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metricDataQueries.length));
        }
        for (MetricDataQuery ele : metricDataQueries) {
            this.metricDataQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of metric data query structures that enables you to create an anomaly detector based on the result of a
     * metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs a math expression.
     * One item in <code>MetricDataQueries</code> is the expression that provides the time series that the anomaly
     * detector uses as input. Designate the expression by setting <code>ReturnData</code> to <code>true</code> for this
     * object in the array. For all other expressions and metrics, set <code>ReturnData</code> to <code>false</code>.
     * The designated expression must return a single time series.
     * </p>
     * 
     * @param metricDataQueries
     *        An array of metric data query structures that enables you to create an anomaly detector based on the
     *        result of a metric math expression. Each item in <code>MetricDataQueries</code> gets a metric or performs
     *        a math expression. One item in <code>MetricDataQueries</code> is the expression that provides the time
     *        series that the anomaly detector uses as input. Designate the expression by setting
     *        <code>ReturnData</code> to <code>true</code> for this object in the array. For all other expressions and
     *        metrics, set <code>ReturnData</code> to <code>false</code>. The designated expression must return a single
     *        time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricMathAnomalyDetector withMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        setMetricDataQueries(metricDataQueries);
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
        if (getMetricDataQueries() != null)
            sb.append("MetricDataQueries: ").append(getMetricDataQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricMathAnomalyDetector == false)
            return false;
        MetricMathAnomalyDetector other = (MetricMathAnomalyDetector) obj;
        if (other.getMetricDataQueries() == null ^ this.getMetricDataQueries() == null)
            return false;
        if (other.getMetricDataQueries() != null && other.getMetricDataQueries().equals(this.getMetricDataQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricDataQueries() == null) ? 0 : getMetricDataQueries().hashCode());
        return hashCode;
    }

    @Override
    public MetricMathAnomalyDetector clone() {
        try {
            return (MetricMathAnomalyDetector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
