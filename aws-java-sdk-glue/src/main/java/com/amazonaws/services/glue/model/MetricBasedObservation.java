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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metric based observation generated based on evaluated data quality metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MetricBasedObservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricBasedObservation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality metric used for generating the observation.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality metric
     * value.
     * </p>
     */
    private DataQualityMetricValues metricValues;
    /**
     * <p>
     * A list of new data quality rules generated as part of the observation based on the data quality metric value.
     * </p>
     */
    private java.util.List<String> newRules;

    /**
     * <p>
     * The name of the data quality metric used for generating the observation.
     * </p>
     * 
     * @param metricName
     *        The name of the data quality metric used for generating the observation.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the data quality metric used for generating the observation.
     * </p>
     * 
     * @return The name of the data quality metric used for generating the observation.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the data quality metric used for generating the observation.
     * </p>
     * 
     * @param metricName
     *        The name of the data quality metric used for generating the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricBasedObservation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality metric
     * value.
     * </p>
     * 
     * @param metricValues
     *        An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality
     *        metric value.
     */

    public void setMetricValues(DataQualityMetricValues metricValues) {
        this.metricValues = metricValues;
    }

    /**
     * <p>
     * An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality metric
     * value.
     * </p>
     * 
     * @return An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality
     *         metric value.
     */

    public DataQualityMetricValues getMetricValues() {
        return this.metricValues;
    }

    /**
     * <p>
     * An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality metric
     * value.
     * </p>
     * 
     * @param metricValues
     *        An object of type <code>DataQualityMetricValues</code> representing the analysis of the data quality
     *        metric value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricBasedObservation withMetricValues(DataQualityMetricValues metricValues) {
        setMetricValues(metricValues);
        return this;
    }

    /**
     * <p>
     * A list of new data quality rules generated as part of the observation based on the data quality metric value.
     * </p>
     * 
     * @return A list of new data quality rules generated as part of the observation based on the data quality metric
     *         value.
     */

    public java.util.List<String> getNewRules() {
        return newRules;
    }

    /**
     * <p>
     * A list of new data quality rules generated as part of the observation based on the data quality metric value.
     * </p>
     * 
     * @param newRules
     *        A list of new data quality rules generated as part of the observation based on the data quality metric
     *        value.
     */

    public void setNewRules(java.util.Collection<String> newRules) {
        if (newRules == null) {
            this.newRules = null;
            return;
        }

        this.newRules = new java.util.ArrayList<String>(newRules);
    }

    /**
     * <p>
     * A list of new data quality rules generated as part of the observation based on the data quality metric value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewRules(java.util.Collection)} or {@link #withNewRules(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param newRules
     *        A list of new data quality rules generated as part of the observation based on the data quality metric
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricBasedObservation withNewRules(String... newRules) {
        if (this.newRules == null) {
            setNewRules(new java.util.ArrayList<String>(newRules.length));
        }
        for (String ele : newRules) {
            this.newRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of new data quality rules generated as part of the observation based on the data quality metric value.
     * </p>
     * 
     * @param newRules
     *        A list of new data quality rules generated as part of the observation based on the data quality metric
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricBasedObservation withNewRules(java.util.Collection<String> newRules) {
        setNewRules(newRules);
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
        if (getMetricValues() != null)
            sb.append("MetricValues: ").append(getMetricValues()).append(",");
        if (getNewRules() != null)
            sb.append("NewRules: ").append(getNewRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricBasedObservation == false)
            return false;
        MetricBasedObservation other = (MetricBasedObservation) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricValues() == null ^ this.getMetricValues() == null)
            return false;
        if (other.getMetricValues() != null && other.getMetricValues().equals(this.getMetricValues()) == false)
            return false;
        if (other.getNewRules() == null ^ this.getNewRules() == null)
            return false;
        if (other.getNewRules() != null && other.getNewRules().equals(this.getNewRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricValues() == null) ? 0 : getMetricValues().hashCode());
        hashCode = prime * hashCode + ((getNewRules() == null) ? 0 : getNewRules().hashCode());
        return hashCode;
    }

    @Override
    public MetricBasedObservation clone() {
        try {
            return (MetricBasedObservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MetricBasedObservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
