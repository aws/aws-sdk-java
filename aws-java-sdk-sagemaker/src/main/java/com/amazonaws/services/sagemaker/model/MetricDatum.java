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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the metric for a candidate produced by an AutoML job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MetricDatum" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The value of the metric.
     * </p>
     */
    private Float value;
    /**
     * <p>
     * The dataset split from which the AutoML job produced the metric.
     * </p>
     */
    private String set;
    /**
     * <p>
     * The name of the standard metric.
     * </p>
     * <note>
     * <p>
     * For definitions of the standard metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics">
     * <code>Autopilot candidate metrics</code> </a>.
     * </p>
     * </note>
     */
    private String standardMetricName;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @see AutoMLMetricEnum
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
     * @see AutoMLMetricEnum
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
     * @see AutoMLMetricEnum
     */

    public MetricDatum withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public MetricDatum withMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     * 
     * @param value
     *        The value of the metric.
     */

    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     * 
     * @return The value of the metric.
     */

    public Float getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the metric.
     * </p>
     * 
     * @param value
     *        The value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValue(Float value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The dataset split from which the AutoML job produced the metric.
     * </p>
     * 
     * @param set
     *        The dataset split from which the AutoML job produced the metric.
     * @see MetricSetSource
     */

    public void setSet(String set) {
        this.set = set;
    }

    /**
     * <p>
     * The dataset split from which the AutoML job produced the metric.
     * </p>
     * 
     * @return The dataset split from which the AutoML job produced the metric.
     * @see MetricSetSource
     */

    public String getSet() {
        return this.set;
    }

    /**
     * <p>
     * The dataset split from which the AutoML job produced the metric.
     * </p>
     * 
     * @param set
     *        The dataset split from which the AutoML job produced the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricSetSource
     */

    public MetricDatum withSet(String set) {
        setSet(set);
        return this;
    }

    /**
     * <p>
     * The dataset split from which the AutoML job produced the metric.
     * </p>
     * 
     * @param set
     *        The dataset split from which the AutoML job produced the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricSetSource
     */

    public MetricDatum withSet(MetricSetSource set) {
        this.set = set.toString();
        return this;
    }

    /**
     * <p>
     * The name of the standard metric.
     * </p>
     * <note>
     * <p>
     * For definitions of the standard metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics">
     * <code>Autopilot candidate metrics</code> </a>.
     * </p>
     * </note>
     * 
     * @param standardMetricName
     *        The name of the standard metric. </p> <note>
     *        <p>
     *        For definitions of the standard metrics, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics"
     *        > <code>Autopilot candidate metrics</code> </a>.
     *        </p>
     * @see AutoMLMetricExtendedEnum
     */

    public void setStandardMetricName(String standardMetricName) {
        this.standardMetricName = standardMetricName;
    }

    /**
     * <p>
     * The name of the standard metric.
     * </p>
     * <note>
     * <p>
     * For definitions of the standard metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics">
     * <code>Autopilot candidate metrics</code> </a>.
     * </p>
     * </note>
     * 
     * @return The name of the standard metric. </p> <note>
     *         <p>
     *         For definitions of the standard metrics, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics"
     *         > <code>Autopilot candidate metrics</code> </a>.
     *         </p>
     * @see AutoMLMetricExtendedEnum
     */

    public String getStandardMetricName() {
        return this.standardMetricName;
    }

    /**
     * <p>
     * The name of the standard metric.
     * </p>
     * <note>
     * <p>
     * For definitions of the standard metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics">
     * <code>Autopilot candidate metrics</code> </a>.
     * </p>
     * </note>
     * 
     * @param standardMetricName
     *        The name of the standard metric. </p> <note>
     *        <p>
     *        For definitions of the standard metrics, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics"
     *        > <code>Autopilot candidate metrics</code> </a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricExtendedEnum
     */

    public MetricDatum withStandardMetricName(String standardMetricName) {
        setStandardMetricName(standardMetricName);
        return this;
    }

    /**
     * <p>
     * The name of the standard metric.
     * </p>
     * <note>
     * <p>
     * For definitions of the standard metrics, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics">
     * <code>Autopilot candidate metrics</code> </a>.
     * </p>
     * </note>
     * 
     * @param standardMetricName
     *        The name of the standard metric. </p> <note>
     *        <p>
     *        For definitions of the standard metrics, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-metrics"
     *        > <code>Autopilot candidate metrics</code> </a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricExtendedEnum
     */

    public MetricDatum withStandardMetricName(AutoMLMetricExtendedEnum standardMetricName) {
        this.standardMetricName = standardMetricName.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSet() != null)
            sb.append("Set: ").append(getSet()).append(",");
        if (getStandardMetricName() != null)
            sb.append("StandardMetricName: ").append(getStandardMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatum == false)
            return false;
        MetricDatum other = (MetricDatum) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSet() == null ^ this.getSet() == null)
            return false;
        if (other.getSet() != null && other.getSet().equals(this.getSet()) == false)
            return false;
        if (other.getStandardMetricName() == null ^ this.getStandardMetricName() == null)
            return false;
        if (other.getStandardMetricName() != null && other.getStandardMetricName().equals(this.getStandardMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSet() == null) ? 0 : getSet().hashCode());
        hashCode = prime * hashCode + ((getStandardMetricName() == null) ? 0 : getStandardMetricName().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatum clone() {
        try {
            return (MetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MetricDatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
