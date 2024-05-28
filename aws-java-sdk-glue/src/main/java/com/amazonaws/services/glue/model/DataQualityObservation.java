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
 * Describes the observation generated after evaluating the rules and analyzers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityObservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityObservation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the data quality observation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object of type <code>MetricBasedObservation</code> representing the observation that is based on evaluated
     * data quality metrics.
     * </p>
     */
    private MetricBasedObservation metricBasedObservation;

    /**
     * <p>
     * A description of the data quality observation.
     * </p>
     * 
     * @param description
     *        A description of the data quality observation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data quality observation.
     * </p>
     * 
     * @return A description of the data quality observation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data quality observation.
     * </p>
     * 
     * @param description
     *        A description of the data quality observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityObservation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object of type <code>MetricBasedObservation</code> representing the observation that is based on evaluated
     * data quality metrics.
     * </p>
     * 
     * @param metricBasedObservation
     *        An object of type <code>MetricBasedObservation</code> representing the observation that is based on
     *        evaluated data quality metrics.
     */

    public void setMetricBasedObservation(MetricBasedObservation metricBasedObservation) {
        this.metricBasedObservation = metricBasedObservation;
    }

    /**
     * <p>
     * An object of type <code>MetricBasedObservation</code> representing the observation that is based on evaluated
     * data quality metrics.
     * </p>
     * 
     * @return An object of type <code>MetricBasedObservation</code> representing the observation that is based on
     *         evaluated data quality metrics.
     */

    public MetricBasedObservation getMetricBasedObservation() {
        return this.metricBasedObservation;
    }

    /**
     * <p>
     * An object of type <code>MetricBasedObservation</code> representing the observation that is based on evaluated
     * data quality metrics.
     * </p>
     * 
     * @param metricBasedObservation
     *        An object of type <code>MetricBasedObservation</code> representing the observation that is based on
     *        evaluated data quality metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityObservation withMetricBasedObservation(MetricBasedObservation metricBasedObservation) {
        setMetricBasedObservation(metricBasedObservation);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMetricBasedObservation() != null)
            sb.append("MetricBasedObservation: ").append(getMetricBasedObservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityObservation == false)
            return false;
        DataQualityObservation other = (DataQualityObservation) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMetricBasedObservation() == null ^ this.getMetricBasedObservation() == null)
            return false;
        if (other.getMetricBasedObservation() != null && other.getMetricBasedObservation().equals(this.getMetricBasedObservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMetricBasedObservation() == null) ? 0 : getMetricBasedObservation().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityObservation clone() {
        try {
            return (DataQualityObservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityObservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
