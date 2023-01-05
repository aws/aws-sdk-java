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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the full name, description, and unit of a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ResponseResourceMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseResourceMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full name of the metric.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The description of the metric.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unit of the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The full name of the metric.
     * </p>
     * 
     * @param metric
     *        The full name of the metric.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The full name of the metric.
     * </p>
     * 
     * @return The full name of the metric.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The full name of the metric.
     * </p>
     * 
     * @param metric
     *        The full name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetric withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The description of the metric.
     * </p>
     * 
     * @param description
     *        The description of the metric.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the metric.
     * </p>
     * 
     * @return The description of the metric.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the metric.
     * </p>
     * 
     * @param description
     *        The description of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetric withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @return The unit of the metric.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetric withUnit(String unit) {
        setUnit(unit);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseResourceMetric == false)
            return false;
        ResponseResourceMetric other = (ResponseResourceMetric) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public ResponseResourceMetric clone() {
        try {
            return (ResponseResourceMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.ResponseResourceMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
