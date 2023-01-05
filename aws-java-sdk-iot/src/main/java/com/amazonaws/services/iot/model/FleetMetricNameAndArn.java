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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name and ARN of a fleet metric.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetMetricNameAndArn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fleet metric name.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The fleet metric ARN.
     * </p>
     */
    private String metricArn;

    /**
     * <p>
     * The fleet metric name.
     * </p>
     * 
     * @param metricName
     *        The fleet metric name.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The fleet metric name.
     * </p>
     * 
     * @return The fleet metric name.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The fleet metric name.
     * </p>
     * 
     * @param metricName
     *        The fleet metric name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMetricNameAndArn withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The fleet metric ARN.
     * </p>
     * 
     * @param metricArn
     *        The fleet metric ARN.
     */

    public void setMetricArn(String metricArn) {
        this.metricArn = metricArn;
    }

    /**
     * <p>
     * The fleet metric ARN.
     * </p>
     * 
     * @return The fleet metric ARN.
     */

    public String getMetricArn() {
        return this.metricArn;
    }

    /**
     * <p>
     * The fleet metric ARN.
     * </p>
     * 
     * @param metricArn
     *        The fleet metric ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetMetricNameAndArn withMetricArn(String metricArn) {
        setMetricArn(metricArn);
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
        if (getMetricArn() != null)
            sb.append("MetricArn: ").append(getMetricArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetMetricNameAndArn == false)
            return false;
        FleetMetricNameAndArn other = (FleetMetricNameAndArn) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricArn() == null ^ this.getMetricArn() == null)
            return false;
        if (other.getMetricArn() != null && other.getMetricArn().equals(this.getMetricArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricArn() == null) ? 0 : getMetricArn().hashCode());
        return hashCode;
    }

    @Override
    public FleetMetricNameAndArn clone() {
        try {
            return (FleetMetricNameAndArn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.FleetMetricNameAndArnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
