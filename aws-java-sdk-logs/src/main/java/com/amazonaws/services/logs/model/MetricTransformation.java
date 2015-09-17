/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class MetricTransformation implements Serializable, Cloneable {

    private String metricName;

    private String metricNamespace;

    private String metricValue;

    /**
     * Sets the value of the MetricName property for this object.
     * 
     * @param metricName
     *        The new value for the MetricName property for this object.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * Returns the value of the MetricName property for this object.
     * 
     * @return The value of the MetricName property for this object.
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Sets the value of the MetricName property for this object.
     * 
     * @param metricName
     *        The new value for the MetricName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * Sets the value of the MetricNamespace property for this object.
     * 
     * @param metricNamespace
     *        The new value for the MetricNamespace property for this object.
     */
    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * Returns the value of the MetricNamespace property for this object.
     * 
     * @return The value of the MetricNamespace property for this object.
     */
    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Sets the value of the MetricNamespace property for this object.
     * 
     * @param metricNamespace
     *        The new value for the MetricNamespace property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * Sets the value of the MetricValue property for this object.
     * 
     * @param metricValue
     *        The new value for the MetricValue property for this object.
     */
    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * Returns the value of the MetricValue property for this object.
     * 
     * @return The value of the MetricValue property for this object.
     */
    public String getMetricValue() {
        return this.metricValue;
    }

    /**
     * Sets the value of the MetricValue property for this object.
     * 
     * @param metricValue
     *        The new value for the MetricValue property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public MetricTransformation withMetricValue(String metricValue) {
        setMetricValue(metricValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("MetricName: " + getMetricName() + ",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: " + getMetricNamespace() + ",");
        if (getMetricValue() != null)
            sb.append("MetricValue: " + getMetricValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricTransformation == false)
            return false;
        MetricTransformation other = (MetricTransformation) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricNamespace() == null
                ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null
                && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null
                && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricNamespace() == null) ? 0 : getMetricNamespace()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricTransformation clone() {
        try {
            return (MetricTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}