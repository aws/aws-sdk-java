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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a mapping between a <code>Metric</code> and <code>MetricAggregation</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ExportMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportMetric implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String aggregation;

    /**
     * @param name
     * @see Metric
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * @see Metric
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public ExportMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public ExportMetric withName(Metric name) {
        this.name = name.toString();
        return this;
    }

    /**
     * @param aggregation
     * @see MetricAggregation
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * @return
     * @see MetricAggregation
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * @param aggregation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricAggregation
     */

    public ExportMetric withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * @param aggregation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricAggregation
     */

    public ExportMetric withAggregation(MetricAggregation aggregation) {
        this.aggregation = aggregation.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportMetric == false)
            return false;
        ExportMetric other = (ExportMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        return hashCode;
    }

    @Override
    public ExportMetric clone() {
        try {
            return (ExportMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ExportMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
