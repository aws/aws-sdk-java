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
 * A structure that defines a metric to be used to monitor performance of the variations during a launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/MetricMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricMonitor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that defines the metric.
     * </p>
     */
    private MetricDefinition metricDefinition;

    /**
     * <p>
     * A structure that defines the metric.
     * </p>
     * 
     * @param metricDefinition
     *        A structure that defines the metric.
     */

    public void setMetricDefinition(MetricDefinition metricDefinition) {
        this.metricDefinition = metricDefinition;
    }

    /**
     * <p>
     * A structure that defines the metric.
     * </p>
     * 
     * @return A structure that defines the metric.
     */

    public MetricDefinition getMetricDefinition() {
        return this.metricDefinition;
    }

    /**
     * <p>
     * A structure that defines the metric.
     * </p>
     * 
     * @param metricDefinition
     *        A structure that defines the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricMonitor withMetricDefinition(MetricDefinition metricDefinition) {
        setMetricDefinition(metricDefinition);
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
        if (getMetricDefinition() != null)
            sb.append("MetricDefinition: ").append(getMetricDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricMonitor == false)
            return false;
        MetricMonitor other = (MetricMonitor) obj;
        if (other.getMetricDefinition() == null ^ this.getMetricDefinition() == null)
            return false;
        if (other.getMetricDefinition() != null && other.getMetricDefinition().equals(this.getMetricDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricDefinition() == null) ? 0 : getMetricDefinition().hashCode());
        return hashCode;
    }

    @Override
    public MetricMonitor clone() {
        try {
            return (MetricMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.MetricMonitorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
