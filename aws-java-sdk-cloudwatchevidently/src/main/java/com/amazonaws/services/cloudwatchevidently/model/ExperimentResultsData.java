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
 * A structure that contains experiment results for one metric that is monitored in the experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ExperimentResultsData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentResultsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The experiment statistic that these results pertain to.
     * </p>
     */
    private String resultStat;
    /**
     * <p>
     * The treatment, or variation, that returned the <code>values</code> in this structure.
     * </p>
     */
    private String treatmentName;
    /**
     * <p>
     * The values for the <code>metricName</code> that were recorded in the experiment.
     * </p>
     */
    private java.util.List<Double> values;

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

    public ExperimentResultsData withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The experiment statistic that these results pertain to.
     * </p>
     * 
     * @param resultStat
     *        The experiment statistic that these results pertain to.
     * @see ExperimentResultResponseType
     */

    public void setResultStat(String resultStat) {
        this.resultStat = resultStat;
    }

    /**
     * <p>
     * The experiment statistic that these results pertain to.
     * </p>
     * 
     * @return The experiment statistic that these results pertain to.
     * @see ExperimentResultResponseType
     */

    public String getResultStat() {
        return this.resultStat;
    }

    /**
     * <p>
     * The experiment statistic that these results pertain to.
     * </p>
     * 
     * @param resultStat
     *        The experiment statistic that these results pertain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentResultResponseType
     */

    public ExperimentResultsData withResultStat(String resultStat) {
        setResultStat(resultStat);
        return this;
    }

    /**
     * <p>
     * The experiment statistic that these results pertain to.
     * </p>
     * 
     * @param resultStat
     *        The experiment statistic that these results pertain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentResultResponseType
     */

    public ExperimentResultsData withResultStat(ExperimentResultResponseType resultStat) {
        this.resultStat = resultStat.toString();
        return this;
    }

    /**
     * <p>
     * The treatment, or variation, that returned the <code>values</code> in this structure.
     * </p>
     * 
     * @param treatmentName
     *        The treatment, or variation, that returned the <code>values</code> in this structure.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * <p>
     * The treatment, or variation, that returned the <code>values</code> in this structure.
     * </p>
     * 
     * @return The treatment, or variation, that returned the <code>values</code> in this structure.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * <p>
     * The treatment, or variation, that returned the <code>values</code> in this structure.
     * </p>
     * 
     * @param treatmentName
     *        The treatment, or variation, that returned the <code>values</code> in this structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentResultsData withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
        return this;
    }

    /**
     * <p>
     * The values for the <code>metricName</code> that were recorded in the experiment.
     * </p>
     * 
     * @return The values for the <code>metricName</code> that were recorded in the experiment.
     */

    public java.util.List<Double> getValues() {
        return values;
    }

    /**
     * <p>
     * The values for the <code>metricName</code> that were recorded in the experiment.
     * </p>
     * 
     * @param values
     *        The values for the <code>metricName</code> that were recorded in the experiment.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Double>(values);
    }

    /**
     * <p>
     * The values for the <code>metricName</code> that were recorded in the experiment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values for the <code>metricName</code> that were recorded in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentResultsData withValues(Double... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values for the <code>metricName</code> that were recorded in the experiment.
     * </p>
     * 
     * @param values
     *        The values for the <code>metricName</code> that were recorded in the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentResultsData withValues(java.util.Collection<Double> values) {
        setValues(values);
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
        if (getResultStat() != null)
            sb.append("ResultStat: ").append(getResultStat()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentResultsData == false)
            return false;
        ExperimentResultsData other = (ExperimentResultsData) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getResultStat() == null ^ this.getResultStat() == null)
            return false;
        if (other.getResultStat() != null && other.getResultStat().equals(this.getResultStat()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getResultStat() == null) ? 0 : getResultStat().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentResultsData clone() {
        try {
            return (ExperimentResultsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ExperimentResultsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
