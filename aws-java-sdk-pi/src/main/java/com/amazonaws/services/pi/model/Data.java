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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of data objects which provide details about source metrics. This field can be used to determine the PI metric to
 * render for the insight. This data type also includes static values for the metrics for the Insight that were
 * calculated and included in text and annotations on the DB load chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/Data" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Data implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This field determines the Performance Insights metric to render for the insight. The <code>name</code> field
     * refers to a Performance Insights metric.
     * </p>
     */
    private PerformanceInsightsMetric performanceInsightsMetric;

    /**
     * <p>
     * This field determines the Performance Insights metric to render for the insight. The <code>name</code> field
     * refers to a Performance Insights metric.
     * </p>
     * 
     * @param performanceInsightsMetric
     *        This field determines the Performance Insights metric to render for the insight. The <code>name</code>
     *        field refers to a Performance Insights metric.
     */

    public void setPerformanceInsightsMetric(PerformanceInsightsMetric performanceInsightsMetric) {
        this.performanceInsightsMetric = performanceInsightsMetric;
    }

    /**
     * <p>
     * This field determines the Performance Insights metric to render for the insight. The <code>name</code> field
     * refers to a Performance Insights metric.
     * </p>
     * 
     * @return This field determines the Performance Insights metric to render for the insight. The <code>name</code>
     *         field refers to a Performance Insights metric.
     */

    public PerformanceInsightsMetric getPerformanceInsightsMetric() {
        return this.performanceInsightsMetric;
    }

    /**
     * <p>
     * This field determines the Performance Insights metric to render for the insight. The <code>name</code> field
     * refers to a Performance Insights metric.
     * </p>
     * 
     * @param performanceInsightsMetric
     *        This field determines the Performance Insights metric to render for the insight. The <code>name</code>
     *        field refers to a Performance Insights metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Data withPerformanceInsightsMetric(PerformanceInsightsMetric performanceInsightsMetric) {
        setPerformanceInsightsMetric(performanceInsightsMetric);
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
        if (getPerformanceInsightsMetric() != null)
            sb.append("PerformanceInsightsMetric: ").append(getPerformanceInsightsMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Data == false)
            return false;
        Data other = (Data) obj;
        if (other.getPerformanceInsightsMetric() == null ^ this.getPerformanceInsightsMetric() == null)
            return false;
        if (other.getPerformanceInsightsMetric() != null && other.getPerformanceInsightsMetric().equals(this.getPerformanceInsightsMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPerformanceInsightsMetric() == null) ? 0 : getPerformanceInsightsMetric().hashCode());
        return hashCode;
    }

    @Override
    public Data clone() {
        try {
            return (Data) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
