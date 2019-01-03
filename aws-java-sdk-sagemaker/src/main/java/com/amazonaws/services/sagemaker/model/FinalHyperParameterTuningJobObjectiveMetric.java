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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Shows the final value for the objective metric for a training job that was launched by a hyperparameter tuning job.
 * You define the objective metric in the <code>HyperParameterTuningJobObjective</code> parameter of
 * <a>HyperParameterTuningJobConfig</a>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FinalHyperParameterTuningJobObjectiveMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FinalHyperParameterTuningJobObjectiveMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the objective metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The value of the objective metric.
     * </p>
     */
    private Float value;

    /**
     * <p>
     * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * @see HyperParameterTuningJobObjectiveType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * </p>
     * 
     * @return Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * @see HyperParameterTuningJobObjectiveType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobObjectiveType
     */

    public FinalHyperParameterTuningJobObjectiveMetric withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobObjectiveType
     */

    public FinalHyperParameterTuningJobObjectiveMetric withType(HyperParameterTuningJobObjectiveType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the objective metric.
     * </p>
     * 
     * @param metricName
     *        The name of the objective metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the objective metric.
     * </p>
     * 
     * @return The name of the objective metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the objective metric.
     * </p>
     * 
     * @param metricName
     *        The name of the objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinalHyperParameterTuningJobObjectiveMetric withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The value of the objective metric.
     * </p>
     * 
     * @param value
     *        The value of the objective metric.
     */

    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the objective metric.
     * </p>
     * 
     * @return The value of the objective metric.
     */

    public Float getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the objective metric.
     * </p>
     * 
     * @param value
     *        The value of the objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinalHyperParameterTuningJobObjectiveMetric withValue(Float value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FinalHyperParameterTuningJobObjectiveMetric == false)
            return false;
        FinalHyperParameterTuningJobObjectiveMetric other = (FinalHyperParameterTuningJobObjectiveMetric) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FinalHyperParameterTuningJobObjectiveMetric clone() {
        try {
            return (FinalHyperParameterTuningJobObjectiveMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FinalHyperParameterTuningJobObjectiveMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
