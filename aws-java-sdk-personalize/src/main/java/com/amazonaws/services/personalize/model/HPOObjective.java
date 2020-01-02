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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metric to optimize during hyperparameter optimization (HPO).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/HPOObjective" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HPOObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data type of the metric.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     */
    private String metricRegex;

    /**
     * <p>
     * The data type of the metric.
     * </p>
     * 
     * @param type
     *        The data type of the metric.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the metric.
     * </p>
     * 
     * @return The data type of the metric.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the metric.
     * </p>
     * 
     * @param type
     *        The data type of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HPOObjective withType(String type) {
        setType(type);
        return this;
    }

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

    public HPOObjective withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * 
     * @param metricRegex
     *        A regular expression for finding the metric in the training job logs.
     */

    public void setMetricRegex(String metricRegex) {
        this.metricRegex = metricRegex;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * 
     * @return A regular expression for finding the metric in the training job logs.
     */

    public String getMetricRegex() {
        return this.metricRegex;
    }

    /**
     * <p>
     * A regular expression for finding the metric in the training job logs.
     * </p>
     * 
     * @param metricRegex
     *        A regular expression for finding the metric in the training job logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HPOObjective withMetricRegex(String metricRegex) {
        setMetricRegex(metricRegex);
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
        if (getMetricRegex() != null)
            sb.append("MetricRegex: ").append(getMetricRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HPOObjective == false)
            return false;
        HPOObjective other = (HPOObjective) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricRegex() == null ^ this.getMetricRegex() == null)
            return false;
        if (other.getMetricRegex() != null && other.getMetricRegex().equals(this.getMetricRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricRegex() == null) ? 0 : getMetricRegex().hashCode());
        return hashCode;
    }

    @Override
    public HPOObjective clone() {
        try {
            return (HPOObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.HPOObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
