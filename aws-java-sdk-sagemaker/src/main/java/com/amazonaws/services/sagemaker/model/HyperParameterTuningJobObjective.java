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
 * Defines the objective metric for a hyperparameter tuning job. Hyperparameter tuning uses the value of this metric to
 * evaluate the training jobs it launches, and returns the training job that results in either the highest or lowest
 * value for this metric, depending on the value you specify for the <code>Type</code> parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningJobObjective"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric.
     * @see HyperParameterTuningJobObjectiveType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * 
     * @return Whether to minimize or maximize the objective metric.
     * @see HyperParameterTuningJobObjectiveType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobObjectiveType
     */

    public HyperParameterTuningJobObjective withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Whether to minimize or maximize the objective metric.
     * </p>
     * 
     * @param type
     *        Whether to minimize or maximize the objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobObjectiveType
     */

    public HyperParameterTuningJobObjective withType(HyperParameterTuningJobObjectiveType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to use for the objective metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * 
     * @return The name of the metric to use for the objective metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric to use for the objective metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to use for the objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobObjective withMetricName(String metricName) {
        setMetricName(metricName);
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
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobObjective == false)
            return false;
        HyperParameterTuningJobObjective other = (HyperParameterTuningJobObjective) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningJobObjective clone() {
        try {
            return (HyperParameterTuningJobObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningJobObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
